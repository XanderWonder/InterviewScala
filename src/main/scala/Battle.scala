import scala.util.Random
import scala.io.StdIn.{readLine,readInt}

class Battle{
  val random: Random.type = scala.util.Random
  def playerChoice(){
    println(s"Player health:${Player.health}\nPlayer attacks strength:${Player.attacks}\nEnemy health:${Enemy.health}\nEnemy strength:${Enemy.attacks}")
    println("\nAction menu\n1. Attack\n2. Defend\n3. Spells \n4.Run away")
    this.action()
  }
  def action(){
    readInt match {
      case 1 => this.attack()
      case 2 => this.defend()
      case 3 => this.spells()
      case 4 => println("TACTICAL RETREAT")
      case _ => this.action()
    }
  }
  def attack(){
    println(s"\nYour initiative${Player.initiative}\nEnemy initiative${Enemy.initiative}")
    if(Player.initiative > Enemy.initiative){playerPhase()}else{enemyPhase()}
  }
  def playerPhase(){
    if(Player.hit > Enemy.hit){
      enemyLifecheck()
    }
    else{println("attack misses")
      gameReroll()}
  }
  def enemyPhase(){
    println(s"\nEnemy attacks strength${Enemy.attacks}\nHit ratio${Enemy.hit}\nPlayer hit ratio ${Player.hit}")
    if(Enemy.hit > Player.hit){
      playerArmourcheck()
    }else{println("Enemy misses")
      gameReroll()}
  }
  def playerArmourcheck(){
    println("Enemy lands hit")
    val dmg = Player.armour + Player.bonusArmour - Enemy.attacks
    if(dmg > 0){
      println(s"You took $dmg damage ")
      Player.health - dmg
      playerLifecheck()
    }else{println("You took no damage")
      gameReroll()}
  }
  def playerLifecheck(){
    Player.plHealth = Player.health - Enemy.attacks
    Player.health = Player.plHealth
    println(s"\nThe enemy has landed a clean hit ${Enemy.attacks}\nyour health is :${Player.health}")
    if(Player.health <= 0 || Player.plHealth <= 0){
      println("DEAD YOU LOSE")
    }else{
      println("\nContinue fighting (yes or no)")
      val choice = readLine
      if(choice == "Yes".toLowerCase()){
        gameReroll()
      }else{println("\nYOU RUN AWAY")}
    }
  }
  def enemyLifecheck(){
    println("Player attack lands")
    Enemy.enHealth = Enemy.health - Player.attacks
    Enemy.health = Enemy.enHealth
    println(s"Enemy health:${Enemy.enHealth}")
    if(Enemy.health <= 0 || Enemy.enHealth <= 0){println("\nYOU WIN")}
    else playerChoice()
  }
  def gameReroll(){
    Player.Reroll()
    Enemy.Reroll()
    playerChoice()
  }
  def defend(){
    Player.bonusArmour = random.nextInt(5)
    println(s"You gained bonus armour:${Player.bonusArmour}")
    this.action()
  }
  def spells(){
    println("Time to create a spell\n Enter 1")
    readInt match {
      case 1 => newSpells()
      case _ => println("INVALID")
    }
  }
  def newSpells(){
    println("Name your spell")
    val spellName = readLine()
    val concentration = random.nextInt(10)
    println(s"\nYou have made the spell $spellName\n$spellName damage:${Player.attacks}\n$spellName Spell concentration:$concentration")
    if (concentration < 8){
      println(s"You have failed to cast the spell\nEnemy has attacked you ${Enemy.attacks}")
      playerLifecheck()
    }else{enemyLifecheck}
  }
}

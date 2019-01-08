import scala.util.Random
import scala.io.StdIn.{readLine,readInt}

class Battle{
  val random: Random.type = scala.util.Random
  def playerChoice(): Unit ={
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
  def playerPhase(): Unit ={
    if(Player.hit > Enemy.hit){
      enemyLifecheck()
    }
    else{println("attack misses")
      Player.Reroll()
      Enemy.Reroll()
      playerChoice()}
  }
  def enemyPhase(): Unit ={
    println(s"\nEnemy attacks strength${Enemy.attacks}\nHit ratio${Enemy.hit}")
    if(Enemy.hit > Player.hit){
      playerArmourcheck()
      if(Player.health <= 0){println("\nYOU LOSE")}
    }else{println("Enemy misses")
    playerChoice()}
  }
  def playerArmourcheck(): Unit ={
    println("Enemy lands hit")
    println(s"health:${Player.health}")
    val dmg = Player.armour + Player.bonusArmour - Enemy.attacks
    if(dmg > 0){
      println(s"You took $dmg damage ")
      Player.health - dmg
      playerLifecheck()
    }else{println("You took no damage")
    playerChoice()}
  }
  def playerLifecheck(): Unit ={
    val halfDmg = Player.health - (Enemy.attacks / 2)
    Player.health - halfDmg
    if(Player.health <= 0){
      println("DEAD")
    }else{playerChoice()}
    println("\nContinue fighting (yes or no)")
    val choice = readLine
    if(choice == "Yes".toLowerCase()){
      Player.Reroll()
      Enemy.Reroll()
      this.action()
    }else{println("\nYOU RUN AWAY")}
  }
  def enemyLifecheck(): Unit ={
    println("Player attack lands")
    Enemy.enHealth = Enemy.health - Player.attacks
    Enemy.health = Enemy.enHealth
    println(s"Enemy health:${Enemy.enHealth}")
    if(Enemy.health <= 0 || Enemy.enHealth <= 0){println("\nYOU WIN")}
    else playerChoice()
  }
  def defend(){
    Player.bonusArmour = random.nextInt(5)
    println(s"You gained bonus armour:${Player.bonusArmour}")
    this.action()
  }
  def spells(){
      println("Time to create a spell")
    readInt match {
        case 1 => newSpells()
        case _ => println("INVALID")
      }
    }
  def newSpells(){
      println("Name your spell")
      val spellName = readLine()
      val damage = random.nextInt(20)
      val concentration = random.nextInt(10)
      println(s"\nYou have made $spellName\n$spellName damage:$damage\n$spellName cast time:$concentration")
      if (concentration < 8){}else{}
   }
}

import scala.util.Random
import scala.io.StdIn.{readLine,readInt}

class Battle{
  val r: Random.type = scala.util.Random
  def action(){
    println(s"Player health:${Player.health}\nPlayer attacks strength:${Player.attacks}\nEnemy health:${Enemy.health}\nEnemy strength:${Enemy.attacks}")
    println("\nAction menu\n1. Attack\n2. Defend\n3. Spells \n4.Run away")
    val choice = readInt
    choice match {
      case 1 => this.attack()
      case 2 => this.defend()
      case 3 => this.spells()
      case 4 => println("TACTICAL RETREAT")
      case _ => this.action()
    }
  }
  def attack(){
    println(s"\nYour initiative${Player.initiative}\nEnemy initiative${Enemy.initiative}")
    if(Player.initiative > Enemy.initiative){
      println(s"\nPlayer attacks strength:${Player.attacks}\nHit ratio:${Player.hit}")
      println(s"\nEnemy attack strength:${Enemy.attacks}\nHit ratio:${Enemy.hit}")
      if(Player.hit > Enemy.hit){
        println("Player attack lands")
        Enemy.enHealth = Enemy.health - Player.attacks
        Enemy.health = Enemy.enHealth
        println(s"Enemy health:${Enemy.enHealth}")
        if(Enemy.health <= 0 || Enemy.enHealth <= 0){println("\nYOU WIN")}
      }else{println("attack misses")}
    }else{
      println(s"\nEnemy attacks strength${Enemy.attacks}\nHit ratio${Enemy.hit}")
      if(Enemy.hit > Player.hit){
        println("Enemy lands hit")
        val dmg = Player.armour + Player.bonusArmour - Enemy.attacks
        if(dmg > 0){
          println(s"You took $dmg damage ")
          Player.health - dmg
        }else{println("You took no damage")}
        println(s"health:${Player.health}")
        if(Player.health <= 0){println("\nYOU LOSE")}
      }else{println("Enemy misses")}
    }
    if(Player.health <= 0){
      println("DEAD")
    }else{
      println("\nContinue fighting (yes or no)")
      val choice = readLine
      if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
        Player.Reroll()
        Enemy.Reroll()
        this.action()
      }else{println("\nYOU RUN AWAY")}
    }
  }
  def defend(){
    Player.bonusArmour = r.nextInt(5)
    println(s"You gained bonus armour:${Player.bonusArmour}")
    this.action()
  }
  def spells(){
    spellable()
    def spellable(){
      println("Choose a spell\n1.Fireball\n2.Aqua Slap\n3.Lighting Bolt")
      val choice = readInt
      choice match {
        case 1 => fireBall()
        case 2 => aquaSlap()
        case 3 => lightingBolt()
        case _ => spellable()
      }
    }
    def fireBall(){
      val r = scala.util.Random
      val damage = r.nextInt(20)
      val castTime = r.nextInt(10)
      println(s"\nYou choose Fireball\nFireball damage:$damage\nFireball cast time:$castTime")
      if (castTime < 8){
        println(s"\nSpell is still charging\nMiss Turn\nEnemy attacks${Enemy.attacks}")
        Player.health = Player.health - Enemy.attacks
        println(s"health:${Player.health}")
        if(Player.health <= 0){
          println("\nYOU LOSE")
        }else{fireBall()}
      }else{
        Enemy.enHealth = Enemy.health - damage
        Enemy.health = Enemy.enHealth
        println(s"Enemy health:${Enemy.enHealth}")
        if(Enemy.health <= 0 || Enemy.enHealth <= 0){
          println("\nYOU WIN")
        }else{this.action()}
      }
    }
    def aquaSlap(){
      val r = scala.util.Random
      val damage = r.nextInt(20)
      val castTime = r.nextInt(10)
      println(s"\nYou choose Aqua Slap\nAqua Slap damage:$damage\nAqua Slap cast time:$castTime")
      if (castTime < 8){
        println(s"\nSpell is still charging\nMiss Turn\nEnemy attacks${Player.attacks}")
        Player.health = Player.health - Enemy.attacks
        println(s"health:${Player.health}")
        if(Player.health <= 0){
          println("\nYOU LOSE")
        }else{aquaSlap()}
      }else{
        Enemy.enHealth = Enemy.health - damage
        Enemy.health = Enemy.enHealth
        println(s"Enemy health:${Enemy.enHealth}")
        if(Enemy.health <= 0 || Enemy.enHealth <= 0){
          println("\nYOU WIN")
        }else{this.action()}
      }
    }
    def lightingBolt(){
      val r = scala.util.Random
      val damage = r.nextInt(20)
      val castTime = r.nextInt(10)
      println(s"\nYou choose Lighting Bolt\nLighting Bolt damage:$damage\nLighting Bolt cast time:$castTime")
      if (castTime < 8){
        println(s"\nSpell is still charging\nMiss Turn\nEnemy attacks${Enemy.attacks}")
        Player.health = Player.health - Enemy.attacks
        println(s"health:${Player.health}")
        if(Player.health <= 0){
          println("\nYOU LOSE")
        }else{lightingBolt()}
      }else{
        Enemy.enHealth = Enemy.health - damage
        Enemy.health = Enemy.enHealth
        println(s"Enemy health:${Enemy.enHealth}")
        if(Enemy.health <= 0 || Enemy.enHealth <= 0){
          println("\nYOU WIN")
        }else{this.action()}
      }
    }
  }
}

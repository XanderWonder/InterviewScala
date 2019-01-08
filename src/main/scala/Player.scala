import scala.util.Random

object Player {
  val random: Random.type = scala.util.Random
  var health: Int =  random.nextInt(20)
  var attacks: Int =  random.nextInt(20)
  var hit: Int = random.nextInt(10)
  var initiative: Int =  random.nextInt(20)
  var armour: Int = random.nextInt(5)
  var bonusArmour = 0
  def Reroll(){
    initiative =  random.nextInt(20)
    attacks =  random.nextInt(20)
    hit = random.nextInt(10)
    bonusArmour = random.nextInt(5)
  }
}

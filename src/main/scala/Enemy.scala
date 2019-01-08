import scala.util.Random

object Enemy {
  val random: Random.type = scala.util.Random
  var health: Int =  random.nextInt(20)
  var attacks: Int =  random.nextInt(20)
  var hit: Int = random.nextInt(10)
  var initiative: Int =  random.nextInt(20)
  def Reroll(){
    initiative =  random.nextInt(20)
    attacks =  random.nextInt(20)
    hit = random.nextInt(10)
  }
  var enHealth = 0
}

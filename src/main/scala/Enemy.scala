import scala.util.Random

object Enemy {
  val r: Random.type = scala.util.Random
  var health: Int =  r.nextInt(20)
  var attacks: Int =  r.nextInt(20)
  var hit: Int = r.nextInt(10)
  var initiative: Int =  r.nextInt(20)
  def Reroll(){
    initiative =  r.nextInt(20)
    attacks =  r.nextInt(20)
    hit = r.nextInt(10)
  }
  var enHealth = 0
}

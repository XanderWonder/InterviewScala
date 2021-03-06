class Collection {
  def exSet(){
    val set = Set(1,2,3,4)
    val subSet = Set(5,7)

    println(subSet ++ set)
  }
  def patternMatch(food:String){
    food match{
      case "cake" => println(s"$food is totes here")
      case _ => println(s"$food is not food")
    }
  }
  def exMap(){
    val map = scala.collection.mutable.Map(1 -> "ha",2 -> "bo")
    val map2 = Map(3->"jo")

    map + (5 -> "to")
    map ++= map2
    map.put(10,"goo")
    println(map)

    val list = List(1,2,3)
    println(list map(value => value * 10))
  }
  def exFlatMap(){
    val list = List("Hello","World")
    println(list map(_.toList))
  }
  def exForEach(){
    var sum = 0
    val list = List(1,2,3,4,1,2)
    list foreach(element => sum += element)
    println(sum)
  }
}

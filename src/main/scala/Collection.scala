class Collection {
  def exSet(){
    val set = Set(1,2,3,4)
    val subSet = Set(5,7)
    println(subSet ++ set)
  }

  def patternMatch(keyNum:Int){
    val keymap = Map(1 -> 2, 2 -> 2).map{keyNum:(Int,Int) =>
      keyNum match {
        case (key,value) => println(s"$key and ${value*2}")
      }
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
    val list = List(1,2,3,4).map(_*2)
    println(list)
  }
  def exForEach(){
    var sum = 0
    val list = List(1,2,3,4,1,2)
    list foreach(element => sum += element)
    println(sum)
  }
  def exTuple(): Unit ={
    val tuple = (1,2)
    println(tuple._1 + 5)
    println(tuple._2 * 2)
  }
}

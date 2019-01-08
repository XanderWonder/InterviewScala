class Exercise {
  def FirstSolution(){
    val arrayRange = (1 to 99).toArray[Int]
    arrayRange.reverse.foreach(arrayRange => println(s"\n$arrayRange bottle of jojo on the wall\n$arrayRange bottle of jojo on the wall\ntake one down pass it around ${arrayRange - 1} bottles of jojo in the wall"))
  }
  def SecondSolution(beerNum:Int){
    println(s"\n$beerNum bottle of JOJO on the wall\n$beerNum bottle of JOJO on the wall")
    if(beerNum <= 0){
        println("NO MORE")
    }else Song(beerNum)
  }
  def Song(secondCounter:Int){
    val newCounter = secondCounter - 1
    println(s"take one down pass it around $newCounter bottle of JOJO in the wall ")
    if (newCounter <= 0){
      println("NO MORE")
    }else  SecondSolution(newCounter)
  }
  def DupArray(){
    val dupArray = Array.range(1,1000000)
    dupArray(14212) = 123412
    val place = dupArray(14212)
    for(i <- place until dupArray.length){
      if(dupArray(i) == dupArray(place)){
          println(s"location $place location ${dupArray.indexOf(i)}")
      }
    }
  }
}

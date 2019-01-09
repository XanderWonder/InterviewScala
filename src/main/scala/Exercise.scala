class Exercise {
  def firstSolution(){
    val arrayRange = (99 to 1 by -1).toArray[Int]
    arrayRange.foreach(arrayRange => println(s"\n$arrayRange bottle of jojo on the wall\n$arrayRange bottle of jojo on the wall\ntake one down pass it around ${arrayRange - 1} bottles of jojo in the wall"))
  }
  def secondSolution(beerNum:Int){
    println(s"\n$beerNum bottle of JOJO on the wall\n$beerNum bottle of JOJO on the wall")
    if(beerNum == 0){
        println("NO MORE")
    }else secondSolution(beerNum - 1)
  }
  def dupArray(){
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

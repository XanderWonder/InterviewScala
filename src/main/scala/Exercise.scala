class Exercise {
  def FirstSolution(){
    val arrayRange = (1 to 99).toArray[Int]
    arrayRange.reverse.foreach(arrayRange => println(s"\n$arrayRange bottle of jojo on the wall\n$arrayRange bottle of jojo on the wall\ntake one down pass it around ${arrayRange - 1} bottles of jojo in the wall"))
  }
  def SecondSolution(beerNum:Int){
    println(s"\n$beerNum bottle of JOJO on the wall\n$beerNum bottle of JOJO on the wall")
    if(beerNum == 0){
        println("NO MORE")
    }else SecondSolution(beerNum - 1)
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

import scala.io.Source

class WedExercise {
  def brokenKeyboard(wordEle:String){
    val fileName = Source.fromFile("C:/Users/Admin/Desktop/Scala/wordnames.txt").getLines.toList
    val wordElements = wordEle.substring(0,wordEle.length)
    for(line <- fileName){
      if(line.contains(wordElements)){
        println(line)
      }else{}
    }
  }

  def creditCard(){

  }
}

import scala.io.Source

class WedExercise {
  def BrokenKeyboard(numWord:String){
    val fileName = Source.fromFile("C:/Users/Admin/Desktop/Scala/wordnames.txt", "UTF-8").getLines.toList
    for(line <- fileName){
      if(line == numWord){
        println(line)
      }else{}
    }
  }
  def CreditCard(){

  }
}

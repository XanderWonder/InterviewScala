import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn._

class WedExercise {
  def brokenKeyboard(wordEle:Int){
    var emptyWord = ""
    for(reRun <- 1 to wordEle){
      if(0 < reRun){
        emptyWord = readLine
        bigWords(emptyWord)
      }
    }
  }

  def bigWords(words:String){
    val fileName = Source.fromFile("C:/Users/Admin/Desktop/Scala/wordnames.txt").getLines.toList
    for(line <- fileName){
      if(line.contains(words)){

        println(line)
      }
    }
  }

  def detailsCheck(cardNum:Long){
    var sumTotal = 0
    val cardNumList = List(cardNum.toString)
    for (id <- 1 to cardNumList.length) {
      var secondId = id
      val normalId = id
        if (secondId < 10){
          secondId = (secondId%10) + (secondId/10)
        }else{secondId = secondId * 2}
        sumTotal = normalId + secondId
        print(sumTotal)
//       if(sumTotal%10 == 0){
//         print("Tis Valid")
//       }else{print("Not Valid")}
    }
  }

  def workBrokenKey():Unit ={
    val listOfWords = List("apple", "hello", "aaaaaaaalep", "appleee")
    val keyboardKeys = "alep".toArray
    var longestWord = ""
    checkWord()

    def checkWord():Unit = {
      for (word <- listOfWords) {
        val containsLetters = ArrayBuffer[Boolean]()
        for (letter <- keyboardKeys) {
          if (word.contains(letter)) containsLetters.append(true)
          else containsLetters.append(false)
        }
        if (containsLetters.exists(value => value) && longestWord.length < word.length) {
          longestWord = word
        }
      }
      println(longestWord)
    }
  }
}
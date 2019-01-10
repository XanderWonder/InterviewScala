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
    var longWord = ""
    for(line <- fileName){
      if(line.contains(words)){
        println(line)
      }
    }
  }

  val cardDetails = List(1,1,1,1,1)
  cardDetails.foreach(cardDetails => detailsCheck(cardDetails))

  def detailsCheck(cardNum:Int){
    var unquieDetails = 0
    var normalDetails = 0
    var sumTotal = 0
    for (cardType <- 1 to cardNum){
      if(cardType%2 == 0){
        unquieDetails = cardNum * 2
      }else{
        normalDetails = cardNum
      }
      sumTotal = normalDetails + unquieDetails
      testCreditCard(sumTotal)
    }
  }

  def testCreditCard(identyCheck:Int): Unit ={
    if(identyCheck%10 == 0){
      println("Card details are valid")
    }else{println("Not Valid")}
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
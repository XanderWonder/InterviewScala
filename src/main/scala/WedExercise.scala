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
    val tWords = fileName
    for(line <- 1 to words.length){
      if(tWords.contains(words.substring(line - 1,line))){
        //longWord = tWords
        println(longWord)
      }
    }
  }

  def creditCard(card:Int){
    val cardDets = List(card)
    if(cardDets.length > 11){
      detailsCheck(cardDets)
    }else{println("None Left")}
  }

  def detailsCheck(cardNum:Int){
    var unquieDets = 0
    var normalDets = 0
    var sumTotal = 0
    for (cardType <- 1 to cardNum){
      if(cardNum%2 == 0){
        unquieDets = cardNum * 2
      }else{
        normalDets = cardNum
      }
      sumTotal = normalDets + unquieDets
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
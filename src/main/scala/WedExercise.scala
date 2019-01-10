import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn._

class WedExercise(){
  def brokenKeyboard(wordEle:Int){
    var emptyWord = ""
    for(i <- 0 until  wordEle){
        println("Enter words available")
        emptyWord = readLine().toLowerCase()
    }
      bigWords(emptyWord.toArray)
  }

  def bigWords(words:Array[Char]) : Unit ={
    var fileName = Source.fromFile("C:/Users/Admin/Desktop/Scala/wordnames.txt").getLines.toList
    ('a' to 'z').toArray.diff(words).foreach(keywords => fileName = fileName.filter(!_.contains(keywords)))
    println(fileName.sortBy(_.length).last)
  }

  def detailsCheck(cardNum:Long){
    var sumTotal = 0
    val cardNumList = List(cardNum.toString)
    for (id <- 1 to cardNumList.length) {
      var secondId = id
        if (secondId < 10){
          secondId = (secondId%10) + (secondId/10)
        }else{secondId = secondId * 2}
        sumTotal = id + secondId
        print(sumTotal)
       if(sumTotal%10 == 0){
         print("Tis Valid")
       }else{print("Not Valid")}
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
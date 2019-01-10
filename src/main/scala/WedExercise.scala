import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn._

class WedExercise {
  def brokenKeyboard(wordEle: Int) {
    var emptyWord = ""
    for (reRun <- 1 to wordEle) {
      if (0 < reRun) {
        emptyWord = readLine
        bigWords(emptyWord)
      }
    }
  }

  def bigWords(words: String) {
    val fileName = Source.fromFile("C:/Users/Admin/Desktop/Scala/wordnames.txt").getLines.toList
    for (line <- fileName) {
      if (line.contains(words)) {
        println(line)
      }
    }
  }

  def readCardNums(cardDets:Long): Unit ={
    val tcardDets = cardDets.toString
    val normalNums = scala.collection.mutable.ArrayBuffer[Int]()
    val specialNums = scala.collection.mutable.ArrayBuffer[Int]()
    var time = 0
    while(time <= tcardDets.length - 2){
      specialNums.append(tcardDets.substring(time,time + 1).toInt)
      normalNums.append(tcardDets.substring(time + 1,time + 2).toInt)
      time += 2
    }
    detailsCheck(specialNums,normalNums)
  }
  def detailsCheck(evenNums:ArrayBuffer[Int],oddNum:ArrayBuffer[Int]) {
    val calculation = scala.collection.mutable.ArrayBuffer[Int]()
    var adder = 0
    evenNums.foreach(numCheck =>{
      var matchCheck = numCheck * 2
      if(matchCheck < 9){matchCheck = matchCheck - 9}
      calculation.append(matchCheck)
    })
    calculation.foreach(plus => adder += plus)
    oddNum.foreach(plus => adder += plus)
    if(adder%10 == 0){print("Tis valid")}
    else print("Nope")
  }

  def workBrokenKey(): Unit = {
    val listOfWords = List("apple", "hello", "aaaaaaaalep", "appleee")
    val keyboardKeys = "alep".toArray
    var longestWord = ""
    checkWord()

    def checkWord(): Unit = {
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

  def readUserInput() = {
    println("Please input how many keyboards do you have")
    for (keys <- readKeyboards()) {
      betterCheckWord(keys.toArray)
    }
  }
  def readKeyboards() = {
    val keyboards = ArrayBuffer[String]()
    for (i <- 0 until readInt()) {
      println("Please type keys available")
      keyboards.append(readLine())
    }
    keyboards
  }
  def betterCheckWord(keysAvailable: Array[Char]): Unit = {
    var listOfWords = Source.fromFile("words.txt").getLines.toList
    ('a' to 'z')
      .toArray
      .diff(keysAvailable)
      .foreach(
        key => listOfWords = listOfWords.filter(!_.contains(key))
      )
    println(listOfWords.sortBy(_.length).last)
  }
}
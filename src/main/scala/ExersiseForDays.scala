import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class ExersiseForDays {
  val random: Random.type = scala.util.Random
  def factorial(num:Int): Unit ={
      var factorial = 1
      var multiplier = 1
      while(factorial < num){
        multiplier = multiplier + 1
        factorial = factorial * multiplier
      }
      if(factorial == num){println(s"This is a factorial of $multiplier and $num")}
      else{println("Nope")}
    }
  def morseCodeRegex(morseCode:String)(wordCode:String): Unit ={
    for(patternMatch <- morseCode.split(" ")){morseCodetoWord(patternMatch)}
    for(wordMatch <- wordCode.split("")){wordToMorse(wordMatch)}
  }
  def morseCodetoWord(code:String): Unit ={
    val fullWord = scala.collection.mutable.ArrayBuffer[String]()
    code match {
      case ".-" => fullWord.append("A")
      case "-..." => fullWord.append("B")
      case "-.-." => fullWord.append("C")
      case "-.." => fullWord.append("D")
      case "." => fullWord.append("E")
      case "..-." => fullWord.append("F")
      case "--." => fullWord.append("G")
      case "...." => fullWord.append("H")
      case ".." => fullWord.append("I")
      case ".---" => fullWord.append("J")
      case "-.-" => fullWord.append("K")
      case ".-.." => fullWord.append("L")
      case "--" => fullWord.append("M")
      case "" => fullWord.append("N")
      case "---" => fullWord.append("O")
      case ".--." => fullWord.append("P")
      case "--.-" => fullWord.append("Q")
      case ".-." => fullWord.append("R")
      case "..." => fullWord.append("S")
      case "-" => fullWord.append("T")
      case "..-" => fullWord.append("U")
      case "...-" => fullWord.append("V")
      case ".--" => fullWord.append("W")
      case "-..-" => fullWord.append("X")
      case "-.--" => fullWord.append("Y")
      case "--.." => fullWord.append("Z")
    }
    fullWord.foreach(println)
  }
  def wordToMorse(word:String): Unit ={
    val morseCode = scala.collection.mutable.ArrayBuffer[String]()
    word.toLowerCase() match {
      case "a" => morseCode.append(".-")
      case "b" => morseCode.append("-...")
      case "c" => morseCode.append("-.-.")
      case "d" => morseCode.append("-..")
      case "e" => morseCode.append(".")
      case "f" => morseCode.append("..-.")
      case "g" => morseCode.append("--.")
      case "h" => morseCode.append("....")
      case "i" => morseCode.append("..")
      case "j" => morseCode.append(".---")
      case "k" => morseCode.append("-.-")
      case "l" => morseCode.append(".-..")
      case "m" => morseCode.append("--")
      case "n" => morseCode.append("-.")
      case "o" => morseCode.append("---")
      case "p" => morseCode.append(".--.")
      case "q" => morseCode.append("--.-")
      case "r" => morseCode.append(".-.")
      case "s" => morseCode.append("...")
      case "t" => morseCode.append("-")
      case "u" => morseCode.append("..-")
      case "v" => morseCode.append("...-")
      case "w" => morseCode.append(".--")
      case "x" => morseCode.append("-..-")
      case "y" => morseCode.append("-.--")
      case "z" => morseCode.append("--..")
    }
    morseCode.foreach(println)
  }
  def playerAction(): String ={
    println("Choose your weapon\n1.Rock\n2.Paper\n3.Scissor")
    readLine().toLowerCase() match {
      case "rock" => aiAction("rock").toString
      case "paper" =>aiAction("paper").toString
      case "scissor" =>aiAction("scissor").toString
    }
  }
  def aiAction(playerAct:String): Unit ={
    var aiAct = ""
    random.nextInt(3) match {
      case 1 => aiAct = "rock"
      case 2 => aiAct = "paper"
      case 3 => aiAct = "scissor"
      case _ => aiAct = "invalid"
    }
    rpsRule(playerAct)(aiAct)
  }
  def rpsRule(playerChoice:String)(aiChoice:String): Unit ={
    var pscore = 0
    var aiscore = 0
    playerChoice.toLowerCase match {
      case "rock" => if(aiChoice == "scissors") aiscore = aiscore + 1 else pscore = pscore + 1
      case "paper" => if(aiChoice == "rock") aiscore = aiscore + 1 else pscore = pscore + 1
      case "scissor" => if(aiChoice == "paper") aiscore = aiscore + 1  else pscore = pscore + 1
      case "invalid" => println("Wrong combinations")
    }
    rpsGameWorld(pscore,aiscore)
  }
  def rpsGameWorld(playerScore:Int,aiScore:Int): Unit ={
    if(playerScore > aiScore) println("Ya win")
    else println("Ai Wins")
  }
  def wordsToCyhper(words:String): Unit ={
      for(letters <- words.split("")){cyhper(letters)}
  }
  def cyhper(words:String): Unit ={
    var cyherword = scala.collection.mutable.ArrayBuffer[String]()
    words match {
      case "a" => cyherword.append("z")
      case "b" =>cyherword.append("y")
      case "c" =>cyherword.append("x")
      case "d" =>cyherword.append("w")
      case "e" =>cyherword.append("v")
      case "f" =>cyherword.append("u")
      case "g" =>cyherword.append("t")
      case "h" =>cyherword.append("s")
      case "i" =>cyherword.append("r")
      case "j" =>cyherword.append("q")
      case "k" =>cyherword.append("p")
      case "l" =>cyherword.append("o")
      case "m" =>cyherword.append("n")
      case "n" =>cyherword.append("n")
      case "o" =>cyherword.append("l")
      case "p" =>cyherword.append("k")
      case "q" =>cyherword.append("j")
      case "r" =>cyherword.append("i")
      case "s" =>cyherword.append("h")
      case "t" =>cyherword.append("g")
      case "u" =>cyherword.append("f")
      case "v" =>cyherword.append("e")
      case "w" =>cyherword.append("d")
      case "x" =>cyherword.append("c")
      case "y" =>cyherword.append("b")
      case "z" =>cyherword.append("a")
      case  _  =>cyherword.append(" ")
    }
    println(cyherword)
  }
}

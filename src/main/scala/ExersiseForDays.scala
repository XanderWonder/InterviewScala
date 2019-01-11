import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer

class ExersiseForDays {
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
    println(fullWord)
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
    println(morseCode)
  }
  def playerAction(): String ={
    println("Choose your weapon\n1.Rocks\n2.Paper\n3.Scissor")
    readLine().toLowerCase() match {
      case "rock" => aiAction("rock").toString
      case "paper" =>aiAction("paper").toString
      case "scissor" =>aiAction("scissor").toString
    }
  }
  def aiAction(playerAct:String): Unit ={
    rpsRule(playerAct)("paper")
  }
  def rpsRule(playerChoice:String)(aiChoice:String): Unit ={
    var pscore = 0
    var aiscore = 0
    playerChoice.toLowerCase match {
      case "rock" => if(aiChoice == "scissors"){pscore = pscore + 1}else{aiscore = aiscore + 1}
      case "paper" => if(aiChoice == "rock"){pscore = pscore + 1}else{aiscore = aiscore + 1}
      case "scissors" => if(aiChoice == "paper"){pscore = pscore + 1}else{aiscore = aiscore + 1}
    }
    aiChoice.toLowerCase match{
      case "rock" => if(playerChoice == "scissors"){aiscore = aiscore + 1}else{pscore = pscore + 1}
      case "paper" => if(playerChoice == "rock"){aiscore = aiscore + 1}else{pscore = pscore + 1}
      case "scissors" => if(playerChoice == "paper"){aiscore = aiscore + 1}else{pscore = pscore + 1}
    }
    rpsGameWorld(pscore,aiscore)
  }
  def rpsGameWorld(playerScore:Int,aiScore:Int): Unit ={
    if(playerScore < aiScore) println("Ya win")
    else println("Ai Wins")
  }
}

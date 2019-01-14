import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class ExersiseForDays {
  val random: Random.type = scala.util.Random
  def factorial(num:Int):Int ={
      var factorial = 1
      var multiplier = 1
      while(factorial < num){
        multiplier = multiplier + 1
        factorial = factorial * multiplier
      }
      multiplier
//      if(factorial == num) println(s"This is a factorial of $multiplier and $num")
//      else println("Nope")
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
    fullWord.foreach(print)
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
    morseCode.foreach(print)
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
      case _ => aiAct = "invalid automatic win"
    }
    println(s"\nPlayer move ${playerAct}\nAi move ${aiAct}")
    rpsRule(playerAct)(aiAct)
  }
  def rpsRule(playerChoice:String)(aiChoice:String): Unit ={
    var pscore = 0
    var aiscore = 0
    if(playerChoice == aiChoice){println(s"You have drawn with the Ai, Time to go back choose again ${playerAction()}")}
    playerChoice.toLowerCase match {
      case "rock" => if(aiChoice == "paper") aiscore = aiscore + 1 else pscore = pscore + 1
      case "paper" => if(aiChoice == "scissor") aiscore = aiscore + 1 else pscore = pscore + 1
      case "scissor" => if(aiChoice == "rock") aiscore = aiscore + 1  else pscore = pscore + 1
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
    val cyherword = scala.collection.mutable.ArrayBuffer[String]()
    words match {
      case "a" =>cyherword.append(random.nextString(26))
      case "b" =>cyherword.append(random.nextString(26))
      case "c" =>cyherword.append(random.nextString(26))
      case "d" =>cyherword.append(random.nextString(26))
      case "e" =>cyherword.append(random.nextString(26))
      case "f" =>cyherword.append(random.nextString(26))
      case "g" =>cyherword.append(random.nextString(26))
      case "h" =>cyherword.append(random.nextString(26))
      case "i" =>cyherword.append(random.nextString(26))
      case "j" =>cyherword.append(random.nextString(26))
      case "k" =>cyherword.append(random.nextString(26))
      case "l" =>cyherword.append(random.nextString(26))
      case "m" =>cyherword.append(random.nextString(26))
      case "n" =>cyherword.append(random.nextString(26))
      case "o" =>cyherword.append(random.nextString(26))
      case "p" =>cyherword.append(random.nextString(26))
      case "q" =>cyherword.append(random.nextString(26))
      case "r" =>cyherword.append(random.nextString(26))
      case "s" =>cyherword.append(random.nextString(26))
      case "t" =>cyherword.append(random.nextString(26))
      case "u" =>cyherword.append(random.nextString(26))
      case "v" =>cyherword.append(random.nextString(26))
      case "w" =>cyherword.append(random.nextString(26))
      case "x" =>cyherword.append(random.nextString(26))
      case "y" =>cyherword.append(random.nextString(26))
      case "z" =>cyherword.append(random.nextString(26))
      case  _  =>cyherword.append(" ")
    }
    print(cyherword)
  }
  def palindrome(phrase:String): Unit ={
    val palindrome = phrase.reverse
    if(palindrome == phrase){println(s"this word is a palindrome $phrase")}
    else println(s"nope this word is not a palindrome $phrase")
  }
}

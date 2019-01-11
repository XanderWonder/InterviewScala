import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer

class ExersiseForDays {
    def number(num:Int): Unit ={
      var factorial = 1
      var multiplier = 1
      while(factorial < num){
        multiplier = multiplier + 1
        factorial = factorial * multiplier
      }
      if(factorial == num){println(s"This is a factorial of $multiplier and $num")}
      else{println("Nope")}
    }
  def morseCodeRegex(morseCode:String): Unit ={
    for(patternMatch <- morseCode.split("/")){morseCodetoWord(patternMatch)}
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
  def wordRegex(wordr:String): Unit ={

  }
  def wordToMorse(word:String): Unit ={
    val morseCode = scala.collection.mutable.ArrayBuffer[String]()
    word match {
      case "A" => morseCode.append(".-")
      case "B" => morseCode.append("-...")
      case "C" => morseCode.append("-.-.")
      case "D" => morseCode.append("-..")
      case "E" => morseCode.append(".")
      case "F" => morseCode.append("..-.")
      case "G" => morseCode.append("--.")
      case "H" => morseCode.append("....")
      case "I" => morseCode.append("..")
      case "J" => morseCode.append(".---")
      case "K" => morseCode.append("-.-")
      case "L" => morseCode.append(".-..")
      case "M" => morseCode.append("--")
      case "N" => morseCode.append("-.")
      case "O" => morseCode.append("---")
      case "P" => morseCode.append(".--.")
      case "Q" => morseCode.append("--.-")
      case "R" => morseCode.append(".-.")
      case "S" => morseCode.append("...")
      case "T" => morseCode.append("-")
      case "U" => morseCode.append("..-")
      case "V" => morseCode.append("...-")
      case "W" => morseCode.append(".--")
      case "X" => morseCode.append("-..-")
      case "Y" => morseCode.append("-.--")
      case "Z" => morseCode.append("--..")
    }
    println(morseCode)
  }
}

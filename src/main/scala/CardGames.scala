class CardGames {
  def blackjack(firstCard:Int,secondCard:Int){
    if(firstCard <= 21 && secondCard <= 21){
      if(firstCard > secondCard){
        print(firstCard)
      }else{
        print(secondCard)
      }
    }else{
      print(0)
    }
  }
  def unique(firstNum:Int,secondNum:Int,thirdNum:Int){
    var sum = firstNum + secondNum + thirdNum
    if(firstNum == secondNum && secondNum == thirdNum){
      sum = 0
      println(sum)
    }else{
      if(firstNum == secondNum){
        sum = sum - (firstNum + secondNum)
        println(sum)
      }
      if(firstNum == thirdNum){
        sum = sum - (firstNum + thirdNum)
        println(sum)
      }
      if(secondNum == thirdNum){
        sum = sum - (secondNum + thirdNum)
        println(sum)
      }
    }
    println(sum)
  }
}

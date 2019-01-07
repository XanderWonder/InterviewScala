class CardGames {
  def blackjack(a:Int,b:Int){
    val card1 = a
    val card2 = b
    if(card1 <= 21 && card2 <= 21){
      if(card1 > card2){
        print(card1)
      }else{
        print(card2)
      }
    }else{
      print(0)
    }
  }
  def unique(a:Int,b:Int,c:Int){
    val num1 = a
    val num2 = b
    val num3 = c
    var sum = num1 + num2 + num3
    if(num1 == num2 && num2 == num3){
      sum = 0
      println(sum)
    }else{
      if(num1 == num2){
        sum = sum - (num1 + num2)
        println(sum)
      }
      if(num1 == num3){
        sum = sum - (num1 + num3)
        println(sum)
      }
      if(num2 == num3){
        sum = sum - (num2 + num3)
        println(sum)
      }
    }
    println(sum)
  }
}

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
}

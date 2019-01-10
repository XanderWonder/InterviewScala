class ExersiseForDays {
    def number(num:Int): Unit ={
      var numCheck = 0
      var factorial = 1
      while(num < factorial){
        numCheck = factorial / num
        factorial += 1
      }
      if(numCheck == 1){println(s"This is a factorial of $factorial")}else{println("Nope")}
    }
}

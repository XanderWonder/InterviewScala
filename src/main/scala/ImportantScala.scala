class ImportantScala {
  def exHigherOrder(): Unit ={
    val money = Seq(50,20,10)
    val promotion = (multi:Int) => multi * 2
    val newAmount = money.map(promotion)
    print(newAmount)
  }
  def exCurrying(name:String)(age:Int): Unit ={
    print(s"$name $age")
  }
  def ExPartialApplied(): Unit ={
    val sum =(num1:Int,num2:Int,num3:Int) => num1 + num2 + num3
    val exSum = sum(1,2,_:Int)
    exSum(3)
    print(exSum)
  }
  def exClosure(): Unit ={
    val drivingAge = 18
    val isDrivingAge = (age:Int) => age >= drivingAge

    def printAll(function: Int => Boolean,age:Int): Unit ={
      println(s"This is the driving age $drivingAge," + function(age))
    }
    printAll(isDrivingAge,19)
  }
  def exPureFunc(num1:Int,num2:Int): Int = num1 + num2
  def exAnonymousFunc(): Unit ={
    val oneToTen = List.range(1,10)
    val even = oneToTen.filter((even:Int) => even%2 == 0)
    even.foreach(print)
  }
  def exLazyEvaluation(): Unit ={
    def lessThan35(num:Int):Boolean={
      println(s"$num is less than 35")
      num < 35
    }
    def moreThan35(num:Int):Boolean={
      println(s"$num is more than 35")
      num > 35
    }
    val numList = List(2,56,34,67)
    val firstCheck = numList.withFilter(lessThan35)
    val secondCheck = firstCheck.withFilter(moreThan35)
    secondCheck.foreach(println)
  }
}

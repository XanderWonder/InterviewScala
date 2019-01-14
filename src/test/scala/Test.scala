import helpers.UnitSpec

class Test extends UnitSpec{

  "A factorial fucntion takes in a number" should "return a factorial number and the original number" in {
    val tester = new ExersiseForDays()
    assert(tester.factorial(num = 120) == 5)
  }
  "A palindrome function that takes in a string phrase" should "return either a palindrome or a not palindrome" in {
    val tester = new ExersiseForDays
    assert(tester.palindrome("car".reverse) == "car")
  }
}

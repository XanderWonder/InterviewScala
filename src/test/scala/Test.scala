import helpers.UnitSpec

class Test extends UnitSpec{

  "A factorial fucntion takes in a number" should "return a factorial number and the original number" in {
    val tester = new ExersiseForDays()
    assert(tester.factorial(num = 120) == 5)
  }
  ""

}

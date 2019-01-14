 abstract class superClass{
    val messsage:String
  }
  class nextClass extends superClass{
    override val messsage: String = "here i am"
  }
  trait newClass extends superClass{
    def louder = messsage.toUpperCase
  }
  class useFunc extends nextClass with newClass

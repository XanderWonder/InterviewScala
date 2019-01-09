import scala.io.StdIn.{readLine,readInt}

class Story extends Battle {
  def start(){
    println("You wake up in a lush forest, as you look around you see three paths which leads to new places but you have no idea where these paths will lead you")
    println("which path do you choose?\n1.The grass path\n2.The dirt path\n3.The stone path")
    readInt match {
      case 1 => cave()
      case _ => println("Invalid or not implemented yet")
    }
  }
  def cave() {
    println("As you follow the grass path you see near the clearing is a cave\nDo you wish to enter the cave?")
    val choice = readLine
    if (choice.toLowerCase == "yes"){
      println("\nAs you enter the cave you felt a chill down you spine \nYou have been spotted by an enemy\nDo you wish to fight?")
      var choice = readLine
      if (choice.toLowerCase == "yes") {
        println("You decided to fight")
        playerChoice()
      } else {
        println("As you perform the solid snake and went further into the cave, you find some treasure chest\nDo you wish to open it?")
        choice = readLine
        if (choice.toLowerCase == "yes") {
          println("IT WAS ACTUALLY A MIMIC")
          playerChoice()
        }
      }
    } else {
      println("You return to the starting point")
      this.start()
    }
  }
}

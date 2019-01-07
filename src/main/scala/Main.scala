import scala.io.StdIn.readInt

object Main extends App{
 val session = new Story
 session.start()

 val games = new CardGames
 games.blackjack(readInt,readInt)

}

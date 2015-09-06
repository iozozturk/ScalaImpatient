import scala.io.Source

val home = System.getProperty("user.home")
Source.fromFile(s"$home/IdeaProjects/ScalaImpatient/files/01.txt").getLines().toArray[String].reverse.foreach(println)
//Source.fromURL(getClass.getResource("01.txt")).getLines().toArray[String].reverse.foreach(println)

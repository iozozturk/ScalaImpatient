class Creature {
  def range : Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 2
}

val cre = new Creature
cre.env

val ant = new Ant
ant.env
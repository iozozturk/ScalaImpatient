class Point(val x: Int, val y: Int) {
  override def toString = "Point(%d, %d)".format(x, y)
}

class LabeledPoint(val label: String, x: Int, y: Int) extends Point(x, y) {
  override def toString = { "Labeled Point(%s, %d, %d)".format(label, x, y) }
}
val point  = new Point(3,5)

val thatPoint = new LabeledPoint("that", 5, 6)
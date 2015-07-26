class Point(x:Int, y:Int){
  override def toString: String = "(" + x + "," + y + ")"
}

object Point {
  def apply(x: Int, y:Int) = new Point(x,y)
}

Point(2,4)

class Point2(x: Int, y:Int) extends java.awt.Point(x,y)

object Point2 {
  def apply(x: Int, y:Int) = new Point(x,y)
}

Point2(2,5)
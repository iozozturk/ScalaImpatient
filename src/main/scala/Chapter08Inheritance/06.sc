class Point(val x: Int, val y: Int) {
  override def toString = "Point(%d, %d)".format(x, y)
}

abstract class Shape {
  def centerPoint: Point

  override def toString = "Shape with center:%s".format(centerPoint.toString)
}

class Rectangle(override val centerPoint: Point, val diag: Point) extends Shape {
  override def toString = "Rectangle with center:%s and diag:%s".format(centerPoint, diag)
}

class Circle(override val centerPoint: Point, val radius: Int) extends Shape {
  override def toString = "Circle with center:%s and radius:%s".format(centerPoint, radius)
}

val rect = new Rectangle(new Point(0,0), new Point(3,4))

val circle = new Circle(new Point(1,1), 5)



import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with math.Ordered[Point] {
  def compare(that: Point): Int = {
    if (this.x <= that.x) {
      if (this.x == that.x) {
        if (this.y < that.y) -1
        else if (this.y > that.y) 1
        else 0
      } else -1
    } else 1
  }
//  override def toString = "[%d, %d]".format(getX(), getY())
}

val x1 = new OrderedPoint(1, 1)
val x2 = new OrderedPoint(1, -1)
val x3 = new OrderedPoint(2, 1)
println(x1 < x2)
println(x1 > x2)
println(x1 >= x3)
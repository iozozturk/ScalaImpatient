import java.awt.Rectangle

class Square(x: Int, y:Int, width:Int) extends Rectangle(x,y,width,width) {
  def this() = this(0,0,0)

  def this(width: Int) = this(0,0,width)
}

val sq = new Square()
val sq1 = new Square(3)
val sq2 = new Square(1,2,3)
import java.awt.Point

object Origin extends Point {

  this.setLocation(0,0)

  //you wouldnt move your origin once set
  override def move(x: Int, y: Int): Unit = {}

  override def setLocation(p: Point): Unit = {}

  override def setLocation(x: Int, y: Int): Unit = {}

  override def setLocation(x: Double, y: Double): Unit = {}
}
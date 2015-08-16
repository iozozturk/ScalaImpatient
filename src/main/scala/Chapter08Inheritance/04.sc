abstract class Item {
  def price: Int
  def descr: String
}

class SimpleItem(override val price: Int, override val descr:String) extends Item

class Bundle extends Item {

  var items: List[Item] = List()

  override def price: Int = items.map(_.price).sum

  override def descr: String = items.map(_.descr).mkString(", ")

  def addItems(item: Item) {
    items = item :: items
  }
}

val bundle = new Bundle
bundle.addItems(new SimpleItem(3, "Cake"))
bundle.addItems(new SimpleItem(5, "Coffee"))

bundle.price
bundle.descr
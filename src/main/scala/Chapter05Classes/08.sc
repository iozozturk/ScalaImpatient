class Car(val manufacturer: String, val model: String, val year: Int, var plate: String) {

  def this(manufacturer: String, model: String, year: Int) {
    this(manufacturer, model, year, "")
  }

  def this(manufacturer: String, model: String) {
    this(manufacturer, model, -1, "")
  }

  def this(manufacturer: String, model: String, plate: String) {
    this(manufacturer, model, -1, "")
  }

  override def toString = {
    manufacturer + " " + model + " " + year + " " + plate
  }
}

val murat = new Car("tofas", "murat")
val murat131 = new Car("tofas", "murat131", 1980)
val murat124 = new Car("tofas", "murat131", 1980, "26AA1313")
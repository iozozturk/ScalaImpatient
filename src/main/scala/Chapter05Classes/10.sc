class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Doe", 0.0)
  }
}

class Employee2 {

  private var _name: String = "John Doe"
  var salary: Double = 0.0

  def this(name: String, salary: Double) {
    this()
    _name = name
    this.salary = salary
  }

  def name = _name
}
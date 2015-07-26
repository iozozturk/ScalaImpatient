class Person(val fullName: String) {
  private val nameArray: Array[String] = fullName.split(" ")
  private val _firstName: String = nameArray(0)
  private val _lastName: String = nameArray(1)

  def firstName = _firstName

  def lastName = _lastName
}

class Person2(name: String) {
  val firstName = name.split("\\s+")(0)
  val lastName = name.split("\\s+")(1)

  override def toString = "Person(" + firstName + ", " + lastName + ")"
}

val person = new Person("Ismet Ozozturk")
person.firstName
person.lastName

val person2 = new Person2("Ismet Ozozturk")
person2.firstName
person2.toString



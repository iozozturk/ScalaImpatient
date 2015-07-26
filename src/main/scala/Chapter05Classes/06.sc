class Person(private var _age: Int) {

  def age = _age

  def age_=(newVal: Int): Unit = {
    if (newVal < 0) _age = 0
    else _age = newVal
  }
}

class Person2(var age: Int) {
  //alternate solution
  if (age < 0) age = 0
}

val person = new Person(20)
person.age = -1
person.age = 12

val person2 = new Person2(-1)
person2.age
person2.age = -1
person2.age


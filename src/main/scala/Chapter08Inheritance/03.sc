class Animal {
  println("Animal created")

  def sleep { println("Animal sleeps") }
  def eat { println("Animal eats") }

}

class Bird extends Animal {
  println("Bird created")

  override def sleep { println("Bird sleeps") }
  override def eat { println("Bird eats") }
}

val animal = new Animal
animal sleep

val bird = new Bird
bird sleep
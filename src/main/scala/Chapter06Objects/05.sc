object Reverse extends App {

  for (i <- args.reverse) {
    print(i + " ")
  }

}

object Reverse2 extends App {
  println(args.reverse.mkString(" "))
}

Reverse.main(Array("1", "2", "3"))
Reverse2.main(Array("1", "2", "3"))
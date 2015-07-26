def sortPositiveFirst(arr: Array[Int]) = {
  for (i <- arr)
    if (i > 0)
      print("kj")

}

def swap(arr: Array[Int], i: Int): Unit = {
  val t: Int = arr(i + 1)
  arr(i + 1) = arr(i)
  arr(i) = t
}

val arrDbl:Array[Double] = Array(1,12, 5)
val avg = arrDbl.sum / arrDbl.length
arrDbl.sorted.reverse
arrDbl.distinct.filter(_ != 6).map(_ * 3).toList.mkString(",").stripPrefix("3")
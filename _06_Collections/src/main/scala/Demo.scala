object Demo {
  def main(args: Array[String]): Unit = {
//    === Creating lists ==============================
    val a = List(1, 2, 3)
    val b = (1 to 5).toList
    val c = (1 to 10 by 2).toList
    val d = (1 until 5).toList
    val e = List.range(1, 5)
    val f = List.range(1, 10, 3)

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)

  }
}

object Demo {
  def main(args: Array[String]): Unit = {
//    === list ==============================
    val ints = List(1, 2, 3)
    val names = List("Joel", "Chris", "Ed")
    val ints2:List[Int] = List(1, 2, 3)
    val names2:List[String] = List("Joel", "Chris", "Ed")

    val a = List(1, 2, 3)
    val b = 0 +: a
    println(b) // List(0, 1, 2, 3)
    val c = List(-1, 0) ++: a
    println(c) // List(-1, 0, 1, 2, 3)
    println()

    val d = List(1, 2, 3, 4)
    println(d)
    val e = 0 +: d
    println(e)
    val f = d :+ 5
    println(f)

    println()
    for(name <- names) println(name)
    val list = 1 :: 2 :: 3 :: Nil
    println(list)
    println(ints)
  }
}

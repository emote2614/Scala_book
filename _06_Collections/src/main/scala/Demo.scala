object Demo {
  def main(args: Array[String]): Unit = {
//    === Creating lists ==============================
//    val a = List(1, 2, 3)
//    val b = (1 to 5).toList
//    val c = (1 to 10 by 2).toList
//    val d = (1 until 5).toList
//    val e = List.range(1, 5)
//    val f = List.range(1, 10, 3)
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(e)
//    println(f)
//    === List Methods ==============================
//    val a = List(10, 20, 30, 40, 10)
//    println(a)
//    println(a.drop(2)) // 30, 40, 10
//    println(a.dropWhile(_ < 25)) // 30, 40, 10
//    println(a.filter(_ < 25)) // 10, 20, 10
//    println(a.slice(2, 4)) // 30, 40
//    println(a.tail) // 20, 30, 40, 10
//    println(a.take(3)) // 10, 20, 30
//    println(a.takeWhile(_ < 30)) // 10, 20
//
//    val b = List(List(1, 2), List(3, 4))
//    println(b.flatten) // 1, 2, 3, 4
//
//    val nums = List("one", "two")
//    println(nums.map(_.toUpperCase)) // ONE, TWO
//    println(nums.flatMap(_.toUpperCase)) // O, N, E, T, W, O
//
//    val firstTen = (1 to 10).toList
//    println(firstTen.reduceLeft(_ + _)) // 55
//    println(firstTen.foldLeft(100)(_ + _)) // 155
//    === Tuples ==============================
    val t = (11, "eleven", List("Eleven", 10))
    val (num, str, list) = t
    println(num)
    println(str)
    println(list)
  }
}

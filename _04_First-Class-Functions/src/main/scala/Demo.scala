object Demo {
  def main(args: Array[String]): Unit = {
//    =================================
//    val a = List(1, 2, 3).map(i => i*2)
//    val b = List(1, 2, 3).map(_ * 2)
//    println(a)
//    println(b)
//
//    def double(i:Int) = i * 2
//    val c = List(1, 2, 3).map(i => double(i))
//    val d = List(1, 2, 3).map(double)
//    println(c)
//    println(d)
//    === Immutable collections ==============================
    val nums = (1 to 10).toList
    println(nums)
    val x = nums.filter(_ > 3)
                .filter(_ < 7)
                .map(_ * 10)
    println(x)


  }
}

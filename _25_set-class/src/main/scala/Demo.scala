object Demo {
  def main(args: Array[String]): Unit = {
//    === Set Class ==============================
    val set = scala.collection.mutable.Set[Int]()
    set += 1
    set += 2 += 3
    set ++= Vector(4, 5)
    println(set)

    set -= 1
    set -= 2 -= 3
    set --= Vector(4, 5)
    println(set)

    val set2 = scala.collection.mutable.Set[Int](1, 1, 2, 2, 3, 3, 3, 4)
    println(set2)
    set2.remove(2)





  }
}

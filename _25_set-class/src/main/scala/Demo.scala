object Demo {
  def main(args: Array[String]): Unit = {
//    === Set Class ==============================
    val set = scala.collection.mutable.Set[Int]()
    set += 1
    set += 2 += 3
    set ++= Vector(4, 5)
    println(set)

  }
}

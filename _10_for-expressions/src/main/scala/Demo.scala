object Demo {
  def main(args: Array[String]): Unit = {
//    === for expressions ==============================
    val nums = Seq(1, 2, 3)
    val doubledNums = for(n <- nums) yield n * 2
    println(doubledNums)

    val names = List("adam", "david", "frank")
    val ucNames = for(name <- names) yield name.capitalize
    println(ucNames)

    val names2 = List("_adan", "_david", "_frank")
    val capNames = for(name <- names) yield{
      val nameWithoutUnderscore = name.drop(0)
      val capName = nameWithoutUnderscore.capitalize
      capName
    }
    println(capNames)

    val capNames2 = for(name <- names) yield name.drop(1).capitalize
    println(capNames2)

  }
}

object Demo {
  def main(args: Array[String]): Unit = {
//    === Vector Class ==============================
//    val nums = Vector(1, 2, 3, 4, 5)
//    val strings = Vector("one", "two")
//    val a = nums :+ 6
//    println(a)
//    val b = nums ++ Vector(6, 7)
//    println(b)
//    =================================
    val numbers = Vector(1, 2, 3, 4, 5)
    println(numbers(2))
    val updatedNumbers = numbers.updated(1, 10)
    println(updatedNumbers)
    val appendNumbers = numbers :+  6
    println(appendNumbers)
    val prependedNumbers = 0 +: numbers
    println(prependedNumbers)
    val moreNumbes = Vector(6, 7, 8)
    val mergedNumbers = numbers ++ moreNumbes
    println(mergedNumbers)

    val sum = numbers.sum
    println(sum)
    val average = numbers.sum.toDouble / numbers.size
    println(average)
    val sortedNumbers = numbers.sorted
    println(sortedNumbers)
  }
}

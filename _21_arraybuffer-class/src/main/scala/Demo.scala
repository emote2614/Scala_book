import scala.collection.mutable.ArrayBuffer

object Demo {
  def main(args: Array[String]): Unit = {
//    === Array Buffer Class ==============================
//    val ints = ArrayBuffer[Int]()
//    val names = ArrayBuffer[String]("A", "B", "C")
//    ints += 1 += 2 // ArrayBuffer(1, 2)
//    ints ++= List(3, 4, 5) // ArrayBuffer(1, 2, 3, 4, 5)
//    names += "D" // ArrayBuffer(A, B, C, D)
//    names -= "A" // ArrayBuffer(B, C, D)
//    ======================================
    val a = ArrayBuffer(1, 2, 3)
    a.append(4) // ArrayBuffer(1, 2, 4)
    a.appendAll(Seq(5, 6)) // ArrayBuffer(1, 2, 3, 4, 5, 6)
    a.clear // ArrayBuffer()
    println()

    val b = ArrayBuffer(9, 10)
    b.insert(0, 8) // ArrayBuffer(8, 9, 10)
    b.insertAll(0, Vector(4, 5, 6, 7)) // ArrayBuffer(4, 5, ... 10)
    b.prepend(3) // ArrayBuffer(3, 4, ... 10)
    b.prependAll(Array(0, 1, 2)) // ArrayBuffer(1, 2, ... 10)

    val c = ArrayBuffer.range('a', 'h') // ArrayBuffer(a, b, ..., g)
    c.remove(0) // ArrayBuffer(b, c, d, e, f, g)
    c.remove(2, 3) // ArrayBuffer(b, c, g)

    val d = ArrayBuffer.range('a', 'h')
    d.dropInPlace(2) // ArrayBuffer(c, d, e, f, g)
    d.dropRightInPlace(2) // ArrayBuffer(c, d, e)

  }
}

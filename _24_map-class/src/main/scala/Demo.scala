import scala.collection.mutable.Map

object Demo {
  def main(args: Array[String]): Unit = {
//    === Map Class ==============================
    val states = Map(
      "AK" -> "Alaska",
      "IL" -> "Illinois",
      "KY" -> "Kentucky",
      "KR" -> "Korea"
    )
    val states2 = collection.mutable.Map("AK" -> "Alaska")
    states2 += ("JP" -> "Japan")
    states2 += ("KR" -> "Korea", "RU" -> "Russia")
    println(states2)
    states2 ++= Map("CA" -> "California", "CO" -> "Colorado")
    println(states2)

    states2 -= "JP"
    states2 -= ("RU", "AK")
    states2 --= List("KR", "CA")
    println(states2)

    states2("CO") = "Colorado 2"
    println(states2)
    println()

    val ratings = Map(
      "Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "You, Me and Dupree" -> 3.5
    )

    for((k,v) <- ratings) println(s"key: $k, value: $v")
    println()
    ratings.foreach{
      case(movie, rating) => println(s"key: $movie, value: $rating")
    }

  }
}

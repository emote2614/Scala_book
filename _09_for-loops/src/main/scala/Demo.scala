object Demo {
  def main(args: Array[String]): Unit = {
//    === for loops ==============================
//    val nums = Seq(1, 2, 3)
//    for(n <- nums){
//      println(n)
//    }
//
//    val people = List(
//      "Bill",
//      "Candy",
//      "Karen",
//      "Leo",
//      "Regina"
//    )
//    for(p <- people){
//      println(p)
//    }
//    === foreach ==============================
    val ratings = Map(
      "Lady in the Waer" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "Youl, Me and Dupree" -> 3.5
    )
    for ((name,rating) <- ratings){
      println(s"$name, Rating: $rating")
    }
    println()
    ratings.foreach{
      case(movie, rating) => println(s"$movie, Rating: $rating")
    }

  }
}

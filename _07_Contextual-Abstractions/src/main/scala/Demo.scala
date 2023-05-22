object Demo {
  def main(args: Array[String]): Unit = {
//    === Contextual Abstractions ==============================
    def greet(name: String)(implicit greeting: String): Unit = {
      println(s"$greeting, $name!")
    }
    implicit val defaultGreeting: String = "Hello"
    greet("Alice") // Hello, Alice!
//  =================================
    trait Show[A] {
      def show(value: A): String
    }
    implicit val intShow: Show[Int] = new Show[Int] {
      def show(value: Int): String = s"The number is $value"
    }
    implicit val stringShow: Show[String] = new Show[String] {
      def show(value: String): String = s"The string is '$value'"
    }
    def printValue[A](value: A)(implicit show: Show[A]): Unit = {
      val displayedValue = show.show(value)
      println(displayedValue)
    }
    printValue(42) // The number is 42
    printValue("Hello") // The string is 'Hello'


  }
}

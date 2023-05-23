
object Demo {
  def main(args: Array[String]): Unit = {
//    === Abstract Classes ==============================
//    abstract class Pet(name:String){
//      def speak() = println("Yo")
//      def comeToMaster
//    }
//    class Dog(name:String) extends Pet(name){
//      override def speak(): Unit = println("Woof")
//      override def comeToMaster: Unit = println("Here I come!")
//    }
//    val d = new Dog("Rover")
//    d.speak
//    d.comeToMaster
//    =================================
    abstract class Shape{
      def area:Double
      def perimeter:Double
    }
    class Rectangle(width:Double, height:Double) extends Shape{
      override def area: Double = width * height
      override def perimeter: Double = 2 * (width + height)
    }
    class Circle(radius:Double) extends Shape{
      override def area: Double = math.Pi * radius * radius
      override def perimeter: Double = 2 * math.Pi * radius
    }
    val rectangle = new Rectangle(5, 3)
    val circle = new Circle(2.5)
    println(s"Rectangle Area : ${rectangle.area}")
    println(s"Rectangle perimeter : ${rectangle.perimeter}")
    println(s"Circle Area : ${circle.area}")
    println(s"Circle perimeter : ${circle.perimeter}")

  }
}

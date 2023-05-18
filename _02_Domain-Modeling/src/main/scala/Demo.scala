
object Demo {
  def main(args: Array[String]): Unit = {
//    === OOP Domain Modeling ==============================
//    trait Speaker{
//      def speak():String // 추상적
//    }
//    trait TailWagger{
//      def startTail(): Unit = println("tail is wagging")
//      def stopTail(): Unit = println("tail is stopped")
//    }
//    trait Runner{
//      def startRunning(): Unit = println("I'm running")
//      def stopRunning(): Unit = println("Stopped running")
//    }
//    class Dog(name: String) extends Speaker with TailWagger with Runner{
//      def speak(): String = "Woof!"
//    }
//    class Cat(name: String) extends Speaker with TailWagger with Runner{
//      def speak(): String = "Meow!"
//      override def startRunning(): Unit = println("No Run")
//      override def stopRunning(): Unit = println("No need to stop")
//    }
//    val d = new Dog("Rover")
//    println(d.speak())
//    val c = new Cat("Morris")
//    println(c.speak())
//    println(c.startRunning())
//    =================================
//    class Person(var firstName: String, var lastName: String){
//      def printFullName() = println(s"$firstName $lastName")
//    }
//    val p = new Person("John", "Stephens")
//    println(p.firstName)
//    p.printFullName()
//    p.lastName = "legend"
//    p.printFullName()
//    === FP Domain Modeling ==============================
//  sealed abstract class CrustSize
//    object CrustSize {
//      case object Small extends CrustSize
//      case object Medium extends CrustSize
//      case object Large extends CrustSize
//    }
//
//    sealed abstract class CrustType
//    object CrustType {
//      case object Thin extends CrustType
//      case object Thick extends CrustType
//      case object Regular extends CrustType
//    }
//
//    sealed abstract class Topping
//    object Topping {
//      case object Cheese extends Topping
//      case object Pepperoni extends Topping
//      case object BlackOlives extends Topping
//      case object GreenOlives extends Topping
//      case object Onions extends Topping
//    }
//
//    import CrustSize._
//    val currentCrustSize: CrustSize = Small
//
//    currentCrustSize match {
//      case Small => println("Small crust size")
//      case Medium => println("Medium crust size")
//      case Large => println("Large crust size")
//    }
//    if (currentCrustSize == Small) println("Small crust size")
//    =================================
    case class Person(name: String, vocation: String)

    val p = Person("Reginald Kenneth Dwight", "Singer")
    println(p)
    println(p.name)

    val p2 = p.copy(name = "Elton John")
    println(p2)
    println(p2.vocation)



  }
}

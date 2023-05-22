
object Demo {
  def main(args: Array[String]): Unit = {
//    === traits as interfaces ==============================
//    trait TailWagger{
//      def startTail(): Unit
//      def stopTail(): Unit
//    }
//    class Dog extends TailWagger{
//      def startTail(): Unit = println("tail 1 is wagging")
//      def stopTail(): Unit = println("tail 1 is stopped")
//    }
//    class Dog2 extends TailWagger{
//      def startTail() = println("tail 2 is wagging")
//      def stopTail() = println("tail 2 is stopped")
//    }
//    val d = new Dog
//    val d2 = new Dog2
//    d.startTail()
//    d.stopTail()
//    d2.startTail()
//    d2.stopTail()
//    =================================
    trait Speaker {
      def speak(): String
    }
    trait TailWagger {
      def startTail(): Unit
      def stopTail(): Unit
    }
    trait Runner {
      def startRunning(): Unit
      def stopRunning(): Unit
    }
    class Dog extends Speaker with TailWagger with Runner{
      def speak() = "Woof!"
      def startTail() = println("tail is wagging")
      def stopTail() = println("tail is stopped")
      def startRunning() = println("I'm running")
      def stopRunning() = println("Stopped running")
    }
    val d = new Dog
    println(d.speak())
    d.startTail()
    d.stopRunning()

  }
}

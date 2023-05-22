object Demo {
  def main(args: Array[String]): Unit = {
    trait Pet{
      def speak = println("Yo")
      def comeToMaster():Unit
    }
    class Dog(name:String) extends Pet{
      override def comeToMaster(): Unit = println("I'm comming")
    }
    val d = new Dog("Zeus")
    d.speak
    d.comeToMaster()
    println()

    class Cat extends Pet{
      override def speak() = println("meow")
      def comeToMaster() = println("That's not gonna happen")
    }
    val c = new Cat
    c.speak()
    c.comeToMaster()


  }
}

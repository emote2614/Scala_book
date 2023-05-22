object Demo {
  def main(args: Array[String]): Unit = {
    class Person(var name:String, var age:Int){
      def this(name:String) {
        this(name, 20)
      }
      def displayDetails(): Unit = {
        println(s"Name: $name")
        println(s"Age : $age")
      }
    }
    val p1 = new Person("John", 30)
    p1.displayDetails()
    val p2 = new Person("Jane")
    p2.displayDetails()

  }
}

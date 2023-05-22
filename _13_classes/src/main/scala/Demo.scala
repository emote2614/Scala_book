
object Demo {
  def main(args: Array[String]): Unit = {
//    === classes ==============================
//    class Person(var firstName:String, var lastName:String)
//    val p = new Person("Bill", "Panner")
//    p.firstName = "Bill2"
//    println(p.firstName + " " + p.lastName)
//
//    class Person2(val firstName:String, val lastName:String)
//    val p2 = new Person2("Fred", "Johns")
////    p2.firstName = "Fred2"
//    println(p2.firstName + " " + p2.lastName)
//    =================================
//    class Person(var firstName:String, var lastName:String){
//      println("The constructor begins")
//      var age = 0
//      private val HOME = System.getProperty("user.home")
//      override def toString: String = s"$firstName $lastName is $age years old"
//      def printHome(): Unit = println(s"HOME = $HOME")
//      def printFullName(): Unit = println(this)
//    }
//    val p = new Person("Kim", "Carl")
//    p.age = 36
//    p.printHome()
//    p.printFullName()
//    =================================
    class Person(var name: String, var age: Int) {
      def displayDetails(): Unit = {
        println("Name: " + name)
        println("Age: " + age)
      }
      def celebrateBirthday(): Unit = {
        age += 1
        println(name + " is celebrating their birthday. They are now " + age + " years old.")
      }
    }
    val person = new Person("John", 30)
    person.displayDetails()
    person.celebrateBirthday()
    person.displayDetails()


  }
}

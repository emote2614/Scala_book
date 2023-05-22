object Demo {
  def main(args: Array[String]): Unit = {
//    === enumerations ==============================
//    object DayOfWeek extends Enumeration{
//      type DayOfWeek = Value
//
//      val Monday: DayOfWeek.Value = Value("Monday")
//      val Tuesday: DayOfWeek.Value = Value("Tuesday")
//      val Wednsday: DayOfWeek.Value = Value("Wednsday")
//      val Thursday: DayOfWeek.Value = Value("Thursday")
//      val Friday: DayOfWeek.Value = Value("Friday")
//      val Saturday: DayOfWeek.Value = Value("Saturday")
//      val Sunday: DayOfWeek.Value = Value("Sunday")
//    }
//    val today = DayOfWeek.Monday
//    println(s"Today is $today")
//    if(today == DayOfWeek.Saturday || today == DayOfWeek.Sunday){
//      println("Weekend")
//    }else{
//      println("Weekday")
//    }
//    println()
//    DayOfWeek.values.foreach(day => println(day))
//    ===========================================
    object AppleType extends Enumeration {
      type AppleType = Value
      val RedDelicious: AppleType.Value = Value("Red Delicious")
      val GrannySmith: AppleType.Value = Value("Granny Smith")
      val GoldenDelicious: AppleType.Value = Value("Golden Delicious")
      val Fuji: AppleType.Value = Value("Fuji")
    }
    val apple1 = AppleType.RedDelicious
    val apple2 = AppleType.GoldenDelicious

    println("Apple 1: " + apple1)
    println("Apple 2: " + apple2)

    if (apple1 == apple2) {
      println("The apples are the same type.")
    } else {
      println("The apples are different types.")
    }
    println()
    println("Available apple types:")
    AppleType.values.foreach(appleType => println(appleType))

  }
}

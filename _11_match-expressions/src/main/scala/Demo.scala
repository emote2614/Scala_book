object Demo {
  def main(args: Array[String]): Unit = {
//    === match expression ==============================
//    val i = 33
//    i match{
//      case 1 => println("1")
//      case 2 => println("2")
//      case 3 => println("3")
//      case _ => println("Error")
//    }
//
//    def convertBooleanToStringMessage(bool:Boolean): Unit={
//      if (bool){
//        println("True")
//      }else{
//        println("False")
//      }
//    }
//    convertBooleanToStringMessage(true)
//    convertBooleanToStringMessage(false)
//    =================================
//    def convertBooleanToStringMessage2(bool: Boolean): String = bool match{
//      case true => "True"
//      case false => "False"
//    }
//    println(convertBooleanToStringMessage2(true))
//    println(convertBooleanToStringMessage2(false))
//    println()
//    def isTrue(a: Any) = a match{
//      case 0 | "" => false
//      case _ => true
//    }
//    println(isTrue(0))
//    println(isTrue(""))
//    println(isTrue(1.1F))
//    =================================
//    val i = 1
//    val evenOrOdd = i match {
//      case 1 | 3 | 5 | 7 | 9 => println("odd")
//      case 2 | 4 | 6 | 8 | 0 => println("even")
//      case _ => println("Other number")
//    }
//
//    val count = 30
//    count match{
//      case 1 => println("one")
//      case x if(x == 2 || x == 3) => println("two or three")
//      case x if(x > 3) => println("4+")
//      case _ => println("Error")
//    }
//
//    count match{
//      case 1=>
//        println("one")
//      case x if x == 2 || x == 3 =>
//        println("two or three")
//      case x if x > 3 =>
//        println("4+")
//      case _ =>
//        println("Error")
//    }
//    =================================
    val i = 21
    i match{
      case a if 0 to 9 contains a => println("0-9 range: " + a)
      case b if 10 to 19 contains b => println("10-19 range: " + b)
      case c if 20 to 29 contains c => println("20-29 range: " + c)
      case _ => println("OVER")
    }

  }
}

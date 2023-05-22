object Demo {
  def main(args: Array[String]): Unit = {
//    === try/catch ==============================
//    def divide(a:Int, b:Int): Int = {
//      a / b
//    }
//    try{
//      val result = divide(10, 0)
//      println(s"result = $result")
//    }catch{
//      case ex: ArithmeticException =>
//        println("ex : " + ex.getMessage)
//    }
//    === try/catch/finally ==============================
    val dividend = 10
    val divisor = 0
    try{
      val result = dividend / divisor
      println(s"Result = $result")
    }catch{
      case ex: ArithmeticException =>
        println(s"Exception : $ex")
    }finally{
      println("End")
    }

  }
}

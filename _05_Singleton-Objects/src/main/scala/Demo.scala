
object Demo {
  def main(args: Array[String]): Unit = {
//    === "Utility" methods ==============================
    object StringUtils{
      // 문자열이 비어있거나 null인지 판단
      def isNullOrEmpty(s:String):Boolean = {s == null || s.trim.isEmpty}
      // 문자열의 왼쪽에 있는 모든 공백제거
      def leftTrim(s:String):String = s.replaceAll("^\\s+", "")
      // 문자열의 오른쪽에 있는 모든 공백제거
      def rightTrim(s:String):String = s.replaceAll("\\s+$", "")
    }
    val x = StringUtils.isNullOrEmpty("")
    println(x)
    val y = StringUtils.isNullOrEmpty("a")
    println(y)
//    === Companion objects ==============================
    class Circle(radius: Double) {
      import Circle._
      def area: Double = calculateArea(radius)
    }
    object Circle {
      private def calculateArea(radius: Double): Double =
        math.Pi * math.pow(radius, 2.0)
    }
    val circle1 = new Circle(5.0)
    println(circle1.area)
//    === Creating modules from traits ==============================


  }
}

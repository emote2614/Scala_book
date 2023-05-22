
object Demo {
  def main(args: Array[String]): Unit = {
    class Socket(var timeout:Int, var linger:Int){
      override def toString = s"timeout: $timeout, linger: $linger"
    }
    class Socket2(var timeout: Int = 2000, var linger: Int = 2000) {
      override def toString = s"timeout: $timeout, linger: $linger"
    }
    var s = new Socket(1000, 1000)
    println(s)
    var s2 = new Socket2()
    println(s2)
    var s3 = new Socket2(linger = 3000, timeout = 3000)
    println(s3)

  }
}

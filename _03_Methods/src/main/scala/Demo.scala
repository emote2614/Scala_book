import java.io.{PrintWriter, StringWriter}

object Demo {
  def main(args: Array[String]): Unit = {

//    === methods ====================================
    def sum(a:Int, b:Int)= a + b
    def concatenate(s1:String, s2:String) = s1 + s2
    val x = sum(1, 2)
    val y = concatenate("foo", "bar")
    println(x)
    println(y)

    def getStackTraceAsString(t: Throwable)={
      val sw = new StringWriter
      t.printStackTrace(new PrintWriter(sw))
      sw.toString
    }
    def makeConnection(url:String, timeout:Int=5000): Unit = {
      println(s"url=$url, timeout=$timeout")
    }
    makeConnection("https://localhost")
    makeConnection("https://localhost", 2500)
    makeConnection(
      url = "https://localhost",
      timeout = 3000
    )

  }
}

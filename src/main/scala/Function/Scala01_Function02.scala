package Function

object Scala01_Function02 {
  def main(args: Array[String]): Unit = {
    // 函数：方法参数 入参     ，出参
    // 无参无返回值
    def test(): Unit ={
      println("kakak")
    }
    //有参，无返回值
    def test1(s:String): Unit ={
      println(s)
    }

    test1("zhangsan")

    //有参 有返回值
    def  test2(s:String):String={
      return s+"kkaa"
    }

    println(test2("kdkda"))

    def test3():String={
      return "hello world!"
    }

    println(test3())

    // scala中没有throw关键字，所以函数中有异常发送，也不需要函数声明中抛异常


  }
}

package Function

object Scala01_Function04 {
  def main(args: Array[String]): Unit = {
    // 函数式编程的  -   扩展
    // todo：可变参数
    def test(name: String*) = {
      println(name)
    }
    // 调用函数时，可穿多个参数，也可以不传
    test("lalala", "djkakdad", "lisai")

    // todo 默认参数   如果希望函数中某一个参数使用默认值，那么可以在声明时直接赋值
    def test1(name: String, age: Int = 20) = {
      println(name + "   " + age)
    }

    test1("赵三")

    // 默认值被覆盖
    test1("张三", 90)

    //  带名参数
    test1(age = 100, name = "zhansan")








  }
}

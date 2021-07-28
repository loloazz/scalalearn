package Function

object Scala01_Function03 {
  def main(args: Array[String]): Unit = {

    //1. 如果函数声明时，明确无返回值Unit 那么即使函数体中有return也不起作用
    def test():Unit={
      return  "zhangsan"
    }


    // 如果将函数体的最后一行代码进行返回，那么return关键字可以省略
    def test2():String={
      return "kaala"
      // kaala
    }
    // 如果 可以根据函数的最后一行代码推断类型，那么函数返回值可以省略
    def test3()={
      "lalalala"
    }
    println(test3())

    // 如果函数体中只有一行代码，大括号也可以省略

    def test4()= "lalalalal"
    println(test4())


    // 如果函数声明中没有参数列表  小括号也可以省略,
    // TODO:  声明函数必须  加  def
    def test5 = "lalala"

    // 如果小括号省略，那么访问函数时也不能加小括号

    println(test5)

    // 等号 明确没有返回值的时候可以把等号给省略

    // TODO:  匿名函数
    ()->{println("我是匿名函数")}







  }

}

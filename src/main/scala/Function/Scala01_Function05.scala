package Function

object Scala01_Function05 {
  def main(args: Array[String]): Unit = {
    // todo Scala 是完全面向函数式语言

    // 函数在Scala可以做任何事情
    // 函数可以赋值给变量。 函数可以作为函数的参数
    // 函数可以作为函数的返回值

    def f() = {
      println("Function")
    }

    def f0() = {

      // 返回函数
      //      f
      // 直接返回函数，有问题，需要添加特殊符号  _
      f _
    }

    f0()()



    // 简化

    def f1() = {
      def f2() = {
        println("xxxxxxx")
      }

      f2 _
    }


    f1()()

    // 升级

    def f3(i: Int) = {
      def f4(j: Int) = {
        i * j
      }

      f4 _
    }


    f3(20)

    val i = f3(4)(4)
    println(i)



    // TODO 柯里化  对函数简化

    def f5(i: Int)(j: Int) = {
      i * j
    }

    println(f5(20)(20))

    // 闭包     一个函数在实现逻辑时，将外部的变量引入内容，改变了变量的生命周期


    // 函数作为  参数   需要特殊的声明方式   (Int) => Int   这个是个类型
    // （）=> Unit
    // （参数列表） => 返回值类型


    // 匿名函数

    def function9(f: () => Unit) = {
      f()
    }

    function9(() => {
      println("lalaalal")
    })


    def function10(f: () => Unit) = {
      f()
    }

    function10(() => println("lalala"))
    function10(() =>println("dada"))
    val function: () => Unit =   () => {

    }
  }
}

package Transform

object scala_Transform {
  def main(args: Array[String]): Unit = {

    // 自动类型转换  也是隐式转换

    // scala 中默认情况下，支持数值类型的自动转换

    // byte -》short -》int ->long
    // scala 默认情况下支持多态语法中的类型转换
    // child -> parent -> trait (interface)


    // scala也允许开发人员自定义类型转换规则   就是为了拓展功能


    // 将两个无关的类型通过编程的手段可以让他自动转换   下面就是自己实现  跟方法名无关  但是方法名不能相同

    implicit def lal(double: Double)={
                   double.toInt
    }

    val i :Int= 5.0



  }
}

package scala_List

import scala.collection.mutable.ArrayBuffer

/**
 * @Author: Yaolong
 * @Date: 2021/7/8 21:44
 * @Pagename: List
 * @ProjectName: scalalearn
 * @Describe:
 * */
object scala_arr {
  def main(args: Array[String]): Unit = {
    // 数组，使用Arrary对象实现，使用[] 来声明数组类型

    // Arrary[String]
    // scala可以使用简单的方式创建数组


    val ints = Array(1, 2, 3, 4)
    // 访问数组：使用小括号，增加索引的方式访问数组

    println(ints(0))
    println(ints)
    // 将数组转换为字符串打印出来  里面的参数是用   / 分割的
    val str = ints.mkString("/")


    // 将数组的每个元素打印

    for (elem <- ints) {
      println(elem)
    }


    //     foreach方法会将数组中每一个元素进行循环遍历，执行函数实现逻辑  注意是函数  多用匿名函数


    ints.foreach((i: Int) => println(i))
    ints.foreach((i) => println(i))
    ints.foreach((_) => println)
    ints.foreach(println(_))
    ints.foreach(_ => {
      println
    })
    ints.foreach(println)


    val unit = ints.update(1, 5) //注意内容可变


    // 增加元素
    // 采用方法向数组中增加新的元素，但不会对原有的数组造成影响，而是产生新的数组
    val ints1 = ints :+ (5)   //在后面添加元素
    println(ints1)
    val ints2 = 5 +: ints //在数组的前面增加元素   // 或者   看冒号的位置

    val buffer = ArrayBuffer() //可变数组  用法差不多  多了insert 方法。返回Unit
//
//   buffer += (9)
//    println(buffer)


    // 可变数组和不可变数组的转换

    buffer.toArray// 变成不可变的  返回新数组


    buffer.toBuffer // 变成可变的 返回新数组




  }


}

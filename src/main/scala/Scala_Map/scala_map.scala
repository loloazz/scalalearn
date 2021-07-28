package Scala_Map

import scala.collection.mutable

/**
 * @Author: Yaolong
 * @Date: 2021/7/9 18:26
 * @Pagename: Scala_Map
 * @ProjectName: scalalearn
 * @Describe:
 * */
object scala_map {
  def main(args: Array[String]): Unit = {
    //  map 集合：K，v

    // scala中 k -v 对数据采用特殊的声明方式   默认不可变
    val stringToInt = Map("a" -> 1, "b" -> 2)
    // 遍历
    println(stringToInt.mkString)

    // 可变map
    val map = mutable.Map("q" -> 2)
    println(map)


    map.update("c", 20)
    println(map)
    //取数据   map.get(key).get   scala为了防止空指针问题：提供了一个特殊的类  ： Option  有两个特殊的对象，Some,None
    // 如果确实没有获取到数据，为了不出现异常，Option类提供了有默认值的方法   getOrElse(0)
    println(map.get("c"))





  }
}

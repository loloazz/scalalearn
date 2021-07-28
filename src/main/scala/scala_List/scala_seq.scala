package scala_List

/**
 * @Author: Yaolong
 * @Date: 2021/7/9 16:24
 * @Pagename: List
 * @ProjectName: scalalearn
 * @Describe:
 * */
object scala_seq {

  def main(args: Array[String]): Unit = {
    val ints: List[Int] = List(1, 2, 3, 4)
    ints.foreach(println)

    //通过索引可以获取数据
    println(ints(0))


    //增加数据    ：+  看冒号的位置可以判断是否是头插法，或这尾插法、
    // ++ 是  将其他的集合的数据加在一起
    val ints1: List[Int] = List(2, 3, 4, 5)
    val ints2 = ints ++ ints1
    println(ints2.mkString)


    // 特殊 的空集合  Nil
    println((Nil))

    // 常用与
    val ints3 = 1 :: 2 :: 3 :: Nil


  }

}

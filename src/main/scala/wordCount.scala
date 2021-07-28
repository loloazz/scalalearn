/**
 * @Author: Yaolong
 * @Date: 2021/7/10 14:10
 * @Pagename:
 * @ProjectName: scalalearn
 * @Describe:
 * */
object wordCount {
  def main(args: Array[String]): Unit = {
    val lineList: List[(String, Int)] = List(("Hello Scala World", 4), ("Hello world", 3),
      ("Hello Hadoop", 2), ("Hello Hbase", 1))

    // 将一行一行的数据拆成一个一个单词
    //    ("Hello Scala World", 4), ("Hello world", 3), ==》("Hello",4)  ("Scala",4)  ("World",4)
    //    ("Hello Hadoop", 2), ("Hello Hbase", 1)
    // 将数据进行拆分
    val list = lineList.flatMap(x => {
      val words = x._1.split(" ")
      words.map(w => {
        (w, x._2)
      })
    })

    println(list)
    // 将单词分组
    val stringToList = list.groupBy(y => {
      y._1
    })

    println(stringToList)
    //对分组的数据进行结构转换
    val map = stringToList.map(x => {
      val key = x._1
      val ints = x._2.map(u => {
        u._2
      }).sum //求和
      (key, ints)
    })

    // 当只有对values有意义时还可以使用   mapValues,只对value操作，不对 key

    // 排序
    val tuples: List[(String, Int)] = map.toList.sortWith((x, y) => {
      x._2 > y._2
    })

    // 取前三
    println(tuples.take(3))


  }


}

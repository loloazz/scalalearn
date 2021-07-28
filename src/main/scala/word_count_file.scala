import scala.io.Source

/**
 * @Author: Yaolong
 * @Date: 2021/7/10 14:41
 * @Pagename:
 * @ProjectName: scalalearn
 * @Describe:
 * */
object word_count_file {
  def main(args: Array[String]): Unit = {
    // 从文件中获取数据
    val source = Source.fromFile("D:\\javaProjiect\\scalalearn\\src\\res\\words", "UTF-8")
   // 获取文件的行数据返回一个迭代器
    val strings: Iterator[String] = source.getLines()

//    strings.foreach(println)

    //  将迭代器转换成List
    val Lineslist: List[String] = strings.toList

    val listToFlat = Lineslist.flatMap(x => {
      x.split(" ")
    })

    // 对单词分组  转化
    val group = listToFlat.groupBy(x => {
      x
    }).map(x=>{(x._1,x._2.size)})  //转化

    //

    group.foreach(println)
  }
}

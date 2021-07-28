package reduce

/**
 * @Author: Yaolong
 * @Date: 2021/7/10 15:49
 * @Pagename: reduce
 * @ProjectName: scalalearn
 * @Describe:
 * */
object reduce {
  def main(args: Array[String]): Unit = {
    // reduce 是数据的减少，不是结果减少
    // 将集合的数据经过逻辑的处理后只保留一个结果，具体结果需要参考逻辑的实现

    val ints = List(1, 2, 3, 4)
    val i = ints.reduce((left, right) => {
      left + right
    })

    // 也可以简化
    val i1 = ints.reduce(_ + _)
    println(i)
    println(i1)

  }
}

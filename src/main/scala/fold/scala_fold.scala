package fold

import scala.collection.mutable

/**
 * @Author: Yaolong
 * @Date: 2021/7/10 19:22
 * @Pagename: fold
 * @ProjectName: scalalearn
 * @Describe:
 * */
object scala_fold {
  def main(args: Array[String]): Unit = {

    // 将两个map进行合并    相同的Key进行累加，不同的key直接添加
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)

    val stringToInt = map1.foldLeft(map2)((map, t) => {
      map(t._1) = map.getOrElse(t._1, 0) + t._2

      map
    })
    println(stringToInt)

  }


}

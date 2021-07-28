package cellection_Method

import scala.collection.immutable
import scala.math.Ordered.orderingToOrdered

/**
 * @Author: Yaolong
 * @Date: 2021/7/9 19:16
 * @Pagename: cellection_Method
 * @ProjectName: scalalearn
 * @Describe:
 * */
object CommonMethod {
  def main(args: Array[String]): Unit = {
    // TODO:   集合的常用方法
    val list: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1)

    // 求和
    println(list.sum)

    // 最大值
    println(list.max)

    //最小值
    println(list.min)

    // 乘积 元素的乘积
    println(list.product)


    // 反转
    val reverse11 = list.reverse
    println(reverse11)

    // 难度提升

    // 分组   按照什么条件分组   或者  规则
    val intToInts: Map[Int, List[Int]] = list.groupBy(x => x) //根据指定函数的返回值分组
    intToInts.foreach(t => {
      println(t._1 + " " + t._2)
    })

    // 需求： 将相同的首字母放在同一个分组
    val strings: List[String] = List("111", "2222", "1222", "23123", "123d")
    val stringToStrings: Map[String, List[String]] = strings.groupBy(s => {
      s.substring(0, 1)
    })
    stringToStrings.foreach(x => {
      println(x._1 + " :" + x._2)
    })

    // 需求：奇数  偶数为一组
    val list2: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1)
    val intToList = list2.groupBy(x => {
      x % 2
    })

    println(intToList)
    intToList.foreach(x => {
      println(x._1 + "," + x._2)
    })


    // 排序（按照指定规则排序）  sortby没法规定升降序排序
    val list3: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1)
    val sortlist = list.sortBy(x => x) //按照自己排序
    println(sortlist.mkString(",")) // 1,1,3,5,5,23,65,344

    // 按照给字符串进行排序
    val strings1: List[String] = List("11", "22312", "231231", "1113", "089", "564")
    val stringsSort: List[String] = strings1.sortBy(x => {
      x.charAt(1) // 按照字符串的第二字符排序
    })
    println(stringsSort.mkString(","))


    // sortwith    传进去Boolen值
    // 升序  小  =》大   看大小的顺序
    val list4: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1)
    val ints: List[Int] = list4.sortWith((x, u) => {
      x < u
    })

    println(ints.mkString)


    // 需求：要求对字符串的第二个字符，实现降序
    val strings2: List[String] = List("11", "22312", "231231", "1113", "089", "564")
    val strings3 = strings2.sortWith((left, right) => {
      left.substring(1).toInt > right.substring(1).toInt
    })

    println(strings3.mkString(", "))


    // 迭代
    for (elem <- list3.iterator) {

    }


    //map  映射（转换）  集合的元素映射成另一个结构
    val list5: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1)
    val tuples: immutable.Iterable[(Int, Int, List[(Int, Int)])] = list5.map(x => {
      (x, 1)
    }).groupBy(x => {
      x._1
    }).map(x => {
      (x._1, x._2.size, x._2.sortWith((x, y) => {
        x < y
      }))
    })

    println(tuples)


    // TODO: word count
    val wordlist = List("hello", "java", "hello", "scala", "hello", "lalal", "hello ",
      "scala", "hello", "python")

    val tuples2: List[(String, Int)] = wordlist.groupBy(x => {
      x
    }).map(x => {
      (x._1, x._2.size)
    }).toList.sortWith((left, right) => {
      left._2 < left._2
    })


    println(tuples2.take(3))

   // 扁平化操作  将一个整体中的内容拆成一个一个整体   flatMap
   val wordlist2 = List("hello java lala", "hello scala", "hello lalal", "hello scala", "hello python")
    val strings4: List[String] = wordlist2.flatMap(x => {
      x.split(" ")//把字符串拆成 多个个字符串
    })
    println(strings4)


    //  filter 过滤器    对集合数据进行筛选过滤，true 保留，false 不保留
    val list6: List[Int] = List(1, 23, 344, 5, 65, 3, 5, 1,2,2,3,45,50)

    val ints10: List[Int] = list6.filter(x => {
      x % 2 == 0
    })

    println(ints10)




    // 拉链  ZiP  两个集合进行关联，关联后的数据形成元组
    val ints1 = List(1, 23, 344, 5)
    val ints2 = List(65, 3, 5,   1)
    val tuples1: List[(Int, Int)] = ints1.zip(ints2)  //List((1,65), (23,3), (344,5), (5,1))
    println(tuples1)


    // 集合的并集
    val ints3 = List(1, 23, 344, 5)
    val ints5 = List(65, 3, 5,   1)
    val ints4: List[Int] = ints3.union(ints5) // List(1, 23, 344, 5, 65, 3, 5, 1)
    println(ints4)

    // 集合的交集
    val ints6 = List(1, 23, 344, 5)
    val ints7 = List(65, 3, 5,   1)
    val ints8: List[Int] = ints6.intersect(ints7) //  List(1, 5)
    println(ints8)

  }




}

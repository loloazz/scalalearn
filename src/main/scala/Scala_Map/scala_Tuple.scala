package Scala_Map

/**
 * @Author: Yaolong
 * @Date: 2021/7/9 18:48
 * @Pagename: Scala_Map
 * @ProjectName: scalalearn
 * @Describe:
 * */
object scala_Tuple {
    // Tuple:元组    将无关的数据当成整体来使用

  //map (k-> v )
  // 使用小括号将数据关联在一起，形成一个整体
  def main(args: Array[String]): Unit = {
    // 元组中的  元素限制为： 22 个
    val tuple: (String, Int, String) = ("zhangsan", 11111, "xxxxxxxx")


    // 访问元组中的数据，调用相应的顺序编号：_ 顺序号
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    // 循环遍历
    for (elem<-tuple.productIterator){
      println(elem)
    }

    // 如果元组中的元素个数 为2  那么称为 对偶  类似于Map的键值对
    val tuple1: (Int, String) = (1, "xxsxxxxx")

  }

}


class  User{
  var UserName:String = _
  var age:Int  = _



}
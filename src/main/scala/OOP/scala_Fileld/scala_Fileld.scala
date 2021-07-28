package OOP.scala_Fileld

object scala_Fileld {
  def main(args: Array[String]): Unit = {

  }
}


class user {

  // 声明属性

  // scala中给类声明属性 默认为私有，但是底层提供了公共的setter 和  getter方法

  var name: String = _

  // 如果给属性增加private属性，那么属性无法在外部访问，因为底层生成的setter 和  getter方法都是私有的

  private var age: Int = _

  // 如果声明的属性使用val 那么属性就是私有的，并且使用final 修饰，底层只提供了getter方法没有setter方法


  // TODO:  scala 中的四种访问权限   public  protect    private   default

  // public 默认的访问权限，没有关键字
  // protected 只能子类访问，同包访问不了
  // 私有只能当前类访问
  // default
}
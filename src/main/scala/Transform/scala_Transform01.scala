package Transform

object scala_Transform01 {
  def main(args: Array[String]): Unit = {
    // 将一个对象，转换成另一个对象。  隐式函数
  implicit  def transform(mysql: Mysql):Operater={
      new Operater
    }


    val mysql = new Mysql
    mysql.delet()
    mysql.select()
  }


}


class Operater{
  def  delet()={

  }

}

class Mysql{
  def select()={

  }
}

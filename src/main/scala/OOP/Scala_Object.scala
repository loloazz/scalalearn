package OOP

//
// TODO:  scala是一个完全面向对像的语言

object Scala_Object {
  def main(args: Array[String]): Unit = {
    // 创建类的对象

    val user = new User()
    // 调用对象的属性方法
    println(user)

    println(user.username)


  }
}

// 声明类
class  User{

//  类的主题内容

  // 声明属型   尽量写成 var   因为属性 可能要修改、
//  var username :String = null;
//  var age:Int=0;

// 第二种方法
  var username :String = _;
  var age:Int=_;

  def login():Boolean={
    return  true
  }

}
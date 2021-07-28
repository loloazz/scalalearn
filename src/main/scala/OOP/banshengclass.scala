package OOP

// 伴生类（成员）
class banshengclass {

}
//伴生对象 （静态）   伴生对象可以访问伴生类的私有属性   伴生对象     还可以用来创建伴生类对象   需要提供特殊的方法，实现相应的功能 apply
object banshengclass{
  def apply(): banshengclass = new banshengclass()
}

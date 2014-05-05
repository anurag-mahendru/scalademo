package anurag

object day_7a {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

}

abstract class abc {
  def foo = 5
  def sel: Int
}

class exal extends abc {
  override def foo = 8
  def sel = 5
}
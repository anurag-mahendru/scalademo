package anurag

object First {
  def main(args: Array[String]) = println("hello")
  val t = new ras(5)
  println(t.add(5))
  println(t.sub(4))

}
class ras(x: Int) {
  def add(y: Int) = x + y
  def sub(y: Int) = x - y
}

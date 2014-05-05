package anurag
// Abstract Classes
object Day_7 {
  // new Seven
  val t1 = new nonempty(1, empty, empty)          //> t1  : anurag.nonempty = {.1.}
  val t2 = t1 incl 4                              //> t2  : anurag.Seven = {.1{.4.}}
  val t3 = t1 incl 7                              //> t3  : anurag.Seven = {.1{.7.}}
  (new nonempty(7,empty,empty)) contain 7         //> res0: Boolean = true
}

abstract class Seven {
  def incl(x: Int): Seven
  def contain(x: Int): Boolean

}

object empty extends Seven {
  def contain(x: Int): Boolean = false
  def incl(x: Int): Seven = new nonempty(x, empty, empty)
  override def toString = "."
}

class nonempty(elem: Int, left: Seven, right: Seven) extends Seven {
  def contain(x: Int): Boolean =
    if (x < elem) left contain x
    else if (x > elem) right contain x
    else true

  def incl(x: Int): Seven =
    if (x < elem) new nonempty(elem, left incl x, right)
    else if (x > elem) new nonempty(elem, left, right incl x)
    else this
  override def toString = "{" + left + elem + right + "}"
}
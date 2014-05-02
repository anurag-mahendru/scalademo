package anurag

object day_6_a {
  var z = new rational(4, 5)                      //> z  : anurag.rational = 4/5
  var y = new rational(2, 3)                      //> y  : anurag.rational = 2/3
  y.less(z)                                       //> res0: Boolean = true
  y.maxim(z)                                      //> res1: anurag.rational = 4/5
  y.less2(z)                                      //> res2: Boolean = true
  z add y                                         //> res3: anurag.rational = 22/15

  val a = new rational(2)                         //> a  : anurag.rational = 2/1
  val b = new rational(2, 3)                      //> b  : anurag.rational = 2/3
}
class rational(x: Int, y: Int) {
  require(y != 0, "Denominator must not be zero")

  //Defining a new constructor in this class
  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g;
  def denom = y / g;

  def add(a: rational) =
    new rational(
      numer * a.denom + denom * a.numer,
      denom * a.denom)

  def neg: rational = new rational(-numer, denom)

  def sub(a: rational) = add(a.neg)

  def less(a: rational) = a.denom * numer < a.numer * denom
  def less2(a: rational) = a.denom * this.numer < a.numer * this.denom
  def max(a: rational) = a.denom * numer > a.numer * denom
  def maxim(a: rational) = if (this.less(a)) a else this

  override def toString = numer + "/" + denom

}
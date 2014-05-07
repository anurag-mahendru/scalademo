package classy

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

  def <(a: rational) = a.denom * this.numer < a.numer * this.denom
  def max2(a: rational) = if (this < a) a else this

  def +(a: rational) = add(a: rational)
  def -(a: rational) = this + a.neg

  override def toString = numer + "/" + denom

}
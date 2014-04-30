package anurag

object day_6 {

  //	public static void main(string[]args)
  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)
                                                  //> gcd: (x: Int, y: Int)Int
  def addrational(a: Rational, b: Rational): Rational =
    new Rational(
      a.numer * b.denom + b.numer * a.denom,
      a.denom * b.denom)                          //> addrational: (a: anurag.Rational, b: anurag.Rational)anurag.Rational
  def makestring(r: Rational) = {
    val x = gcd(r.numer, r.denom)
    var y = r.numer
    var z = r.denom
    if (x > 0) {
      y = r.numer / x
      z = r.denom / x
    }
    if (z == 1) println(y) else println(y + "/" + z)
  }                                               //> makestring: (r: anurag.Rational)Unit
  makestring(addrational(new Rational(2, 2), new Rational(2, 2)))
                                                  //> 2

}
class Rational(x: Int, y: Int) {

  def numer = x;
  def denom = y;
}
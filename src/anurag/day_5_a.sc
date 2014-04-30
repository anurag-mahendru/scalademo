package anurag
import math.abs
object day_5_a {
  //Currying for production

  def prod(f: Int => Int)(a: Int, b: Int): Int = if (a > b) 1 else f(a) * prod(f)(a + 1, b)
                                                  //> prod: (f: Int => Int)(a: Int, b: Int)Int

  prod(x => x + x)(3, 4)                          //> res0: Int = 48
  def fact(x: Int) = prod(x => x)(1, x)           //> fact: (x: Int)Int

  fact(5)                                         //> res1: Int = 120

  //fixed point function
  val tol = .0001                                 //> tol  : Double = 1.0E-4
  def isclosenough(x: Double, y: Double) =
    abs((x - y) / x) / x < tol                    //> isclosenough: (x: Double, y: Double)Boolean
  def fixedpt(f: Double => Double)(firstguess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isclosenough(guess, next)) next
      else iterate(next)

    }
    iterate(firstguess)
  }                                               //> fixedpt: (f: Double => Double)(firstguess: Double)Double

  fixedpt(x => 3 * x - 4)(1.0)                    //> -1.0
                                                  //| -7.0
                                                  //| res2: Double = -7.0
  def sqrt(x: Int) = fixedpt(y => (y + x / y) / 2)(1.0)
                                                  //> sqrt: (x: Int)Double
  sqrt(2)                                         //> 1.5
                                                  //| 1.4166666666666665
                                                  //| 1.4142156862745097
                                                  //| 1.4142135623746899
                                                  //| res3: Double = 1.4142135623746899
}
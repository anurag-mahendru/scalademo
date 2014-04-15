package anurag

object day3 {
  def loop: Boolean = loop                        //> loop: => Boolean

  def and(x: Boolean, y: Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: Boolean)Boolean
  def or(x: Boolean, y: => Boolean): Boolean = if (x) x else y
                                                  //> or: (x: Boolean, y: => Boolean)Boolean
  or(true, loop)                                  //> res0: Boolean = true
  def abs(x: Double) = if (x <= 0) -x else x      //> abs: (x: Double)Double

  def sqrtitr(guess: Double, x: Double): Double =
    if (ntgoodenough(guess, x)) guess
    else sqrtitr(improve(guess, x), x)            //> sqrtitr: (guess: Double, x: Double)Double

  def ntgoodenough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001                //> ntgoodenough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtitr(1.0, x)           //> sqrt: (x: Double)Double

  //def sqrt(x:Double):Double = if (y ==1.41) y, else y = (y + sqrt(x/y))/2

  //sqrt(2)
  sqrt(5)                                         //> res1: Double = 2.2360688956433634
}
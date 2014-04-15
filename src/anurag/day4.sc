package anurag

object day4 {

  def abs(x: Double) = if (x > 0) x else -x       //> abs: (x: Double)Double
  def sqrt(x: Double) = {

    def sqrtitr(y: Double): Double =
      if (abs(y * y - x) < .0001) y
      else sqrtitr(modify(y))

    def modify(y: Double) =
      (y + x / y) / 2
    sqrtitr(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097

  def fact(x: Int) = {
    def loop(z: Int, x: Int): Int = if (x == 1) z else loop(z * x, x - 1)

    loop(1, x)
  }                                               //> fact: (x: Int)Int
  fact(5)                                         //> res1: Int = 120

  //@tailrec
  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)
                                                  //> gcd: (x: Int, y: Int)Int

  gcd(28, 13)                                     //> res2: Int = 1

  def sum2(x: Int, y: Int): Int = if (x > y) 0 else x + sum2(x + 1, y)
                                                  //> sum2: (x: Int, y: Int)Int
  def square(x: Int) = x * x                      //> square: (x: Int)Int
  def cube(x: Int) = x * x * x                    //> cube: (x: Int)Int

  def sumofcube(x: Int, y: Int): Int = if (x > y) 0 else cube(x) + sumofcube(x + 1, y)
                                                  //> sumofcube: (x: Int, y: Int)Int
  sumofcube(2, 5)                                 //> res3: Int = 224

  def sumoffactorial(x: Int, y: Int): Int = if (x > y) 0 else fact(x) + sumoffactorial(x + 1, y)
                                                  //> sumoffactorial: (x: Int, y: Int)Int

  sumoffactorial(2, 5)                            //> res4: Int = 152

  def sum(f: Int => Int, x: Int, y: Int): Int = if (x > y) 0 else f(x) + sum(f, x + 1, y)
                                                  //> sum: (f: Int => Int, x: Int, y: Int)Int

  sum(square, 2, 5)                               //> res5: Int = 54
  sum(cube, 2, 5)                                 //> res6: Int = 224
  sum(fact, 2, 5)                                 //> res7: Int = 152
  sum(x => x * x * x, 2, 5)                       //> res8: Int = 224

}
package anurag

object day_5 {

  //Mapping
  var capital = Map("India" -> "Delhi", "US" -> "Washington")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(India -> Delh
                                                  //| i, US -> Washington)

  capital += ("Japan" -> "Tokyo")

  println(capital("Japan"))                       //> Tokyo

  //Factorial
  def fact(x: BigInt): BigInt = if (x == 0) 1 else x * fact(x - 1)
                                                  //> fact: (x: BigInt)BigInt

  fact(50)                                        //> res0: BigInt = 3041409320171337804361260816606476884437764156896051200000000
                                                  //| 0000
  //
  def loop: Int = loop                            //> loop: => Int

  //sqrt

  def abs(x: Double): Double = if (x > 0) x else -x
                                                  //> abs: (x: Double)Double

  def sqrt(x: Double): Double = {
    def sqrtitr(y: Double): Double =
      if (abs(y * y - x) < .0001) y
      else sqrtitr(set(y))
    def set(y: Double) =
      (y + x / y) / 2

    sqrtitr(1.0)
  }                                               //> sqrt: (x: Double)Double
  def y = 10                                      //> y: => Int
  val x = sqrt(y)                                 //> x  : Double = 3.162277665175675
  assert(x >= 0)
  sqrt(4)                                         //> res1: Double = 2.0000000929222947

  //functions return another function

  def sum(f: Int => Int): (Int, Int) => Int =
    {
      def sumF(x: Int, y: Int): Int =
        if (x > y) 0
        else f(x) + sumF(x + 1, y)

      sumF
    }                                             //> sum: (f: Int => Int)(Int, Int) => Int

  def sumsq = sum(x => x * x)                     //> sumsq: => (Int, Int) => Int
  def sumcube = sum(x => x * x * x)               //> sumcube: => (Int, Int) => Int
  def cube(x: Int) = x * x * x                    //> cube: (x: Int)Int

  sumsq(1, 10)                                    //> res2: Int = 385
  sum(cube)(1, 10)                                //> res3: Int = 3025

  def sum2(fu: Int => Int)(a: Int, b: Int): Int = if (a > b) 0 else fu(a) + sum2(fu)(a + 1, b)
                                                  //> sum2: (fu: Int => Int)(a: Int, b: Int)Int
  sum2(cube)(1, 10)                               //> res4: Int = 3025
}
package anurag

object day4_2 {

  //Higher Order Function
  def sum(f: Int => Int, x: Int, y: Int): Int = {
    def loop(x: Int, z: Int): Int = if (x > y) z else loop(x + 1, f(x) + z)

    loop(x, 0)
  }                                               //> sum: (f: Int => Int, x: Int, y: Int)Int

  sum(x => x * x, 2, 5)                           //> res0: Int = 54



}
package anurag

object Challange {
  def sum(x: Int, y: Int): Int = {
    if (x > y)
      0
    else if (x % 5 == 0 || x % 3 == 0) x + sum(x + 1, y)
    else sum(x + 1, y)
  }                                               //> sum: (x: Int, y: Int)Int
  sum(1, 100)                                     //> res0: Int = 2418

  def eval(e: expr): Int = {
    if (e.isnum) e.numval
    else if (e.issum) eval(e.leftop) + eval(e.rightop)
    else throw new Error("Unknown Expression")
  }                                               //> eval: (e: anurag.expr)Int

  eval(new sum(new number(2), new number(5)))     //> res1: Int = 7
}

trait expr {
  def isnum: Boolean
  def issum: Boolean
  def numval: Int
  def rightop: expr
  def leftop: expr
}

class number(x: Int) extends expr {
  def isnum = true
  def issum = false
  def numval = x
  def rightop = throw new Error("num.rightop")
  def leftop = throw new Error("num.leftop")
}

class sum(x: expr, y: expr) extends expr {
  def isnum = false
  def issum = true
  def numval = throw new Error("sum.numvalue")
  def rightop = x
  def leftop = y
}
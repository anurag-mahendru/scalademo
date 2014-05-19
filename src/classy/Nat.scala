package classy

abstract class Nat {
  def iszero: Boolean
  def pre: Nat
  def suc = new suc(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def iszero = true
  def pre = throw new Error("0.Pre")
  def +(that: Nat) = that
  def -(that: Nat) = if (that.iszero) this else throw new Error("Negative")
}

class suc(n: Nat) extends Nat {
  def iszero = false
  def pre = n
  def +(that: Nat) = new suc(n + that)
  def -(that: Nat) = if (that.iszero) this else (n - that.pre)
}
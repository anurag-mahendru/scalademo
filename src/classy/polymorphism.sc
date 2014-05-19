import classy._
import scala.sys.process._

object polymorphism {
  def nth[T](n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)                      //> nth: [T](n: Int, xs: classy.List[T])T

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : classy.Cons[Int] = classy.Cons@13b0d75f
  nth(2, list)                                    //> res0: Int = 3

  def x = new Function1[Int, Int] {
    def apply(x: Int) = x * x
  }                                               //> x: => Int => Int

  val p = "ls".!                                  //> about_files
                                                  //| about.html
                                                  //| artifacts.xml
                                                  //| configuration
                                                  //| dropins
                                                  //| eclipse
                                                  //| eclipse.ini
                                                  //| epl-v10.html
                                                  //| features
                                                  //| icon.xpm
                                                  //| jre
                                                  //| META-INF
                                                  //| notice.html
                                                  //| p2
                                                  //| plugins
                                                  //| readme
                                                  //| workspace
                                                  //| p  : Int = 0
  // x.apply(5)

}

/*
class AnonFun extends Function1[Int,Int]{
	def apply(x:Int) = x * x
}*/

trait expr {
  def eval: Int
}

class num(x: Int) extends expr {
  def eval = x
}

class sum(x: expr, y: expr) {
  def eval = x.eval + y.eval
}
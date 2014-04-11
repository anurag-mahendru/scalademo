package saumitra

object day2 {
  
  def sumOfSquares(a:Int, b:Int):Int = if(a > b) 0 else (a * a) + sumOfSquares(a + 1, b)
                                                  //> sumOfSquares: (a: Int, b: Int)Int
  
  def sumOfCubes(a:Int, b:Int):Int = if(a > b) 0 else (a * a * a) + sumOfCubes(a + 1, b)
                                                  //> sumOfCubes: (a: Int, b: Int)Int
  
  sumOfSquares(1, 2)                              //> res0: Int = 5
  sumOfCubes(1, 2)                                //> res1: Int = 9
  
   
  
  def sum(f: Int=>Int, a: Int, b:Int):Int = if(a>b) 0 else f(a) + sum(f,a+1,b)
                                                  //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  
  sum(a => a * a, 2, 3)                           //> res2: Int = 13
  sum(a => a * a * a ,2, 3)                       //> res3: Int = 35
  
  
  def foo(func: Int =>Int, num:Int ):Int = {
  		
  		func(num)
  }                                               //> foo: (func: Int => Int, num: Int)Int

	var obj1:Customer =  new Customer(1);     //> obj1  : saumitra.Customer = new object created

}


class Customer(val a:Int) {
	
	require(a <10, " a shud be less than 10")
	
	private var acc = 10;
	
	def getAcc():Int = return acc;
	
	override def toString() =  "new object created";
	
	
}
package anurag

object day2 {


  def mul(x:Double, y:Int):Double = x*y           //> mul: (x: Double, y: Int)Double
  
  mul(5,6)                                        //> res0: Double = 30.0
  
 var  capital = Map("India" -> "Delhi", "US"-> "Washington")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(India -> Delh
                                                  //| i, US -> Washington)
 
 capital +=("Japan"->"Tokyo")
 
 println(capital("Japan"))                        //> Tokyo
}
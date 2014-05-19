/* 3 ways to import

import classy.rational								>> Named Import
import classy._
import classy.{rational, week}				>> WildCard Import
*/

import classy.rational

object scratch {
  new rational(1, 2)                              //> res0: classy.rational = 1/2
  
  def error(msg:String) =  throw new Error(msg)   //> error: (msg: String)Nothing
 	val x=null                                //> x  : Null = null
	val y:String = null                       //> y  : String = null
	
	if (true) 1.0 else new rational(1,2)      //> res1: Any = 1.0
}
/* 3 ways to import

import classy.rational								>> Named Import
import classy._
import classy.{rational, week}				>> WildCard Import
*/

import classy.rational

object scratch {
  new rational(1, 2)                              //> res0: classy.rational = 1/2
}
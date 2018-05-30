
import scala.annotation.tailrec

object P49 extends App {

  def combine(x: List[String], y: List[String]): List[String] = {
    for ( e <- x; f <- y ) yield (e+f)
  }

  //@tailrec
  def gray(n: Int): List[String] = n match {
    case 1 => List("0", "1")
    case _ => combine(gray(1), gray(n-1))
  }

  println(gray(1))
  println(gray(2))
  println(gray(3))
  println(gray(4))
  println(gray(5))
}

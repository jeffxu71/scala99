
import scala.annotation.tailrec

object P02 extends App {
  @tailrec
  def penultimate[T](l: List[T]): Option[T] = l match {
    case Nil => None
    case head :: Nil => None
    case lastButOne :: last :: Nil => Some(lastButOne)
    case head :: tail => penultimate(tail)
  }

  println(penultimate(List()).getOrElse(""))
  println(penultimate(List('a')).getOrElse(""))
  println(penultimate(List(1,1,2,3,5,8)).getOrElse(""))
  println(penultimate(List('a','b','c','d','e','f')).getOrElse(""))
}

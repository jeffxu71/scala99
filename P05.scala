
import scala.annotation.tailrec

object P05 extends App {
  def reverse[T](l: List[T]): List[T] = l match {
    case Nil => Nil
    case h :: m :: Nil => List(m) ::: List(h)
    case h :: tail => reverse(tail) ::: List(h)
  }

  def tcoReverse[T](l: List[T]): List[T] = {
    @tailrec
    def loop[T](l: List[T], acc: List[T]): List[T] = l match {
      case Nil => acc
      case h :: Nil => List(h) ::: acc
      case h :: tail => loop(tail, List(h) ::: acc)
    }
    loop(l, List())
  }

  //println(tcoReverse(List(1,2,3,4,5,6)))
  //println(reverse(List.range(1, 10000))) // This triggers StackOverflow
  println(tcoReverse(List.range(1, 10000)))
}


import scala.annotation.tailrec

object P04 extends App {
  def length[T](l: List[T]): Int = l match {
    case Nil => 0
    case h :: tail => length(tail) + 1
  }

  def tcoLength[T](l: List[T]): Int = {
    @tailrec
    def loop[T](l: List[T], acc: Int = 0): Int = l match {
      case Nil => acc
      case h :: Nil => acc + 1
      case h :: tail => loop(l.tail, acc + 1)
    }
    loop(l)
  }

  println(length(List(1,1,2,3,5,8)))
  println(tcoLength(List("a","b","c","d","e","z")))
}



object P01 extends App {
  def last[T](l: List[T]): T = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def last2[T](l: List[T]): T = {
    l.reverse.head
  }

  println(last(List(1,1,2,3,5,8)))
  println(last(List('a','b','c','d','e')))

  println(last2(List(1,1,2,3,5,8)))
  println(last2(List('a','b','c','d','e')))
}

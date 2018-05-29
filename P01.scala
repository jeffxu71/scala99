

object P01 extends App {
  def last[T](l: List[T]): T = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  println(last(List(1,1,2,3,5,8)))
  println(last(List('a','b','c','d','e')))
}

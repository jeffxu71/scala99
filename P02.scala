
object P02 extends App {
  def penultimate[T](l: List[T]): T = l match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  println(penultimate(List(1,1,2,3,5,8)))
  println(penultimate(List('a','b','c','d','e','f')))
  // Case below will cause an exception thrown
  //println(penultimate(List('a')))
}

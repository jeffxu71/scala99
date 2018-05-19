
sealed abstract class NestedList[+T] {
  val isEmpty: Boolean
  def head: Either[T, NestedList[T]]
  def tail: NestedList[T]
  def #: [U >: T]: NestedList[U] = new #:(u, this)
  def #: [U >: T](ul: NestedList[U]): NestedList[U] = new #:(ul, this)
}

case object NestedNil extends NestedList[Nothing] {
  override val isEmpty = true
  def head: Either[Nothing, NestedList[Nothing]] = 
    throw new NoSuchElementException("head of empty list")
  def tail: NestedList[Nothing] = 
    throw new NoSuchElementException("tail of empty list")
}

final case class #:[T](private var hd: Either[T, NestedList[T]],
  private var tl: NestedList[T]) extends NestedList[+T] {
    override val isEmpty: Boolean = false
    def this(hd:T, tl:NestedList[+T]) = this(Left(hd), tl)
    def this(hd:NestedList[+T], tl: NestedList[+T]) = this(Right(hd), tl)
    def head: Either[T, NestedList[T]] = hd
    def tail: NestedList[T] = tl
}

object P07 extends App {
  def flatten[T](list:NestedList[T]): List[T] = list match {
    case NestedNil => Nil
    case Right(NestedNil) #: tail => flatten(tail)
    case Right(head) #: tail => flatten(head) ::: flatten(tail)
    case Left(head) #: tail => head :: flatten(tail)
  }

  println(flatten(List(List(1,1), 2, List(3, List(5, 8)))))
}

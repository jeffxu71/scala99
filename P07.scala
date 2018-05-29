
object P07 extends App {
  def flatten[T](l: List[Any]): List[T] = {
    var acc = List[T]()
    l foreach ( e => e match {
      case b: T => acc = acc :+ b
      case a: List[Any] => acc = acc ::: flatten(a)
    })
    acc
  }

  println(flatten(List(List(1,"a"), 2, List(3, List(5, 8)))))
}

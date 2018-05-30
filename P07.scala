
object P07 extends App {
  def flatten[Any](l: List[Any]): List[Any] = {
    var acc = List[Any]()
    l foreach ( e => e match {
      case a: List[Any] => acc = acc ::: flatten(a)
      case b: Any => acc = acc :+ b
    })
    acc
  }

  println(flatten(List(List(1,1), 2, List(3, List(5, 8, List(0))),9)))
}

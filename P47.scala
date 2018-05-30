

object P47 extends App {

  def And(a: Boolean, b: Boolean): Boolean = {
    if (a == true && b == true) true else false
  }

  def Or (a: Boolean, b: Boolean): Boolean = {
    if (a == true || b == true) true else false
  }

  def Not(a: Boolean): Boolean = {
    if (a == true) false else true
  }

  def Nand(a: Boolean, b: Boolean): Boolean = {
    if (a == true && b == true) false else true
  }

  def Nor(a: Boolean, b: Boolean): Boolean = {
    if (a == true || b == true) false else true
  }

  def Xor(a: Boolean, b: Boolean): Boolean = {
    if (a == b) false else true
  }

  def Imply(a: Boolean, b: Boolean): Boolean = {
    if (a == true && b == false) false else true
  }

  def Equ(a: Boolean, b: Boolean): Boolean = {
    if (a == b) true else false
  }

  def Table(fn: (Boolean, Boolean) => Boolean): Unit = {
    val format = s"%6s %6s %6s\n"
    printf(format, "A", "B", "result")
    for {
      e <- List(true, false)
      f <- List(true, false)
    } yield (printf(format, e, f, fn(e, f)))
  }

  Table((a: Boolean, b: Boolean) => And(a, Or(a, Not(b))))
}

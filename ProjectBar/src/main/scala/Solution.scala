object Solution {

  /**
   * Sample class.
   */
  sealed abstract class Bar

  case class Number(n: Int) extends Bar

  def addOne(number: Number): Number = {
    Number(number.n + 1)
  }
}


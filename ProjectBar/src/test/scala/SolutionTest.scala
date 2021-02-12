//test: StudentTest

import org.scalatest.FunSuite
import Solution._

class SolutionTest extends FunSuite {

  test("Assert 1+1==2") {
    assertResult(Number(2)) {
      addOne(Number(1))
    }
  }
}

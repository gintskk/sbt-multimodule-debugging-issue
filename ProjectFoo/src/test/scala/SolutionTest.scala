//test: StudentTest

import org.scalatest.FunSuite
import Solution._

class SolutionTest extends FunSuite {

  test("Concatenate strings") {
    assertResult(Message("test one")) {
      concat(Message("test "), Message("one"))
    }
  }
}

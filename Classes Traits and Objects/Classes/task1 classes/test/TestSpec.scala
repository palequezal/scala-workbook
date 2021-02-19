import org.scalatest.{MustMatchers, WordSpec}

class TestSpec extends WordSpec with MustMatchers {
  "A car" must {
    "be described correctly" in new Task {
      val testCar = new Car("Red", 120, "Audi")
      testCar.describe mustBe "Red Audi with a top speed of 120"
    }
  }
}

case class CrustSize() {
  sealed abstract class CrustSize
  object CrustSize {
    case object Small extends CrustSize
    case object Medium extends CrustSize
    case object Large extends CrustSize
  }
  sealed abstract class CrustType
  object CrustType {
    case object Thin extends CrustType
    case object Thick extends CrustType
    case object Regular extends CrustType
  }
  sealed abstract class Topping
  object Topping {
    case object Cheese extends Topping
    case object Pepperoni extends Topping
    case object BlackOlives extends Topping
    case object GreenOlives extends Topping
    case object Onions extends Topping
  }
}

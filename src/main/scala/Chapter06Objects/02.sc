abstract class UnitConversion {
  def apply(unit: Double): Double
}

object InchesToCentimetres extends UnitConversion {
  override def apply(unit: Double): Double = unit * 2.54
}

object GallonsToLitres extends UnitConversion {
  override def apply(unit: Double): Double = unit * 3.78541
}

object MilesToKilometres extends UnitConversion {
  override def apply(unit: Double): Double = unit * 1.60934
}

InchesToCentimetres(50)
GallonsToLitres(50)
MilesToKilometres(50)

//alternative solution
abstract class UnitConversion2(coef: Double){
  def apply(unit: Double) = coef * unit
}

object InchesToCentimetres2 extends UnitConversion2(2.54)
object GallonsToLitres2 extends UnitConversion2(3.78541)
object MilesToKilometres2 extends UnitConversion2(1.60934)

InchesToCentimetres(50)
GallonsToLitres(50)
MilesToKilometres(50)

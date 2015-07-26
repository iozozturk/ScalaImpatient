object Cards extends Enumeration{
  type CardSuite = Value

  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")

  def isRed(card: CardSuite) = card == Heart || card == Diamond
}

Cards.isRed(Cards.Diamond)

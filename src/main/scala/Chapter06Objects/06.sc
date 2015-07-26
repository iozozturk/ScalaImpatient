object Cards extends Enumeration{
  type CardSuite = Value

  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}

Cards.Club
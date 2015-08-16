class BankAccount(initialBalance: Double) {
  private var _balance = initialBalance
  def balance = _balance
  def currentBalance = _balance
  def deposit(amount: Double) : Double = { _balance += amount; _balance }
  def withdraw(amount: Double) : Double = { _balance -= amount; _balance }
}

class SavingsAccount(initialBalance: Double,
                      val interestRate: Double = 0.7,
                      val freeTransactions: Double = 3,
                      val commission: Double = 1) extends BankAccount(initialBalance) {

  var transactionCount = 0

  def isFreeTransaction = transactionCount <= freeTransactions

  override def deposit(amount: Double) = {
    transactionCount += 1
    super.deposit(amount - (if (isFreeTransaction) 0 else commission))

  }
  override def withdraw(amount: Double) = {
    transactionCount += 1
    super.withdraw(amount + (if (isFreeTransaction) 0 else commission))
  }


  def earnMonthlyInterest {
    transactionCount = 0
    super.deposit(balance * interestRate / 12)
  }
}

val account = new SavingsAccount(100)

account deposit 3
account withdraw 1
account withdraw 3
account withdraw 5
account earnMonthlyInterest

println(account.balance)

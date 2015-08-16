class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) : Double = { balance += amount; balance }
  def withdraw(amount: Double) : Double = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance){
  override def withdraw(amount: Double): Double = super.withdraw(amount + 1)
  override def deposit(amount: Double): Double = super.deposit(amount - 1)
}

val bankAccount = new BankAccount(100)
bankAccount.currentBalance
bankAccount.deposit(10)
bankAccount.withdraw(30)
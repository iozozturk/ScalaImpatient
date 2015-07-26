class BankAccount {
  private var _balance = 0

  def balance = _balance

  def deposit(deposit: Int): Unit = {
    _balance += deposit
  }

  def withdraw(amount: Int) : Int = {
    if (_balance >= amount){
      _balance -= amount
      _balance
    } else {
      throw new Exception("not enough balance")
    }
  }
}

val account = new BankAccount
account.deposit(100)
account.withdraw(70)
account.withdraw(70)

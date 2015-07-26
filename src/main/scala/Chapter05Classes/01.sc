class Counter {
  private var value = Int.MaxValue
  def increment() { if(value >= Int.MaxValue) Int.MaxValue else value += 1}
  def current() = value
}

val counter = new Counter
counter.current()
counter.increment()
counter.current()
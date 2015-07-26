class Time(var hrs: Int = 0, var min: Int = 0) {

  def hours = hrs

  def mins = min

  def before(other: Time) = hrs * 60 + min < other.hrs * 60 + other.min

}

val time1 = new Time(1, 30)
val time2 = new Time(1, 40)

time1.before(time2)
time2.before(time1)
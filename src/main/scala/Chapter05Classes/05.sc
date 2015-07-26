import scala.beans.BeanProperty

class Student(_name: String, _id:String){
  @BeanProperty var name = _name
  @BeanProperty var id = _id
}

val stud = new Student("ismet", "123")

stud.getId
stud.setId("234")
stud.getId

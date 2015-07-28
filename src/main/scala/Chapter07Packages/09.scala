import java.lang.System

object Greeting extends App {
  val username = System.getProperty("user.name")
  print("Password for " + username + ": ");
  val password = Console.readLine
  if(password.equals("secret")) System.out.println("Hello " + username)
  else System.err.println("Invalid password")
}
import cats.{Id, ~>}

object Interpreter {
  type ConsoleType[A] = Id[A]

  val consoleIntepreter = new (Actions ~> Id) {
    override def apply[A](fa: Actions[A]) = fa match {
      case FindUser(user: String) => User("ponch", "Fabio", "Ponciroli", "pass")
      case LoginUser(u: User, p: String) => p.equals(u.password)
    }
  }

}

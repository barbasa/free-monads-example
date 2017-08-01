import cats.free.Free

object Programme {

  import DSL._

  def findUserWithUsername(name: String)(implicit AOps: ActionOps[Actions]): Free[Actions, User] = {

    import AOps._

    findUser(name)

  }

  def findUserAndLogin(name: String, password: String)(implicit AOps: ActionOps[Actions]): Free[Actions, Boolean] = {
    import AOps._

    for {
      u <- findUser(name)
      loggedIn <- loginUser(u, password)
    } yield loggedIn

  }

}

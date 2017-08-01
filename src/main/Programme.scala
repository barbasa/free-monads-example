import cats.free.Free

object Programme {

  import DSL._

  def findUserWithUsername(name: String)(implicit AOps: ActionOps[Actions]): Free[Actions, User] = {

    import AOps._

    findUser(name)

  }

}

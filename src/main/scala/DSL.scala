import cats.free.{Free, Inject}


object DSL {

  class ActionOps[F[_]](implicit A: Inject[Actions, F]) {

    def findUser(name: String): Free[F, User] = Free.inject[Actions, F](FindUser(name))

    def loginUser(user: User, password: String): Free[F, Boolean] = Free.inject[Actions, F](LoginUser(user, password))

  }

  object ActionOps {
    implicit def actionOps[F[_]](implicit I: Inject[Actions, F]): ActionOps[F] =
      new ActionOps[F]
  }

}

import scalaz.{Free, Inject}

object DSL {

  class ActionOps[F[_]](implicit A: Inject[Actions, F]) {

    def findUser(name: String): Free[F, User] = Free.inject[Actions, F](FindUser(name))

  }
}

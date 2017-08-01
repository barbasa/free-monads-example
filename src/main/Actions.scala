sealed trait Actions[A]

case class FindUser(name: String) extends Actions[User]
case class LoginUser(user: User, password: String) extends Actions[Boolean]


////

case class User(name: String)

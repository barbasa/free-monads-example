sealed trait Actions[A]

case class FindUser(name: String) extends Actions[User]
case class LoginUser(user: User, password: String) extends Actions[Boolean]


////

case class User(userName: String, firstName: String, lastName: String, password: String)

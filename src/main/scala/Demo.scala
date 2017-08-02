object Demo {
  def main(args: Array[String]): Unit = {
    val goodLogin = Programme.findUserAndLogin("ponch", "pass").foldMap(Interpreter.consoleIntepreter)
    val badLogin = Programme.findUserAndLogin("ponch", "password").foldMap(Interpreter.consoleIntepreter)

    println(s"Good login: $goodLogin")
    println(s"Bad login: $badLogin")
  }
}

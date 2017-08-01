name := "somemonads"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut" %%  "monocle-core"  % "1.4.0",
  "com.github.julien-truffaut" %%  "monocle-macro" % "1.4.0",
  "com.github.julien-truffaut" %%  "monocle-law"   % "1.4.0" % "test"
)

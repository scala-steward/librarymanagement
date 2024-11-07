addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.1.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("org.scala-sbt" % "sbt-contraband" % "0.5.1")

scalacOptions += "-language:postfixOps"

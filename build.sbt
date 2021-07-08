
name := "doobie-dep-demo"

version := "0.1"

scalaVersion := "2.13.6"

enablePlugins(JavaAppPackaging)

//val doobieV = "0.12.1"
val doobieV = "0.13.4"

libraryDependencies ++= List(
  "org.tpolecat" %% "doobie-core" % doobieV,
  "org.tpolecat" %% "doobie-hikari" % doobieV,
  "org.tpolecat" %% "doobie-quill" % doobieV,
)

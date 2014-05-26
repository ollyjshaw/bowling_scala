name := "bowling"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.6" % "test"


play.Project.playScalaSettings

testOptions in Test := Nil

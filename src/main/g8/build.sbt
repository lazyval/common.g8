organization := "$organization$"

name := "$name$"

// version is defined in version.sbt in order to support sbt-release

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-Ywarn-unused-import"     // 2.11 only
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

initialCommands in console := "import $organization$._"

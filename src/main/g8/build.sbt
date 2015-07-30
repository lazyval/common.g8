organization := "$organization$"

name := "$name$"

// version is defined in version.sbt in order to support sbt-release

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlint")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.0" % "test"
)

initialCommands in console := "import $organization$._"

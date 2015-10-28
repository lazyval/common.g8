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
  "org.specs2" %% "specs2" % "2.0" % "test"
)

initialCommands in console := "import $organization$._"

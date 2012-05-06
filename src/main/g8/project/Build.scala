import sbt._
import sbt.Keys._
import com.typesafe.sbtscalariform.ScalariformPlugin._

object Build extends Build {

  lazy val root = Project(
    "$name$",
    file("."),
    settings = commonSettings ++ Seq(
      libraryDependencies ++= Seq(
      )
    )
  )

  def commonSettings = 
    Defaults.defaultSettings ++ 
    Seq(
      organization := "$organization$",
      scalaVersion := "2.9.2",
      scalacOptions ++= Seq("-unchecked", "-deprecation"),
      libraryDependencies ++= Seq(
        Dependencies.Test.Specs2,
        Dependencies.Test.ScalaCheck,
        Dependencies.Test.Mockito,
        Dependencies.Test.Hamcrest
      ),
      initialCommands in console := "import $organization$.$name$._"
    ) ++
    scalariformSettings

  object Dependencies {

    object Compile {
      val Config = "com.typesafe" % "config" % "0.4.0"
      val Scalaz = "org.scalaz" %% "scalaz-core" % "6.0.4"
    }

    object Test {
      val Specs2 = "org.specs2" %% "specs2" % "1.9" % "test"
      val ScalaCheck = "org.scalacheck" %% "scalacheck" % "1.9" % "test"
      val Mockito = "org.mockito" % "mockito-all" % "1.9.0" % "test"
      val Hamcrest = "org.hamcrest" % "hamcrest-all" % "1.1" % "test"
    }
  }
}

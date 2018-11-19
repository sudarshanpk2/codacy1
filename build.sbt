
import sbt._
import Keys.{libraryDependencies, _}

name := "codecy"

version := "1.1.1"

scalaVersion := "2.12.7"

lazy val calculator =
  project
  .in(file("."))
  .settings(
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/")

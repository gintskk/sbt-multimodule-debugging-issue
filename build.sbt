name := "sbt-multimodule-debugging-issue"

version := "0.1"

scalaVersion := "2.13.4"

lazy val ProjectFoo = project
  .settings(
    name := "ProjectFoo",
    libraryDependencies ++= commonDependencies
  )

lazy val ProjectBar = project
  .settings(
    name := "ProjectBar",
    libraryDependencies ++= commonDependencies
  )

lazy val commonDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
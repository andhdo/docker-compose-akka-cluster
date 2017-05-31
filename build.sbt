import com.typesafe.sbt.packager.docker._

enablePlugins(DockerPlugin)
enablePlugins(JavaAppPackaging)

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.1",
  "com.typesafe.akka" %% "akka-cluster" % "2.5.1"
)

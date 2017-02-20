name := """scala-consul"""

version := "1.2.2-SNAPSHOT"

scalaVersion := "2.11.8"

crossScalaVersions := Seq(scalaVersion.value)

scalacOptions ++= Seq(
  "-encoding", "UTF-8", "-deprecation", "-feature"
  ,"-Xfuture" //, "-Xverify", "-Xcheck-null"
  ,"-Ybackend:GenBCode"
  ,"-Ydelambdafy:method"
)

resolvers += "Bintray Typesafe Repo" at "http://dl.bintray.com/typesafe/maven-releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.5.8",
  "com.typesafe.play" %% "play-ws"   % "2.5.8"
)

organization := "com.x2sy"
organizationName := "x2sy"
organizationHomepage := Some(new URL("http://x2sy.com"))

description := "Consul Scala Client"

publishTo := {
  val nexus = "http://jci.x2sy.com/nexus/content/repositories/"
  if (isSnapshot.value)
    Some("x2sy Snapshots" at nexus + "snapshots/")
  else
    Some("x2sy Releases" at nexus + "releases/")
}

name := """pizza-papa"""
organization := "pizza-papa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

javaOptions ++= Seq("-Xmx4096M", "-Xms512M", "-XX:MaxPermSize=4096M")

scalaVersion := "2.12.4"

libraryDependencies += guice

libraryDependencies += jdbc
libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.8.6"
libraryDependencies += "org.apache.commons" % "commons-email" % "1.2"
libraryDependencies += "commons-io" % "commons-io" % "2.5"

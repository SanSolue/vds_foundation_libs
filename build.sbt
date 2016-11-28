
val common_settings = Seq(
  organization := "com.sansolue.vds",
  version := "1.0",
  scalaVersion := "2.11.7"
)

val akkaHttpV = "10.0.0"


val common_deps = Seq(
  libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % akkaHttpV,
  libraryDependencies += "com.google.code.gson" % "gson" % "2.8.0",
  libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7",
  libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  libraryDependencies += "org.specs2" %% "specs2" % "3.7" % Test
)

val root_settings = Seq(
  name := "foundation_libs"
)

lazy val root = project in file(".")

// ------------------------------------------
// --------- SSO Libraries ------------------
// ------------------------------------------

val sso_entity_settings = Seq(
name := "sso_entity"
)

val sso_entity_deps = Seq()

lazy val sso_entity = project settings(sso_entity_settings, sso_entity_deps)
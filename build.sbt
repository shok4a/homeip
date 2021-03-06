name := "homeip"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
  "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
  "com.amazonaws" % "aws-java-sdk-route53" % "1.10.14",
  "com.typesafe" % "config" % "1.3.0",
  "com.typesafe.play" %% "play-json" % "2.4.4",
  "com.github.tototoshi" %% "play-json-naming" % "1.0.0",
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.scalatest" %% "scalatest" % "3.0.0-M7" % "test"
)

name := "home-ip"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
  "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0-M7"
)

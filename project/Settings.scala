import sbt._
import sbt.Keys._

object Settings {
  val commonSettings = Seq(
    scalaVersion := "3.2.1",
    scalacOptions := Seq(
      "-deprecation", // Emit warning and location for usages of deprecated APIs
      "-feature", // Emit warning and location for usages of features that should be imported explicitly
      "-explain-types", // Explain type errors in more detail
      "-unchecked" // Enable additional warnings where generated code depends on assumptions
    )
  )
}

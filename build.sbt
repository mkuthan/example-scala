import Dependencies._
import Settings._

lazy val root = (project in file("."))
  .settings(
    name := "example-scala",
    commonSettings,
    libraryDependencies ++= Seq(
      munit % Test
    )
  )


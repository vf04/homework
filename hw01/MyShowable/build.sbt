name := "MyShowable"
version := "0.1"
organization := "none"

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines")

crossPaths := false // drop off Scala suffix from artifact names.
autoScalaLibrary := false // exclude scala-library from dependencies

javaSource in Compile := baseDirectory.value / "src/"

import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

object ApplicationBuild extends Build {

    val appName         = "play2-crud-simple"
    val appVersion      = "0.7.4-SNAPSHOT"
    val appScalaVersion = "2.11.1"

    val appDependencies = Seq(
        javaCore, javaJdbc, javaEbean,
        "play2-crud" %% "play2-crud" % "0.7.4-SNAPSHOT",
        "postgresql" % "postgresql" % "9.1-901.jdbc4",
        "play2-crud" %% "play2-crud" % "0.7.4-SNAPSHOT" classifier "assets"
    )

    val main = Project(appName, file(".")).enablePlugins(play.PlayJava).settings(
        version := appVersion,
        scalaVersion := appScalaVersion,
        libraryDependencies ++= appDependencies,
        //maven repository
        resolvers += "release repository" at  "http://hakandilek.github.com/maven-repo/releases/",
        resolvers += "snapshot repository" at "http://hakandilek.github.com/maven-repo/snapshots/"
    )

}

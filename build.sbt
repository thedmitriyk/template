ThisBuild / name         := "template"
ThisBuild / organization := "com.thedmitriyk"

ThisBuild / scalaVersion     := "3.3.1"
ThisBuild / packageTimestamp := Package.gitCommitDateTimestamp

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-encoding", "UTF-8",
  "-language:higherKinds",
  "-language:existentials",
  "-language:implicitConversions",
  "-Xfatal-warnings"
)

resolvers ++= Resolver.sonatypeOssRepos("releases") ++
              Resolver.sonatypeOssRepos("snapshots")

libraryDependencies ++= Seq( // published for Scala 3
  "org.scalameta" %% "munit" % "1.0.0-M9" % Test
)

// libraryDependencies ++= Seq( // published for Scala 2.13
// 
// ).map(_.cross(CrossVersion.for3Use2_13))

libraryDependencies ++= Seq( // published for no particular version
  "com.typesafe"   % "config"          % "1.4.2",
  "ch.qos.logback" % "logback-classic" % "1.4.11"
)

dependencyAllowPreRelease := true

Global / onChangedBuildSource := ReloadOnSourceChanges
Global / excludeLintKeys      += ThisBuild / name

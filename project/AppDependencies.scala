import sbt._

object AppDependencies {
  import play.core.PlayVersion

  val compile: Seq[ModuleID] = Seq(
    play.sbt.PlayImport.ws,
    "org.reactivemongo" %% "play2-reactivemongo"            % "0.20.13-play27",
    "uk.gov.hmrc"       %% "govuk-template"                 % "5.63.0-play-27",
    "uk.gov.hmrc"       %% "play-health"                    % "3.16.0-play-27",
    "uk.gov.hmrc"       %% "play-ui"                        % "9.0.0-play-27",
    "uk.gov.hmrc"       %% "play-conditional-form-mapping"  % "1.6.0-play-27",
    "uk.gov.hmrc"       %% "bootstrap-frontend-play-27"     % "4.1.0",
    "uk.gov.hmrc"       %% "domain"                         % "5.10.0-play-27",
    "com.typesafe.play" %% "play-json-joda"                 % "2.7.4",
    "org.typelevel"     %% "cats-core"                      % "2.0.0",
    "uk.gov.hmrc"       %% "tax-year"                       % "1.1.0",
    "uk.gov.hmrc"       %% "play-language"                  % "4.10.0-play-27"
  )

  val test: Seq[ModuleID] = Seq(
    "org.pegdown"              % "pegdown"                % "1.6.0",
    "org.scalatest"           %% "scalatest"              % "3.0.8",
    "org.scalatestplus.play"  %% "scalatestplus-play"     % "4.0.3",
    "org.jsoup"                % "jsoup"                  % "1.12.1",
    "com.typesafe.play"       %% "play-test"              % PlayVersion.current,
    "org.mockito"              % "mockito-all"            % "1.10.19",
    "org.scalacheck"          %% "scalacheck"             % "1.14.3",
    "wolfendale"              %% "scalacheck-gen-regexp"  % "0.1.2",
    "com.github.tomakehurst"   % "wiremock-standalone"    % "2.25.1"
  ).map(_ % "test")

  def apply(): Seq[ModuleID] = compile ++ test

  val akkaVersion = "2.6.7"
  val akkaHttpVersion = "10.1.12"

  val overrides = Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-protobuf" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "commons-codec"     % "commons-codec" % "1.12"
  )
}
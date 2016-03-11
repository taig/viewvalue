lazy val root = project.in( file( "." ) )
    .settings( Settings.common )
    .settings(
        name := "ViewValue",
        normalizedName := "viewvalue",
        publish := (),
        publishLocal := (),
        publishArtifact := false
    )
    .aggregate( core, design )

lazy val core = project
    .settings( androidBuildAar ++ Settings.common ++ Settings.android )
    .settings(
        minSdkVersion := "1",
        name := "viewvalue-core",
        packageForR := s"${organization.value}.resource"
    )

lazy val design = project
    .settings( androidBuildAar ++ Settings.common ++ Settings.android )
    .settings(
        libraryDependencies ++=
            "com.android.support" % "design" % "23.2.1" ::
            Nil,
        minSdkVersion := "7",
        name := "viewvalue-design",
        packageForR := s"${organization.value}.design.resource"
    )
    .dependsOn( core )
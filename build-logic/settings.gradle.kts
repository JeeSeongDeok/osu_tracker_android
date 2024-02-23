enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS") // 컴파일 시 타입 검사가 이루어지지 않음
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
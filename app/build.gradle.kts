plugins {
    id("osu_tracker.android.application")
//    id("osu_tracker.android.library")
    id("osu_tracker.android.compose")
}

android {
    namespace = "com.duck.osu_tracker"

    defaultConfig {
        applicationId = "com.duck.osu_tracker"
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.landscapist.bom)
    implementation(libs.landscapist.coil)
    implementation(libs.landscapist.placeholder)
    implementation(libs.androidx.glance)
}
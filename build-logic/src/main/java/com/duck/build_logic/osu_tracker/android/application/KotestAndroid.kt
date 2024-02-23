package com.duck.build_logic.osu_tracker.android.application

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureKotestAndroid() {
    configureKotest()
    configureJUnitAndroid()
}

internal fun Project.configureJUnitAndroid() {
    androidExtension.apply {
        testOptions {
            unitTests.all { it.useJUnitPlatform() }
        }
    }
}
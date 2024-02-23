import com.duck.build_logic.osu_tracker.android.application.configureHiltAndroid
import com.duck.build_logic.osu_tracker.android.application.configureKotestAndroid
import com.duck.build_logic.osu_tracker.android.application.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()
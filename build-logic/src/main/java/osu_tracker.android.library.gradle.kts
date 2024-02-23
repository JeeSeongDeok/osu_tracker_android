import com.duck.build_logic.osu_tracker.android.application.configureKotlinAndroid
import com.duck.build_logic.osu_tracker.android.application.configureKotest
import com.duck.build_logic.osu_tracker.android.application.configureCoroutineAndroid
import com.duck.build_logic.osu_tracker.android.application.configureHiltAndroid


plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
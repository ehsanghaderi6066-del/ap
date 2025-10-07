plugins { id("com.android.application") }

android {
    namespace = "com.example.hellogithub"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hellogithub"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release { isMinifyEnabled = false }
        debug { }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies { }

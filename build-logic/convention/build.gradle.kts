plugins {
    `kotlin-dsl`
}

group = "com.whenoffline.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {

        register("androidApplication") {
            id = "anolcera.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidFeature") {
            id = "anolcera.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }

        register("androidLibrary") {
            id = "anolcera.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidApplicationCompose"){
            id = "anolcera.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibraryCompose"){
            id = "anolcera.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("jvmLibrary"){
            id = "anolcera.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

        register("androidHilt") {
            id = "anolcera.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

        register("androidFirebase") {
            id = "anolcera.android.application.firebase"
            implementationClass = "AndroidApplicationFirebaseConventionPlugin"
        }
    }
}

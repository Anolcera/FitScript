// Top-level build file where you can add configuration options common to all sub-projects/modules.

@file:Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.hilt) apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("com.android.dynamic-feature") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
}
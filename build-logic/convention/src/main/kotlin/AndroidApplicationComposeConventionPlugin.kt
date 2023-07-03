@file:Suppress("unused")

import com.android.build.api.dsl.ApplicationExtension
import com.whenoffline.renta.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply("com.android.application")
            /* Same as below
            extensions.configure<ApplicationExtension>{
                configureAndroidCompose(this@configure)
            }*/
            val extension = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}
description = ""

kotlin {
    sourceSets {
        val jvmMain by getting {
            dependencies {
                api("org.webjars:webjars-locator-core:0.52")
            }
        }
        val jvmTest by getting {
            dependencies {
                api("org.webjars:jquery:3.3.1")
            }
        }
    }
}

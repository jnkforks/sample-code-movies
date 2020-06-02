package io.petros.movies.config.deps

import Plugins
import io.petros.movies.config.utils.Utils

@Suppress("MayBeConstant", "MemberVisibilityCanBePrivate")
object Deps {

    object LeakCanary {

        val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:${Versions.LeakCanary.LEAK_CANARY}"

    }

    // PROJECT // ***********************************************************************************************************

    object Project {

        object Implementation {

            object Kotlin {

                const val UTILS = "${Utils.COLON}utils"
                const val DOMAIN = "${Utils.COLON}domain"
                const val NETWORK = "${Utils.COLON}network"

            }

            object Android {

                @Suppress("MemberNameEqualsClassName")
                object Core {

                    const val ANDROID_UTILS = "${Utils.COLON}android-utils"
                    const val DATA = "${Utils.COLON}data"
                    const val CORE = "${Utils.COLON}core"

                }

                object Feature {

                    const val MOVIES = "${Utils.COLON}feature${Utils.COLON}movies"
                    const val PICKER = "${Utils.COLON}feature${Utils.COLON}picker"
                    const val MOVIE_DETAILS = "${Utils.COLON}feature${Utils.COLON}movie-details"

                }

            }

        }

        object TestImplementation {

            object Kotlin {

                const val TEST = "${Utils.COLON}test"

            }

            object Android {

                const val ANDROID_TEST = "${Utils.COLON}android-test"

            }

        }

    }

    // IMPLEMENTATION // ****************************************************************************************************

    object Kotlin {

        object Core {

            val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Plugins.Version.KOTLIN}"
            val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${Plugins.Version.KOTLIN}"

        }

        object Coroutines {

            val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.COROUTINES}"
            val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.COROUTINES}"

            @Suppress("MemberNameEqualsClassName")
            object Test {

                val TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Kotlin.COROUTINES}"

            }

        }

    }

    @Suppress("MemberNameEqualsClassName")
    object Material {

        val MATERIAL = "com.google.android.material:material:${Versions.Material.MATERIAL}"

    }

    object Android {

        object Core {

            val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Android.Core.APP_COMPAT}"
            val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.Android.Core.RECYCLER_VIEW}"
            val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.Android.Core.CONSTRAINT_LAYOUT}"

        }

        object Ktx {

            val CORE = "androidx.core:core-ktx:${Versions.Android.Ktx.CORE}"

        }

        object Arch {

            object Core {

                val TESTING = "androidx.arch.core:core-testing:${Versions.Android.Arch.Core.CORE}"

            }

            object Lifecycle {

                val COMMON =
                    "androidx.lifecycle:lifecycle-common:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val COMMON_JAVA_8 =
                    "androidx.lifecycle:lifecycle-common-java8:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val LIVE_DATA =
                    "androidx.lifecycle:lifecycle-livedata:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val LIVE_DATA_CORE =
                    "androidx.lifecycle:lifecycle-livedata-core:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val LIVE_DATA_CORE_KTX =
                    "androidx.lifecycle:lifecycle-livedata-core-ktx:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val VIEW_MODEL =
                    "androidx.lifecycle:lifecycle-viewmodel:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val VIEW_MODEL_KTX =
                    "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"
                val PROCESS =
                    "androidx.lifecycle:lifecycle-process:${Versions.Android.Arch.Lifecycle.LIFECYCLE}"

            }

            object Navigation {

                val FRAGMENT_KTX =
                    "androidx.navigation:navigation-fragment-ktx:${Versions.Android.Arch.Navigation.NAVIGATION}"

                val UI_KTX =
                    "androidx.navigation:navigation-ui-ktx:${Versions.Android.Arch.Navigation.NAVIGATION}"

            }

        }

        object Test {

            val CORE = "androidx.test:core:${Versions.Android.Test.CORE}"
            val RULES = "androidx.test:rules:${Versions.Android.Test.CORE}"
            @Suppress("unused") val RUNNER = "androidx.test:runner:${Versions.Android.Test.CORE}"
            val J_UNIT = "androidx.test.ext:junit:${Versions.Android.Test.J_UNIT}"

            object Espresso {

                val CORE = "androidx.test.espresso:espresso-core:${Versions.Android.Test.ESPRESSO}"
                val CONTRIB = "androidx.test.espresso:espresso-contrib:${Versions.Android.Test.ESPRESSO}"

            }

            @Suppress("MemberNameEqualsClassName")
            object Robolectric {

                val ROBOLECTRIC = "org.robolectric:robolectric:${Versions.Android.Test.ROBOLECTRIC}"

            }

        }

    }

    object Architecture {

        object Mvi {

            val STATEFUL = "dev.fanie:stateful:${Versions.Architecture.Mvi.STATEFUL}"
            val STATEFUL_COMPILER = "dev.fanie:stateful-compiler:${Versions.Architecture.Mvi.STATEFUL}"

        }

    }

    object Di {

        object Koin {

            object Kotlin {

                val CORE = "org.koin:koin-core:${Versions.Di.Koin.KOIN}"

            }

            @Suppress("MemberNameEqualsClassName")
            object Android {

                val ANDROID = "org.koin:koin-android:${Versions.Di.Koin.KOIN}"
                val VIEW_MODEL = "org.koin:koin-androidx-viewmodel:${Versions.Di.Koin.KOIN}"

            }

        }

    }

    object Net {

        object OkHttp {

            val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.Net.OkHttp.OK_HTTP}"

        }

        object Rest {

            val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Net.Rest.RETROFIT}"
            val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.Net.Rest.RETROFIT}"

        }

    }

    object Image {

        @Suppress("MemberNameEqualsClassName")
        object Glide {

            val GLIDE = "com.github.bumptech.glide:glide:${Versions.Image.Glide.GLIDE}"

        }

    }

    object Util {

        val MONTH_YEAR_PICKER = "com.whiteelephant:monthandyearpicker:${Versions.Util.MONTH_YEAR_PICKER}"

    }

    object Log {

        val TIMBER = "com.jakewharton.timber:timber:${Versions.Log.TIMBER}"

    }

    // TEST IMPLEMENTATION // ***********************************************************************************************

    object Test {

        object JUnit {

            val J_UNIT_4 = "junit:junit:${Versions.Test.JUnit.J_UNIT_4}"
            val J_UNIT_5 = "org.junit.vintage:junit-vintage-engine:${Versions.Test.JUnit.J_UNIT_5}"

        }

        object Spek {

            val DSL = "org.spekframework.spek2:spek-dsl-jvm:${Versions.Test.Spek.SPEK}"
            val J_UNIT_5 = "org.spekframework.spek2:spek-runner-junit5:${Versions.Test.Spek.SPEK}"

        }

        object Integration {

            val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:${Versions.Net.OkHttp.OK_HTTP}"

        }

        object Assert {

            val STRIKT = "io.strikt:strikt-core:${Versions.Test.Assert.STRIKT}"

        }

        object Mock {

            val MOCK_K = "io.mockk:mockk:${Versions.Test.Mock.MOCK_K}"

        }

    }

}

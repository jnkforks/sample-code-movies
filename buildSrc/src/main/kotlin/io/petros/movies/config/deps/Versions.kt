package io.petros.movies.config.deps

@Suppress("StringLiteralDuplication")
object Versions {

    object LeakCanary {

        // Releases: https://github.com/square/leakcanary/releases
        const val LEAK_CANARY = "2.3" // Released: 08-05-20

    }

    // IMPLEMENTATION // ****************************************************************************************************

    object Kotlin {

        // Releases: https://github.com/Kotlin/kotlinx.coroutines/releases
        const val COROUTINES = "1.3.7" // Released: 19-05-20

    }

    @Suppress("MemberNameEqualsClassName")
    object Material {

        // Releases: https://github.com/material-components/material-components-android/releases
        const val MATERIAL = "1.2.0-beta01" // Released: 28-05-20

    }

    object Android {

        object Core {

            // Releases: https://developer.android.com/jetpack/androidx/releases/appcompat
            const val APP_COMPAT = "1.1.0" // Released: 05-11-19

            // Releases: https://developer.android.com/jetpack/androidx/releases/recyclerview
            const val RECYCLER_VIEW = "1.1.0" // Released: 20-11-19

            // Releases: https://developer.android.com/jetpack/androidx/releases/constraintlayout
            const val CONSTRAINT_LAYOUT = "1.1.3" // Released: 16-12-19

        }

        object Ktx {

            // Releases: https://developer.android.com/jetpack/androidx/releases/core
            const val CORE = "1.3.0" // Released: 27-05-20

        }

        object Arch {

            object Core {

                // Releases: https://developer.android.com/jetpack/androidx/releases/arch
                const val TESTING = "2.1.0" // Released: 05-09-19

                object Navigation {

                    // Releases: https://developer.android.com/jetpack/androidx/releases/navigation
                    const val EXTENSIONS = "2.2.2" // Released: 22-01-20

                }

            }

            object Lifecycle {

                // Releases: https://developer.android.com/jetpack/androidx/releases/lifecycle
                const val EXTENSIONS = "2.2.0" // Released: 22-01-20

            }

        }

        object Test {

            // Releases: https://developer.android.com/jetpack/androidx/releases/test
            const val CORE = "1.2.0" // Released: 29-03-19

            // Releases: https://developer.android.com/jetpack/androidx/releases/test
            const val J_UNIT = "1.1.1" // Released: 29-03-19

            // Releases: https://developer.android.com/jetpack/androidx/releases/test
            const val ESPRESSO = "3.2.0" // Released: 29-03-19

            // Releases: https://github.com/robolectric/robolectric/releases
            const val ROBOLECTRIC = "4.3.1" // Released: 14-10-19

        }

    }

    object Architecture {

        object Mvi {

            // Releases: https://github.com/iFanie/Stateful/releases
            const val STATEFUL = "0.2.1" // 31-05-20

        }

    }

    object Di {

        @Suppress("MemberNameEqualsClassName")
        object Koin {

            // Releases: https://github.com/InsertKoinIO/koin/releases
            const val KOIN = "2.1.5" // Released: 23-03-20

        }

    }

    object Net {

        object OkHttp {

            // Releases: https://github.com/square/okhttp/releases
            const val OK_HTTP = "4.7.2" // Released: 20-05-20

        }

        object Rest {

            // Releases: https://github.com/square/retrofit/releases
            const val RETROFIT = "2.9.0" // Released: 20-05-20

        }

    }

    object Image {

        @Suppress("MemberNameEqualsClassName")
        object Glide {

            // Releases: https://github.com/bumptech/glide/releases
            const val GLIDE = "4.11.0" // Released: 09-01-20

        }

    }

    object Util {

        // Releases: https://mvnrepository.com/artifact/com.whiteelephant/monthandyearpicker
        const val MONTH_YEAR_PICKER = "1.3.0" // Released: 04-09-18

    }

    object Log {

        // Releases: https://github.com/JakeWharton/timber/releases
        const val TIMBER = "4.7.1" // Released: 28-06-18

    }

    // TEST IMPLEMENTATION // ***********************************************************************************************

    object Test {

        @Suppress("MemberNameEqualsClassName")
        object Spek {

            // Releases: https://github.com/spekframework/spek/releases
            const val SPEK = "2.0.10" // Released: 05-03-20

        }

        object JUnit {

            // Releases: https://github.com/junit-team/junit4/releases
            const val J_UNIT_4 = "4.13" // Released: 01-01-20

            // Releases: https://github.com/junit-team/junit5/releases
            const val J_UNIT_5 = "5.6.2" // Released: 10-04-20

        }

        object Assert {

            // Releases: https://github.com/robfletcher/strikt/releases
            const val STRIKT = "0.26.1" // Released: 11-05-20

        }

        object Mock {

            // Releases: https://github.com/mockk/mockk/releases
            const val MOCK_K = "1.10.0" // Released: 19-04-19

        }

    }

}

package io.petros.movies.config

import io.petros.movies.config.dirs.Files
import io.petros.movies.config.dirs.Folders

object Config {

    private const val QUALITY_DIRECTORY = "${Folders.Config.CONFIG}/${Folders.Config.Subfolder.QUALITY}"

    object Lint {

        const val CONFIG_FILE_PATH = "$QUALITY_DIRECTORY/${Files.Xml.LINT}"

        val disabledIssues = arrayOf(
            "MissingRegistered", // Because of UAST
            "UnusedIds", // Because of UAST
            "ContentDescription",
            "SelectableText"
        )

    }

    object Detekt {

        const val CONFIG_FILE_PATH = "$QUALITY_DIRECTORY/${Files.Yml.DETEKT}"

    }

    object Versions {

        const val GRADLE_RELEASE_CHANNEL = "release-candidate"
        const val OUTPUT_FORMATTER = "json,xml,txt"
        const val OUTPUT_DIR = "build/dependencyUpdates"
        const val REPORT_FILE_NAME = "report"

        const val REGEX = "^[0-9,.v-]+(-r)?$"
        val stableKeyword = listOf("RELEASE", "FINAL", "GA")
        val nonStableKeyword = listOf("M1")

    }

    object Jacoco {

        object Robolectric {

            val excludes = listOf("jdk.internal.*")
        }

        private const val REPORT_DIRECTORY_PATH = "build/reports/jacoco"
        private const val REPORT_HTML_DIRECTORY = "jacocoHtml"
        private const val REPORT_XML_FILE = "jacoco.xml"
        private const val REPORT_CSV_FILE = "jacoco.csv"

        const val GROUP = "Reporting"
        const val DESCRIPTION = "Generate Jacoco code coverage reports."

        const val REPORT_HTML_DIRECTORY_PATH = "$REPORT_DIRECTORY_PATH/$REPORT_HTML_DIRECTORY"
        const val REPORT_XML_FILE_PATH = "$REPORT_DIRECTORY_PATH/$REPORT_XML_FILE"
        const val REPORT_CSV_FILE_PATH = "$REPORT_DIRECTORY_PATH/$REPORT_CSV_FILE"

        fun dirPair(isKotlinModule: Boolean): Pair<String, Any> {
            val kotlinDir = "build/classes/kotlin/main"
            val androidDir = "build/tmp/kotlin-classes/debug"
            return "dir" to if (isKotlinModule) kotlinDir else androidDir
        }

        fun excludesPair(isKotlinModule: Boolean): Pair<String, Any> {
            val kotlinExcludes = listOf(
                "**/*Module*.*"
            )
            val androidExcludes = listOf(
                "**/*Activity*.*",
                "**/*Toolbar*.*",
                "**/*Module*.*",
                "**/*Binding*.*",
                "**/*Glide*.*"
            )
            return "excludes" to if (isKotlinModule) kotlinExcludes else androidExcludes
        }

        fun executionData(isKotlinModule: Boolean): String {
            val kotlinExecutionData = "build/jacoco/test.exec"
            val androidExecutionData = "build/jacoco/testDebugUnitTest.exec"
            return if (isKotlinModule) kotlinExecutionData else androidExecutionData
        }

    }

    object Coverage {

        const val REPORT_FILE_PATH = Jacoco.REPORT_XML_FILE_PATH
        const val CONFIG_FILE_PATH = "coverage.properties"

    }

}
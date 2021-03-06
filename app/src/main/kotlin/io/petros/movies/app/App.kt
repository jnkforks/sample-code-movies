@file:Suppress("unused")

package io.petros.movies.app

import android.app.Application
import android.os.Build
import android.os.StrictMode
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import io.petros.movies.BuildConfig
import io.petros.movies.R
import io.petros.movies.app.di.koin.appModule
import io.petros.movies.data.di.koin.dataModule
import io.petros.movies.domain.di.koin.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

@Suppress("TooManyFunctions")
open class App : Application(),
    LifecycleObserver {

    companion object {

        private const val THEMOVIEDB_URL = "https://api.themoviedb.org/"

    }

    override fun onCreate() {
        super.onCreate()
        initKoin()
        initLogging()
        initStrictMode()
        initLifecycleObserver()
        Timber.i("${getString(R.string.appName)} created.")
    }

    @Suppress("ForbiddenComment")
    private fun initKoin() {
        startKoin {
            androidLogger(Level.ERROR) // FIXME: Check again with a newer version of Koin (after 2.1.6)
            androidContext(this@App)
            modules(
                appModule() +
                        dataModule(
                            BuildConfig.DEBUG,
                            baseUrl(),
                            BuildConfig.THEMOVIEDB_API_KEY
                        ) +
                        domainModule()
            )
        }
    }

    open fun baseUrl() = THEMOVIEDB_URL

    private fun initLogging() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.v("${javaClass.simpleName} logging initialised.")
        }
    }

    private fun initStrictMode() {
        if (BuildConfig.DEBUG) {
            setThreadPolicyToStrictMode()
            setVmPolicyToStrictMode()
            Timber.v("${javaClass.simpleName} strict mode initialised.")
        }
    }

    private fun setThreadPolicyToStrictMode() {
        val strictModeBuilder = StrictMode.ThreadPolicy.Builder()
            .detectDiskReads()
            .detectDiskWrites()
            .detectNetwork()
            .detectCustomSlowCalls()
            .penaltyLog()
            .penaltyFlashScreen()
            .penaltyDialog()
        addAndroidMThreadPolicy(strictModeBuilder)
        addAndroidOThreadPolicy(strictModeBuilder)
        StrictMode.setThreadPolicy(strictModeBuilder.build())
    }

    private fun addAndroidMThreadPolicy(strictModeBuilder: StrictMode.ThreadPolicy.Builder) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            strictModeBuilder.detectResourceMismatches()
        }
    }

    private fun addAndroidOThreadPolicy(strictModeBuilder: StrictMode.ThreadPolicy.Builder) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            strictModeBuilder.detectUnbufferedIo()
        }
    }

    private fun setVmPolicyToStrictMode() {
        val strictModeBuilder = StrictMode.VmPolicy.Builder()
            .detectActivityLeaks()
            .detectFileUriExposure()
            .detectLeakedClosableObjects()
            .detectLeakedSqlLiteObjects()
            .detectLeakedRegistrationObjects()
            .penaltyLog()
        addAndroidOVmPolicy(strictModeBuilder)
        StrictMode.setVmPolicy(strictModeBuilder.build())
    }

    private fun addAndroidOVmPolicy(strictModeBuilder: StrictMode.VmPolicy.Builder) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            strictModeBuilder.detectCleartextNetwork()
                .detectContentUriWithoutPermission()
        }
    }

    private fun initLifecycleObserver() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }

    /* LIFECYCLE */

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreated() {
        Timber.v("${javaClass.simpleName} created.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Timber.v("${javaClass.simpleName} started. [App In Foreground]")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Timber.v("${javaClass.simpleName} resumed.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Timber.v("${javaClass.simpleName} paused.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Timber.v("${javaClass.simpleName} stopped. [App In Background]")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyed() {
        Timber.v("${javaClass.simpleName} destroyed.")
    }

}

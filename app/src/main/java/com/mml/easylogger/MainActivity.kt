package com.mml.easylogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils
import com.mml.loggerlibrary.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.debug(BuildConfig.DEBUG)
            .enableLog(true)
            .logDir(getExternalFilesDir("Logs")!!.path)
            .logSize(1*1024*1024L)
            .saveToDisk(true,this)
        Logger.i("onCreate")
        Logger.i("onCreate","MainActivity")

    }
}

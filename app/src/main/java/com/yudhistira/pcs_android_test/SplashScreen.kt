package com.yudhistira.pcs_android_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // TODO (SplashScreen)
        // 1. Get user from API then save it to DB (SQLite) with condition :
            // if on DB SQLite table user is null { get user from API then save to DB SQLite }
            // if not null { skip get user }
        // 2. Set permission Wifi
        // 3. Set permission Bluetooth
        // 4. Move to MainActivity
    }
}
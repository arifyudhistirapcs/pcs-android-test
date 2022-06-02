package com.yudhistira.pcs_android_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreatePostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        //TODO (SeePostActivity)
        // if from API {create post to API -> on success pop up sweet alert dialog "Success!" -> return to main activity }
        // if from SQLite {create post with sweet alert dialog when submitting for validation then save to DB Sqlite table posts -> on success show toast "Success!!" then return to main activity}
    }
}
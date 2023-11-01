package com.example.databindinginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoadBlankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_blank)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,BlankFragment())
            .commit()
    }
}
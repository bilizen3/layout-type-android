package com.flores.layout_type_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFrameLayout.setOnClickListener {
            startActivity(Intent(this, FrameActivity::class.java))
        }
        btnLinearlayout.setOnClickListener {

        }
    }
}
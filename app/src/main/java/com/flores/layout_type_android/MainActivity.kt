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
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }
        btnLinearlayout.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }
        btnRelativeLayout.setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }
        btnTableLayout.setOnClickListener {
            startActivity(Intent(this, TableLayoutActivity::class.java))
        }
        btnGridLayout.setOnClickListener {
            startActivity(Intent(this, GridLayoutActivity::class.java))
        }
    }
}

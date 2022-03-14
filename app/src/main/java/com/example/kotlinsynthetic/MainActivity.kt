package com.example.kotlinsynthetic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val testText = findViewById<TextView>(R.id.test_text)
//        val binding
//        binding.testText = "Hello Rafly"
        test_text.text = "Hello Rafly"
    }
}
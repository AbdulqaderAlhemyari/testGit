package com.example.test1git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.tv)
        btn= findViewById(R.id.GitBtn)

        btn.setOnClickListener {
            textView.text= "Welcome GitHub"
        }
    }
}
package com.example.test1git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    lateinit var textViewY:TextView
    lateinit var btn:Button
    lateinit var btnY:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.tv)
        textViewY=findViewById(R.id.tv_yaseen)
        btn= findViewById(R.id.GitBtn)

        btn.setOnClickListener {
            textView.text= "Welcome GitHub"
        }
        btnY= findViewById(R.id.GitBtn_yaseen)

        btnY.setOnClickListener {
            textViewY.text= "Welcome GitHub yaseen"
        }
    }
}
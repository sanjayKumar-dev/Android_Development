package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var mCounter: Int = 0;
//    var btn: Button;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.vt)
        var bl = findViewById<Button>(R.id.bt)

        bl.setOnClickListener {
            mCounter++
            tv.setText("Button Clicked $mCounter times")
        }
    }
}
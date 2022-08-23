package com.ongraph.mysdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ongraph.mylibrary.Test.test
import com.ongraph.mylibrary.Test.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.myText).text = test()
        findViewById<TextView>(R.id.myText).setOnClickListener { toast("My Toast") }
    }
}
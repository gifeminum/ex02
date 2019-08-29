package com.example.ex02

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundel = intent.extras
        var result:String = ""

        if(bundel!=null){
            result = bundel.getString("resultMinus")
        }
        else{
            Log.d("Intent","no data")
        }
        textView3.text = result

        add.setOnClickListener {
            var x : Int = editText.text.toString().toInt()
            var y : Int = editText2.text.toString().toInt()
            var z : Int = x+y
            var intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("resultAdd",z.toString())
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            var intent = Intent(this,DetailActivity::class.java)

            intent.putExtra("input1",editText.text.toString())

            startActivity(intent)
        }
        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }




}

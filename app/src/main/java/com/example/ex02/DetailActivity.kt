package com.example.ex02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val bundel = intent.extras
//        var result:String = ""
        var result2:String = ""

        if(bundel!=null){
//            result = bundel.getString("input1")
            result2 = bundel.getString("resultAdd")
        }
        else{
            Log.d("Intent","no data")
        }
//        resultText.text = result
        editText3.setText(result2)

        minus.setOnClickListener {
            var x : Int = editText3.text.toString().toInt()
            var y : Int = editText4.text.toString().toInt()
            var z : Int = x-y
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("resultMinus",z.toString())
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item!!.getItemId()
        if (id == android.R.id.home){
            finish()
        }

        return super.onOptionsItemSelected(item)
    }


}

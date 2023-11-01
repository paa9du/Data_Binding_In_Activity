package com.example.databindinginactivity

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindinginactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainBinding:ActivityMainBinding by lazy{
       DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding.printBtn.setOnClickListener {
            if(mainBinding.edTitle.text.toString().isEmpty())
            {
                mainBinding.edTitle.error="Required"
            }
            else  if(mainBinding.edDesc.text.toString().isEmpty())
            {
                mainBinding.edTitle.error="Required"
            }
            else{
                mainBinding.titleStr=mainBinding.edTitle.text.toString()
                mainBinding.descStr=mainBinding.edDesc.text.toString()
            }
        }
        mainBinding.DataBindingBtn.setOnClickListener {
            startActivity(Intent(this,LoadBlankActivity::class.java))
        }
    }
}
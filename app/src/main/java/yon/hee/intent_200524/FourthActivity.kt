package yon.hee.intent_200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        val phone = intent.getStringExtra("content")
        pho

//        val myContent = intent.getStringExtra("content")
//
//        val myNumber = intent.getIntExtra("number",-1)
//        contentTxt.text = myContent

    }
}

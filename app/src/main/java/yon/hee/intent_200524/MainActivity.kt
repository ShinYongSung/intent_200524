package yon.hee.intent_200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)

        }
        goToSecondBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

        goToThirdBtn.setOnClickListener {

            val inputContent = contentEdt.text.toString()
            myIntent.putExtra("Content", inputContent)
            val myIntent = Intent(this, ThirdActivity::class.java)
            startActivity(myIntent)
        }
    }

}

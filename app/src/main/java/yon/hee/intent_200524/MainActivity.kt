package yon.hee.intent_200524

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1000

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
            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("content", inputContent)
            myIntent.putExtra("number", -1)
            startActivity(myIntent)
        }

//        품번을 입력받아서, 네번째 액티비티 (fourthActivity)

        goToFourthBtn.setOnClickListener {
            val inputPhoneNum = phoneNumberEdt.text.toString()

            val myIntent = Intent(this,FourthActivity::class.java)
            myIntent.putExtra("phone", inputPhoneNum )
            startActivity(myIntent)

        }

        editNickNameBtn.setOnClickListener {
        val myIntent = Intent(this, EditNickNameActivity::class.java)
        startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {

                val newNickName = data?.getStringExtra("nick")

                nickNameTxt.text = newNickName
            }
        }
    }

}

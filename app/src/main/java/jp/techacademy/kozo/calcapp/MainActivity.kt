package jp.techacademy.kozo.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_button.setOnClickListener { view: View? ->
            val intent = Intent(this, ResultActivity::class.java)

//            Log.d("test", editText.text.toString().length.toString())
//            Log.d("test", editText.text.toString().trim())

            if (editText.text.toString().trim().isEmpty() || editText2.text.trim().isEmpty()){
                Log.d("test", "empty error")
                intent.putExtra("error", "Error: You have to input a number.")
            } else {
                Log.d("test", "correct text")
                val resultVal = editText.text.toString().toFloat() + editText2.text.toString().toFloat()
                intent.putExtra("val", resultVal)
            }
            startActivity(intent)
        }

        minus_button.setOnClickListener { view: View? ->
            val intent = Intent(this, ResultActivity::class.java)

            if (editText.text.toString().trim().isEmpty() || editText2.text.trim().isEmpty()){
                Log.d("test", "empty error")
                intent.putExtra("error", "Error: You have to input a number.")
            } else {
                Log.d("test", "correct text")
                val resultVal = editText.text.toString().toFloat() - editText2.text.toString().toFloat()
                intent.putExtra("val", resultVal)
            }
            startActivity(intent)
        }

        time_button.setOnClickListener { view: View? ->
            val intent = Intent(this, ResultActivity::class.java)

            if (editText.text.toString().trim().isEmpty() || editText2.text.trim().isEmpty()){
                Log.d("test", "empty error")
                intent.putExtra("error", "Error: You have to input a number.")
            } else {
                Log.d("test", "correct text")
                val resultVal = editText.text.toString().toFloat() * editText2.text.toString().toFloat()
                intent.putExtra("val", resultVal)
            }
            startActivity(intent)
        }

        divine_button.setOnClickListener { view: View? ->
            val intent = Intent(this, ResultActivity::class.java)

            if (editText.text.toString().trim().isEmpty() || editText2.text.trim().isEmpty()){
                Log.d("test", "empty error")
                intent.putExtra("error", "Error: You have to input a number.")
            } else if (editText2.text.toString().toFloat() == 0.0F) {
                Log.d("test", "divine zero error")
                intent.putExtra("error", "Error: You cannot set zero to NUM2.")
            }
            else {
                Log.d("test", "correct text")
                val resultVal = editText.text.toString().toFloat() / editText2.text.toString().toFloat()
                intent.putExtra("val", resultVal)
            }
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    fun checkNum(v1: Float, V2: Float) {

    }

}
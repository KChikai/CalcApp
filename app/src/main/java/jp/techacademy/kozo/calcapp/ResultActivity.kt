package jp.techacademy.kozo.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // get data from main activity
        val resultVal = intent.getFloatExtra("val", 0.0F)
        val errorText = intent.getStringExtra("error")

        // show result
        if (errorText != null) {
            resultText.text = errorText
        } else {
            resultText.text = resultVal.toString()
        }

    }
}
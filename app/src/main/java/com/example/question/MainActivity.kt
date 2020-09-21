package com.example.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        true_button.setOnClickListener {
            val msg = Toast.makeText(
                    this, R.string.correct_toast, Toast.LENGTH_SHORT);
            msg.setGravity(Gravity.TOP, 0, 0);
            msg.show()


        }
        false_button.setOnClickListener {
            false_button.setOnClickListener {
                val msg = Toast.makeText(
                        this, R.string.correct_toast, Toast.LENGTH_SHORT);
                msg.setGravity(Gravity.TOP, 0, 0);
                msg.show()


            }

        }

    }
}
package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btnStart)
        val edtxtName: EditText = findViewById(R.id.edtxtName)
        btnStart.setOnClickListener {
            if(edtxtName.text.isEmpty()){
                Toast.makeText(this,"please enter your name",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constans.USER_NAME,edtxtName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
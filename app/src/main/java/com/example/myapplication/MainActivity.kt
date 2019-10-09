package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var truLogin : String = "TopLogin.com"
    var truPass : String = "1123581321"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun rr(v: View) {
        var userLogin : EditText = findViewById(R.id.login)
        var userPass : EditText = findViewById(R.id.pass)
        var res : ImageView = findViewById(R.id.pp)
        if (truLogin == userLogin.text.toString() && truPass == userPass.text.toString()) {
            var next : Intent = Intent (this, Main2Activity::class.java)
            startActivity(next)
        }
        else
            res.setImageResource(R.drawable.i)
    }
}
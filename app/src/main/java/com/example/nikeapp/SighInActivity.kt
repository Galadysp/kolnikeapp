package com.example.nikeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SighInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigh_in)
        email = findViewById(R.id.Email)
        password = findViewById(R.id.Password)
    }

    fun signin(view: View) {
        if(email.text.toString().equals("admin") && password.text.toString().equals("admin"))
        {
            val intent = Intent (this@SighInActivity,PageActivity::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Неверное имя пользователя или пароль")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }

    }
}
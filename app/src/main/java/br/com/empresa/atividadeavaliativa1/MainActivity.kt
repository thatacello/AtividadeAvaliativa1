package br.com.empresa.atividadeavaliativa1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener{
            val i = Intent(this, Inicio::class.java)
            startActivity(i)
        }
    }
}
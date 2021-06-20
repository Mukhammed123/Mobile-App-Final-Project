package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getStringExtra("id")
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")

        val idText = findViewById<TextView>(R.id.detailTvId)
        val nameText = findViewById<TextView>(R.id.detailTvName)
        val emailText = findViewById<TextView>(R.id.detailTvEmail)

        idText.text = id
        nameText.text = name
        emailText.text = email
    }
}
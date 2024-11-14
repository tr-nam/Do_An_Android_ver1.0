package com.example.do_an_android.src.controller

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.do_an_android.R

class ProductDetails_Activity : AppCompatActivity() {
    private lateinit var iconBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_product_details)
        setControl()
        setEvent()
    }
    private fun setControl(){
        iconBack = findViewById(R.id.icon_lessthan)
    }
    private fun setEvent(){
        iconBack.setOnClickListener(){
            val intent = Intent(this, Home_Activity::class.java)
            startActivity(intent)
        }
    }
}
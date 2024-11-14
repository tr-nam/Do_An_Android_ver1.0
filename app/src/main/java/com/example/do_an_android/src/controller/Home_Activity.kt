package com.example.do_an_android.src.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.do_an_android.R

class Home_Activity : AppCompatActivity() {
    private lateinit var clickDetails: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_home)
        setControl()
        setEvent()
    }
    private fun setControl() {
        clickDetails = findViewById(R.id.imgProduct)
    }
    private fun setEvent() {
        clickDetails.setOnClickListener() {
            val intent = Intent(this, ProductDetails_Activity::class.java)
            startActivity(intent)//Khởi chạy Activity mới
        }
    }
}
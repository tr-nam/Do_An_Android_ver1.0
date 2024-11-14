package com.example.do_an_android.src.controller

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.db.williamchart.view.BarChartView
import com.db.williamchart.view.DonutChartView
import com.db.williamchart.view.LineChartView
import com.example.do_an_android.R

class ChartAction : AppCompatActivity() {

    private lateinit var barChart : BarChartView
    private lateinit var lineChart : LineChartView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.admin_chart)

        setControl()
        setValue()
    }

    private fun setControl() {
        barChart = findViewById(R.id.barChart)
        lineChart = findViewById(R.id.lineChart)
    }

    private fun setValue() {
        val barItem = listOf(
            "2021" to 5f,
            "2022" to 9f,
            "2023" to 6.6f,
            "2024" to 6f
        )
        barChart.animate(barItem)
    }

}
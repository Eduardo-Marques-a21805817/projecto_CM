package com.example.projectocm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.GraphView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var grafico = findViewById<GraphView>(R.id.graficoSemanal)
    }
}
package com.example.semana_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        canvas.webChromeClient = object : WebChromeClient(){
        }
        canvas.webViewClient = object : WebViewClient(){
        }
        canvas.settings.javaScriptEnabled = true
        canvas.loadUrl("https://estudiantes.ugb.edu.sv/Home")

    }
}
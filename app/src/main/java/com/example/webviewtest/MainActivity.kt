package com.example.webviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.webviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // تعريف المتغير الخاص بـ View Binding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding.webViewPos){
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()

            val url = "https://youtu.be/yfRFsT_V2l8?list=PLAk7YKeYLNr7mbYYvT-bc2nNzegWn5CyR"
            val accessToken = "9iZ8s/Z/3YEZONQl8t4qqYBfj7qLyg+MV5OLfNsG+..." // your token
            val headers = mapOf(
                "Authorization" to "Bearer $accessToken" //add token to Header
            )
            loadUrl(url, headers)
            //     loadUrl(url)
        }
    }
}
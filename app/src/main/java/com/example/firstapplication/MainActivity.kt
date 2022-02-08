package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.out.println("hello ");
        System.out.println("hello ");

        setContentView(R.layout.activity_main)
    }
}
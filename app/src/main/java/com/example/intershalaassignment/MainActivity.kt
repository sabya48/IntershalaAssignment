package com.example.intershalaassignment

import com.example.intershalaassignment.R.id.*
import com.example.intershalaassignment.R.string.*
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(nav_view)
        val textMessage = findViewById<TextView>(message)

        navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                navigation_home -> textMessage.setText(title_home)
                navigation_dashboard -> textMessage.setText(dashboard)
                navigation_notifications -> textMessage.setText(notifications)
                else -> null
            } != null
        }
    }

}
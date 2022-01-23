package com.example.homework0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.homework0.fragments.userFragment

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            //add -   что надо добавить и куда надо добавить
            .add(R.id.container, userFragment())
            // commit - то что закончили
            .commit()
    }
}
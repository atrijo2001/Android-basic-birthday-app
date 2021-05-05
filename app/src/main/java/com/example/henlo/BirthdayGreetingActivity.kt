package com.example.henlo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_birthday_greeting.view.*

class BirthdayGreetingActivity : AppCompatActivity() {

    //Basically these are like props passing in ReactJS, we create a variable to avoic conflict in passing of names during passing of props
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)

        birthdayGreeting.text = "Happy Birthday\n $name!"

    }
}
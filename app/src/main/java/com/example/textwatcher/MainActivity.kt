package com.example.textwatcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var password: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        name = findViewById(R.id.etName)
        password = findViewById(R.id.etPassword)
        button = findViewById(R.id.btn_login)


        name.addTextChangedListener(textWatcher)

        password.addTextChangedListener(textWatcher)


    }


    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            button.isEnabled = !name.text.toString().trim().isEmpty() && !password.text.toString().trim().isEmpty()
        }

        override fun afterTextChanged(s: Editable?) {

        }
    }
}
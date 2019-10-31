package com.foursquare.jdwyer.buttoncounterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.btn)
        textView = findViewById(R.id.textView2)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("") // clear input when activity is loaded

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
//                userInput.text.clear() // need to do this b/c it's an editable
                userInput.setText("") // alternative syntax for clearing the text
            }
        })
    }
}

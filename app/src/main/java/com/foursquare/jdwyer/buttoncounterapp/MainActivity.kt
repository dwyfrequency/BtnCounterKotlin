package com.foursquare.jdwyer.buttoncounterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

//    Bundle can be used to pass state (data) around
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.btn)
        textView = findViewById(R.id.textView2)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("") // clear input when activity is loaded

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG, "onClick")

                textView?.append(userInput.text)
                textView?.append("\n")
//                userInput.text.clear() // need to do this b/c it's an editable
                userInput.setText("") // alternative syntax for clearing the text
            }
        })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "onSaveInstanceState")

    }



    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")

    }
}

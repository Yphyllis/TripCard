package com.yphyllis.tripcard

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btnGenerate)
        button.setOnClickListener {
            generateNow()
        }
    }

    private fun generateNow() {
        val mobile = findViewById<EditText>(R.id.editMobile).text.toString()
        val routeArea = findViewById<EditText>(R.id.editRouteArea).text.toString()
        if (mobile.isEmpty()) {
            toast("手机号不能为空")
            return
        }
        if (routeArea.isEmpty()) {
            toast("途径地不能为空")
            return
        }
    }

    private fun toast(text: String) {
        Toast.makeText(baseContext, text, Toast.LENGTH_LONG).show()
    }
}

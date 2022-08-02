package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent



class MainActivity : AppCompatActivity() {
    var buttonCalc:Button ?=null
    var buttonIntent:Button ?=null
    var buttonWeb:Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalc=findViewById(R.id.btn_calc)
        buttonCalc!!.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }

        buttonIntent=findViewById(R.id.btn_intent)
        buttonIntent!!.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

        buttonWeb=findViewById(R.id.btn_web)
        buttonWeb!!.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }

    }
}
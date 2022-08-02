package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var buttonadd:Button
    lateinit var buttonmult:Button
    lateinit var buttondiv:Button
    lateinit var buttonsub:Button
    lateinit var text_answer: TextView
    lateinit var firstnum: TextView
    lateinit var secondnum: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        buttonadd=findViewById(R.id.btn_add)
        buttondiv=findViewById(R.id.btn_div)
        buttonmult=findViewById(R.id.btn_mult)
        buttonsub=findViewById(R.id.btn_sub)
        firstnum=findViewById(R.id.Text_fnum)
        secondnum=findViewById(R.id.Text_Snum)

        buttonadd!!.setOnClickListener {
            var firstnum= firstnum.text.toString()
            var secondnum= secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Fill first number and second number"
            }else{
                var answer=firstnum.toDouble() + secondnum.toDouble()
                text_answer.text=answer.toString()
            }

        }
        buttonsub!!.setOnClickListener {
            var firstnum= firstnum.text.toString()
            var secondnum= secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Fill first number and second number"
            }else{
                var answer=firstnum.toDouble() - secondnum.toDouble()
                text_answer.text=answer.toString()
            }

        }
        buttonmult!!.setOnClickListener {
            var firstnum= firstnum.text.toString()
            var secondnum= secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Fill first number and second number"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                text_answer.text=answer.toString()
            }

        }
        buttondiv!!.setOnClickListener {
            var firstnum= firstnum.text.toString()
            var secondnum= secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Fill first number and second number"
            }else{
                var answer=firstnum.toDouble() / secondnum.toDouble()
                text_answer.text=answer.toString()
            }

        }


    }
}
package com.example.calculatoruidemo.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calculatoruidemo.R
import com.example.calculatoruidemo.databinding.ActivityMainBinding
import com.example.calculatoruidemo.view.data.CalculatorActions
import com.example.calculatoruidemo.view.listener.CalculatorActionListener

class MainActivity : AppCompatActivity(), CalculatorActionListener {
    private lateinit var dataBindingView: ActivityMainBinding
    private var inputText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBindingView = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBindingView.listener = this
    }

    override fun onCalculatorResetPress() {
        inputText = ""
        dataBindingView.inputText = inputText
    }

    override fun onCalculatorNumKeyPress(key: Char) {
        inputText += key
        dataBindingView.inputText = inputText
    }

    override fun onCalculatorActionKeyPress(action: CalculatorActions) {
        TODO("Not yet implemented")
    }

    override fun onCalculatorBackKeyPress() {
        if(inputText.isNotEmpty()) {
            inputText = inputText.substring(0, inputText.length - 1)
            dataBindingView.inputText = inputText
        }
    }
}
package com.example.calculatoruidemo.view.listener

import com.example.calculatoruidemo.view.data.CalculatorActions

interface CalculatorActionListener {
    fun onCalculatorResetPress()
    fun onCalculatorNumKeyPress(key: Char)
    fun onCalculatorActionKeyPress(action: CalculatorActions)
    fun onCalculatorBackKeyPress()
}
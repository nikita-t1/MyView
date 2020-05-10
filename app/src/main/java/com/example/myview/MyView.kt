package com.example.myview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MyView(context: Context, attributeSet: AttributeSet): LinearLayout(context, attributeSet){

    init {
        LayoutInflater.from(context).inflate(R.layout.my_view, this, true)
    }
}
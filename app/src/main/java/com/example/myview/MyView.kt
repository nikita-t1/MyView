package com.example.myview

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.ViewCompat

class MyView(context: Context, attributeSet: AttributeSet): LinearLayout(context, attributeSet){

    var text = "1"
        set(value) {
            field = value
            val textView = layout.findViewById<TextView>(R.id.textView)
            textView.text = value
        }

    var dotColor = Color.GREEN
        set(value) {
            val dot = layout.findViewById<View>(R.id.dot)
            ViewCompat.setBackgroundTintList(dot, ColorStateList.valueOf(value))
        }

    private val layout: View = LayoutInflater.from(context).inflate(R.layout.my_view, this, true)

    init {

        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.MyView)
        dotColor = typedArray.getColor(R.styleable.MyView_dotColor, Color.GRAY)
        if (typedArray.hasValue(R.styleable.MyView_text))
            text = typedArray.getString(R.styleable.MyView_text)!!

        typedArray.recycle()
        invalidate()
    }
}
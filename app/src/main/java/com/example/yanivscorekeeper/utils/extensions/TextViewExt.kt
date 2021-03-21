package com.example.yanivscorekeeper.utils.extensions

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import androidx.annotation.FontRes
import androidx.core.content.res.ResourcesCompat

fun TextView.removeSpace(@FontRes fontRes: Int) {
    val typeFace: Typeface = Typeface.create(ResourcesCompat.getFont(context, fontRes), Typeface.NORMAL)
    this.typeface = typeFace
    this.setPadding(0, 0, 0, 0)
    this.includeFontPadding = false
}

fun TextView.changeCharSize(indexChar: Int, sizeRatio: Float, text: String? = this.text.toString()) {
    text?.let {
        val spannable = SpannableString(text)
        if (indexChar >= 0 && indexChar < text.length)
            spannable.setSpan(
                RelativeSizeSpan(sizeRatio),
                indexChar, indexChar + 1,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE,
            )
        this.text = spannable
    }
}
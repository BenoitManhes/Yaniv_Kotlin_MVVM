package com.example.yanivscorekeeper.utils

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * Simplicity font doesn't take into account upper case
 * This class change upper case char size
 */
class SimplicityTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    override fun setText(text: CharSequence?, type: BufferType?) {
        val spannable = SpannableString(text ?: "")
        text?.forEachIndexed { index, char ->
            if (char.isUpperCase()) {
                spannable.setSpan(
                    RelativeSizeSpan(Constants.Ui.UPPER_CASE_SIZE_RATIO),
                    index, index + 1,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE,
                )
            }
        }
        super.setText(spannable, type)
    }
}
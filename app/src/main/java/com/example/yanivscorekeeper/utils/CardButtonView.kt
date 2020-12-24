package com.example.yanivscorekeeper.utils

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.getDrawable
import com.example.yanivscorekeeper.R
import com.example.yanivscorekeeper.databinding.LayoutCardButtonBinding

class CardButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: LayoutCardButtonBinding by lazy {
        LayoutCardButtonBinding.inflate(LayoutInflater.from(context))
    }

    init {
        addView(binding.root)
        setupAttributes(attrs)
    }

    private fun setupAttributes(attrs: AttributeSet?) {
        // Obtain a typed array of attributes
        val typedArray = context.theme.obtainStyledAttributes(
            attrs, R.styleable.CardButtonView,
            0, 0
        )

        try {
            // Extract custom attributes into member variables

            @StringRes
            val textRes = typedArray.getResourceId(R.styleable.CardButtonView_text, 0)

            @DrawableRes
            val imgRes = typedArray.getResourceId(
                R.styleable.CardButtonView_image,
                R.drawable.carte_verso_02_h,
            )

            @DrawableRes
            val backgroundTextRes = typedArray.getResourceId(
                R.styleable.CardButtonView_textBackground,
                R.drawable.rect_secondary_radius,
            )
            val paddingRatio = typedArray.getFloat(R.styleable.CardButtonView_paddingTextRatio, 0.15f)

            // Apply attributes to components
            if (textRes != 0) binding.cardTextView.text = resources.getString(textRes)
            binding.cardViewImageVerso.setImageResource(imgRes)
            binding.backgroundText.background = getDrawable(context, backgroundTextRes)
            if (paddingRatio in 0f..1f) {
                binding.cardTopGuideline.setGuidelinePercent(paddingRatio)
                binding.cardLeftGuideline.setGuidelinePercent(paddingRatio)
                binding.cardBotGuideline.setGuidelinePercent(1 - paddingRatio)
                binding.cardRightGuideline.setGuidelinePercent(1 - paddingRatio)
            }

        } finally {
            // TypedArray objects are shared and must be recycled.
            typedArray.recycle()
        }
    }

}
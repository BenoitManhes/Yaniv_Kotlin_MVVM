package com.example.yanivscorekeeper.utils.items

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Custom decorator for the Recyclerview
 */
class SpacesItemDecoration(
    private val spaceWidth: Int,
    private val spaceHeight: Int,
) : RecyclerView.ItemDecoration() {

    constructor(space: Int) : this(space, space)

    /**
     * Setting space between Recycler View’s cell
     */
    override fun getItemOffsets(
        outRect: Rect, view: View,
        parent: RecyclerView, state: RecyclerView.State,
    ) {
        with(outRect) {
            top = spaceHeight
            bottom = spaceHeight
            left = spaceWidth
            right = spaceWidth
        }
    }
}
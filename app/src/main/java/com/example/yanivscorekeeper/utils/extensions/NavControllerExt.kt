package com.example.yanivscorekeeper.utils.extensions

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions

/**
 * Navigate via the given NavDirections
 * Avoid IllegalArgumentException x is unknown to this NavController on flooding navigate
 *
 * @param fromId The current destination ID
 * @param directions directions that describe this navigation operation
 * @param navOptions special options for this navigation operation
 */
fun NavController.safeNavigate(@IdRes fromId: Int, directions: NavDirections, navOptions: NavOptions? = null) {
    if (currentDestination?.id == fromId) {
        navigate(directions, navOptions)
    }
}
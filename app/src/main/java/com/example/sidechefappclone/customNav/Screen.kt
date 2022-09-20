package com.example.sidechefappclone.customNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val id:String,
    val title:String,
    val icon:ImageVector
){
    object ForYou:Screen("for_you", "For You", Icons.Outlined.Home)
    object Search:Screen("search", "Search", Icons.Outlined.Search)
    object Saved:Screen("saved", "Saved", Icons.Outlined.Star)
    object MealPlans:Screen("meal_plans", "Meal Plans", Icons.Outlined.Face)

    object Items{
        val list=listOf(
            ForYou, Search, Saved, MealPlans
        )
    }
}

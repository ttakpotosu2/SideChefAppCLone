package com.example.sidechefappclone.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigation(
    val label :String,
    val icon : ImageVector,
    val route : String
)

object Constants {
    val BottomNavigationItems = listOf(
        BottomNavigation(
            label = "For You",
            icon = Icons.Default.Home,
            route = "for_you"
        ),
        BottomNavigation(
            label = "Search",
            icon = Icons.Default.Search,
            route = "search"
        ),
        BottomNavigation(
            label = "Saved",
            icon = Icons.Default.FavoriteBorder,
            route = "for_you"
        ),
        BottomNavigation(
            label = "Meal Plan",
            icon = Icons.Default.Star,
            route = "meal_plan"
        ),
    )
}
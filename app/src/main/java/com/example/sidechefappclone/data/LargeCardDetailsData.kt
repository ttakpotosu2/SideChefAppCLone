package com.example.sidechefappclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.sidechefappclone.R

data class LargeCardDetailsData(
    val image: Int,
    val dishName: String,
    val cookingTime: String,
    val dishTag: String,
    val bookmarkTag: ImageVector,
    val rating: String,
    val ingredientsNumber: Int
)

class LargeCardRepository{
    fun getLargeCardData():List<LargeCardDetailsData> {
        return listOf(
            LargeCardDetailsData(
                image = R.drawable.food_one,
                dishName = "Nigerian Jollof",
                cookingTime = "30 min",
                dishTag = "Weeknight Dinner",
                bookmarkTag = Icons.Default.BookmarkBorder,
                rating = "⭐⭐⭐",
                ingredientsNumber = 11
            ),
            LargeCardDetailsData(
                image = R.drawable.food_eleven,
                dishName = "Doughnuts Especial",
                cookingTime = "45 min",
                dishTag = "Late Night Snack",
                bookmarkTag = Icons.Default.BookmarkBorder,
                rating = "⭐⭐⭐⭐",
                ingredientsNumber = 16
            ),
            LargeCardDetailsData(
                image = R.drawable.food_ten,
                dishName = "Honey Sandwich",
                cookingTime = "15 min",
                dishTag = "Midday Snack",
                bookmarkTag = Icons.Default.BookmarkBorder,
                rating = "⭐⭐⭐⭐",
                ingredientsNumber = 6
            )
        )
    }
}



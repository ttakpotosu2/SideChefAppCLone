package com.example.sidechefappclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.sidechefappclone.R

data class SmallCardDetailsData(
    val image: Int,
    val tag: String,
    val bookmarkTag: ImageVector,
    val label: String,
    val dishName: String,
    val chefProfileImage: Int,
    val chefName: String
)

class SmallCardRepository{
    fun getSmallCardData():List<SmallCardDetailsData>{
        return listOf(
            SmallCardDetailsData(
                image = R.drawable.food_five,
                tag = "Premium",
                bookmarkTag = Icons.Default.BookmarkBorder,
                label = "Vegan",
                dishName = "Veggie Jetsetter",
                chefProfileImage = R.drawable.food_five,
                chefName = "Live Eat Learn"
            ),
            SmallCardDetailsData(
                image = R.drawable.food_eleven,
                tag = "Premium",
                bookmarkTag = Icons.Default.BookmarkBorder,
                label = "Trending",
                dishName = "Potato Salad",
                chefProfileImage = R.drawable.food_eleven,
                chefName = "Chef Mike"
            ),
            SmallCardDetailsData(
                image = R.drawable.food_ten,
                tag = "Premium",
                bookmarkTag = Icons.Default.BookmarkBorder,
                label = "Pescatarian",
                dishName = "Veggie Jetsetter",
                chefProfileImage = R.drawable.food_ten,
                chefName = "Love Food"
            ),
            SmallCardDetailsData(
                image = R.drawable.food_six,
                tag = "Premium",
                bookmarkTag = Icons.Default.BookmarkBorder,
                label = "Dessert",
                dishName = "Veggie Jetsetter",
                chefProfileImage = R.drawable.food_six,
                chefName = "Learn Ghana"
            )
        )
    }
}
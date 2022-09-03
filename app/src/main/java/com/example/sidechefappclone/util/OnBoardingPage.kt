package com.example.sidechefappclone.util

import androidx.annotation.DrawableRes
import com.example.sidechefappclone.R

sealed class OnBoardingPage (
    @DrawableRes
    val backgroundImage : Int,
    val logoImage: Int? = null,
    val title: String,
    val description: String? = null,
    ){
    object First : OnBoardingPage(
        backgroundImage = R.drawable.background_one,
        logoImage = R.drawable.side_chef_logo_text,
        title = "Shop Ingredients\n For Any Recipe"
    )
    object Second : OnBoardingPage(
        backgroundImage = R.drawable.background_two,
        title = "Personalized Recipe Discovery",
        description = "Tell us your food preferences and we will only serve you delicious recipe " +
                "ideas"
    )
    object Third : OnBoardingPage(
        backgroundImage = R.drawable.background_two,
        title = "Never Forget an Ingredient",
        description = "Build your weekly grocery list and stay organized while you sleep."
    )
    object Forth : OnBoardingPage(
        backgroundImage = R.drawable.background_three,
        title = "Your Favorite Recipes at Your Finger Tips",
        description = "Save time on planning by always having your favorite recipes within reach"
    )
}
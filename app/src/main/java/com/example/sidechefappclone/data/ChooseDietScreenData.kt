package com.example.sidechefappclone.data

import com.example.sidechefappclone.R

data class ChooseDietScreenData(
    val image: Int,
    val dietType: String
)

val chooseDietCards = listOf(
    ChooseDietScreenData(image = R.drawable.coffee, dietType = "None"),
    ChooseDietScreenData(image = R.drawable.fish, dietType = "Pescatarian"),
    ChooseDietScreenData(image = R.drawable.cup, dietType = "Vegan"),
    ChooseDietScreenData(image = R.drawable.tomato, dietType = "Vegetarian"),
    ChooseDietScreenData(image = R.drawable.cup_2, dietType = "Paleo"),
    ChooseDietScreenData(image = R.drawable.egg, dietType = "Low-Carb"),
    ChooseDietScreenData(image = R.drawable.popsickle, dietType = "Keto")
)
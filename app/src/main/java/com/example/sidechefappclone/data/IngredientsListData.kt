package com.example.sidechefappclone.data

import com.example.sidechefappclone.R

data class IngredientsListData(
    val image:Int,
    val ingredientQuantity:String,
    val ingredientUnit:String,
    val ingredientName:String
)

class IngredientsListRepository{
    fun getIngredientsListData():List<IngredientsListData>{
        return listOf(
            IngredientsListData(
                image = R.drawable.ing_1,
                ingredientQuantity = "1 ",
                ingredientUnit = "cup",
                ingredientName = "Water"
            ),
            IngredientsListData(
                image = R.drawable.ing_2,
                ingredientQuantity = "1/2 ",
                ingredientUnit = "cup",
                ingredientName = "Soy Sauce"
            ),
            IngredientsListData(
                image = R.drawable.ing_3,
                ingredientQuantity = "2 ",
                ingredientUnit = "tbsp",
                ingredientName = "Mirin"
            ),
            IngredientsListData(
                image = R.drawable.ing_4,
                ingredientQuantity = "1/4 ",
                ingredientUnit = "cup",
                ingredientName = "Brown Sugar"
            ),
            IngredientsListData(
                image = R.drawable.ing_5,
                ingredientQuantity = "2 ",
                ingredientUnit = "tsp",
                ingredientName = "Fresh Ginger"
            ),
            IngredientsListData(
                image = R.drawable.ing_6,
                ingredientQuantity = "to ",
                ingredientUnit = "tate",
                ingredientName = "Black Pepper"
            ),
            IngredientsListData(
                image = R.drawable.ing_7,
                ingredientQuantity = "to ",
                ingredientUnit = "taste",
                ingredientName = "Scallions"
            ),
            IngredientsListData(
                image = R.drawable.ing_8,
                ingredientQuantity = "2 ",
                ingredientUnit = "tbsp",
                ingredientName = "Cooking Oil"
            ),
            IngredientsListData(
                image = R.drawable.ing_9,
                ingredientQuantity = "2 ",
                ingredientUnit = "tbsp",
                ingredientName = "Corn Starch"
            ),
        )
    }
}
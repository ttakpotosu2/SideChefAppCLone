package com.example.sidechefappclone.data

data class AllergiesData(
    val allergy: String
)

class AllergiesRepo{
    fun getAllergies(): List<AllergiesData> {
        return listOf(
            AllergiesData("Gluten"),
            AllergiesData("Dairy"),
            AllergiesData("Egg"),
            AllergiesData("Soy"),
            AllergiesData("Peanut"),
            AllergiesData("Tree Nut"),
            AllergiesData("Fish"),
            AllergiesData("ShellFish"),
        )
    }
}

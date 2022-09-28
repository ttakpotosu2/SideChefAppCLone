package com.example.sidechefappclone.data

import com.example.sidechefappclone.R

data class CommentsData(
    val commentProfileImage: Int,
    val commentName: String,
    val postedDate: String,
    val comment: String
)

class CommentsDataRepository{
    fun getCommentsData (): List<CommentsData>{
        return listOf(
            CommentsData(
                commentProfileImage = R.drawable.food_one,
                commentName = "Ethan Ripley",
                postedDate = "3 days ago",
                comment = "This was awesome."
            ),
            CommentsData(
                commentProfileImage = R.drawable.food_two,
                commentName = "Hannibal Lector",
                postedDate = "4 days ago",
                comment = "Looks really good"
            ),
            CommentsData(
                commentProfileImage = R.drawable.food_three,
                commentName = "Kwabena Mensah",
                postedDate = "6 days ago",
                comment = "I will definitely try it out"
            )
        )
    }
}
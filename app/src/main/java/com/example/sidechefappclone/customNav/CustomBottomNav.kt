package com.example.sidechefappclone.customNav

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomBottomNavigation(
    currentScreenId:String,
    onItemSelected:(Screen)->Unit
) {
    val items = Screen.Items.list

    Row(
        modifier = Modifier
            .background(White)
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
       items.forEach { item ->
           CustomBottomNavigationItem(item = item, isSelected = item.id==currentScreenId) {
               onItemSelected(item)
           }
       }
    }
}

@Composable
fun CustomBottomNavigationItem(item:Screen, isSelected:Boolean, onClick:()->Unit) {
    val background=if (isSelected) Black else Color.Transparent
    val contentColor=if (isSelected) White else Black

    Box(modifier = Modifier
        .clip(CircleShape)
        .background(background)
        .clickable(onClick = onClick)
    ) {
        Row(modifier = Modifier
            .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                imageVector = item.icon,
                contentDescription = "",
                tint = contentColor
            )
            AnimatedVisibility(visible = isSelected) {
                Text(
                    item.title,
                    color = contentColor
                )
            }
        }
    }
}

@Preview
@Composable
fun Prev1() {
    CustomBottomNavigation(currentScreenId = Screen.ForYou.id){

    }
}

@Preview
@Composable
fun Prev2() {
    CustomBottomNavigationItem(item = Screen.ForYou, isSelected = true) {

    }
}
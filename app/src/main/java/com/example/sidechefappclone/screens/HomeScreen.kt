package com.example.sidechefappclone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sidechefappclone.customNav.CustomBottomNavigation
import com.example.sidechefappclone.customNav.Screen
import com.example.sidechefappclone.data.LargeCardRepository
import com.example.sidechefappclone.data.SmallCardRepository
import com.example.sidechefappclone.navigation.Navigation
import com.example.sidechefappclone.util.ExtraSmallContentCard
import com.example.sidechefappclone.util.LargeContentCard
import com.example.sidechefappclone.util.MediumSizeContentCard
import com.example.sidechefappclone.util.SmallContentCard

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun HomeScreen(
    navController: NavHostController
) {

    val currentScreen = mutableStateOf<Screen>(Screen.ForYou)

    Scaffold (
        topBar = {
                 TopBar()
        },
        bottomBar = {
            CustomBottomNavigation(currentScreenId = currentScreen.value.id){
                currentScreen.value = it
            }
        },
        content = {
            ForYouScreen(navController)
        }
    )
}

@Composable
fun ForYouScreen(
    navController: NavHostController
) {
    val largeCardRepository = LargeCardRepository()
    val smallCardRepository = SmallCardRepository()
    val scrollState = rememberScrollState(0)

    Column (
        modifier = Modifier.verticalScroll(scrollState)
    ){
        Text(text = "Daily Inspiration",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(12.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(12.dp)
        ){
            items(items = largeCardRepository.getLargeCardData()){ largeCard ->
                LargeContentCard(largeCardDetailsData = largeCard) {
                    navController.navigate(Navigation.LargeCardDetailsScreen.route)
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Text(text = "Meal Plans Made Easy",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "View All".uppercase(),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            )
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(12.dp)
        ){
            items(items = smallCardRepository.getSmallCardData()){ smallCard ->
                SmallContentCard(smallCardDetailsData = smallCard)
            }
        }
        Text(text = "Explore Premium Recipes",
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(12.dp)
        )
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            MediumSizeContentCard()
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Text(text = "30-Minute Dinner Ideas",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "View All".uppercase(),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )

            )
        }
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            ExtraSmallContentCard()
        }
    }
}

@Composable
fun TopBar() {
    val cartCount = 0
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                Modifier
                    .size(36.dp)
                    .alpha(.5f),
                tint = Black
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Black,
                contentColor = White
            ),
            shape = RoundedCornerShape(100)
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "shopping cart",
                modifier = Modifier.size(16.dp)
            )
            Text(" $cartCount",
            style = TextStyle(
                fontSize = 16.sp
            )
            )
        }
    }
}
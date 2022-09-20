package com.example.sidechefappclone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sidechefappclone.customNav.CustomBottomNavigation
import com.example.sidechefappclone.customNav.Screen
import com.example.sidechefappclone.R

@SuppressLint("UnrememberedMutableState")
@Composable
fun HomeScreen() {

    val currentScreen = mutableStateOf<Screen>(Screen.ForYou)

    Scaffold (
        bottomBar = {
            CustomBottomNavigation(currentScreenId = currentScreen.value.id){
                currentScreen.value=it
            }
        },
        content = {
            ForYouScreen()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun SmallContentCardPreview() {
    SmallContentCard()
}

//@Composable
//fun BottomNavigationBar(
//    navController: NavHostController
//) {
//    BottomNavigation(
//        backgroundColor = White,
//    ) {
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//
//        val currentRoute = navBackStackEntry?.destination?.route
//
//        Constants.BottomNavigationItems.forEach{ navItem ->
//            BottomNavigationItem(
//                selected = currentRoute == navItem.route,
//                onClick = {navController.navigate(navItem.route)},
//                icon = {
//                    Icon(
//                        imageVector = navItem.icon,
//                        contentDescription = navItem.label
//                    )
//                },
//                label = {
//                    Text(text = navItem.label)
//                },
//                alwaysShowLabel = false
//            )
//        }
//    }
//}

//@Composable
//fun NavHostContainer(
//    navController: NavHostController,
//    padding: PaddingValues
//) {
//    NavHost(
//        navController = navController,
//        startDestination = "for_you",
//        modifier = Modifier.padding(paddingValues = padding),
//
//        builder = {
//            composable("for_you"){
//                HomeScreen()
//            }
//            composable("search"){
//                TODO("Add home screen")
//            }
//            composable("saved"){
//                TODO("Add home screen")
//            }
//            composable("meal_plan"){
//                TODO("Add home screen")
//            }
//        }
//    )
//}

@Composable
fun ForYouScreen() {

    rememberScrollState()

    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState(0))
    ){
        TopBar()
        Text(text = "Daily Inspiration",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium
            )
        )
        LargeContentCard()
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Meal Plans Made Easy",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
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
        SmallContentCard()
    }
}

@Composable
fun TopBar() {
    val cartCount = 0
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 6.dp),
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

@Composable
fun LargeContentCard() {

    val ingredientsCount = 11

    Column (
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .size(300.dp, 440.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
    ){
        Box(
            modifier = Modifier.size(300.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.food_one),
                contentDescription = "",
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Black
                            ),
                            startY = 0f,
                            endY = 100f
                        )
                    ),
                contentScale = ContentScale.FillWidth
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Text(text = "Weeknight Dinner",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Black
                        ),
                        modifier = Modifier
                            .background(color = White.copy(0.5f), shape = RoundedCornerShape(16.dp))
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Black.copy(.5f), shape = CircleShape)
                            .size(25.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Star,
                            contentDescription = "Bookmark",
                            tint = White,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "30min",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "⭐⭐⭐")
            Text(
                "Nigerian Jollof",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "$ingredientsCount ingredients",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
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
                    Text(" Add".uppercase(),
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun SmallContentCard() {
        Box(
            modifier = Modifier
                .size(250.dp, 350.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
                .padding()

        ){
            Image(
                painter = painterResource(id = R.drawable.food_four),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Black
                            ),
                            startY = 0f,
                            endY = 100f
                        )
                    ),
                alignment = Alignment.Center
            )
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Premium".uppercase(),
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = White
                        ),
                        modifier = Modifier
                            .background(
                                color = Black.copy(.5f),
                                shape = RoundedCornerShape(6.dp)
                            )
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Black.copy(.5f), shape = CircleShape)
                            .size(25.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Star,
                            contentDescription = "Bookmark",
                            tint = White,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "30min",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
    }
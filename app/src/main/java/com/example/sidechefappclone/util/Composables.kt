package com.example.sidechefappclone.util

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sidechefappclone.R
import com.example.sidechefappclone.data.IngredientsListData
import com.example.sidechefappclone.data.LargeCardDetailsData
import com.example.sidechefappclone.data.SmallCardDetailsData

@Composable
fun BottomButtons(
    buttonText : String,
    onClick : () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Black,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {
        Text(
            text = buttonText.uppercase()
        )
    }
}

@Composable
fun LargeContentCard(largeCardDetailsData: LargeCardDetailsData) {

    Column (
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .size(300.dp, 440.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
    ){
        Box(
            modifier = Modifier.size(300.dp,300.dp)
        ){
            Image(
                painter = painterResource(id = largeCardDetailsData.image),
                contentDescription = "",
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 0f,
                            endY = 1f
                        )
                    ),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Text(text = largeCardDetailsData.dishTag,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .background(
                                color = Color.White.copy(0.5f),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Color.Black.copy(.5f), shape = CircleShape)
                            .size(25.dp)
                    ) {
                        Icon(
                            imageVector = largeCardDetailsData.bookmarkTag,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = largeCardDetailsData.cookingTime,
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = largeCardDetailsData.rating)
            Text(
                largeCardDetailsData.dishName,
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "${largeCardDetailsData.ingredientsNumber} ingredients",
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
                        backgroundColor = Color.Black,
                        contentColor = Color.White
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
fun MediumSizeContentCard() {

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .size(250.dp, 400.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
    ) {
        Box(
            modifier = Modifier.size(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.food_four),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black
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
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Cocktails",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .background(
                                color = Color.White.copy(.5f),
                                shape = RoundedCornerShape(100)
                            )
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(
                                color = Color.Black.copy(.5f),
                                shape = CircleShape
                            )
                            .border(1.dp, Color.White, CircleShape)
                            .size(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "Locked",
                            tint = Color.White,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "5min",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                )
            }
        }
        Column (
            modifier = Modifier.padding(16.dp)
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Premium".uppercase(),
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .background(
                            color = Color.Black,
                            shape = RoundedCornerShape(6.dp)
                        )
                        .padding(5.dp)
                )
                Text(
                    text = " ⭐⭐⭐",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                "St. Germain Spritz",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "5 ingredients",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(100)
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "shopping cart",
                        modifier = Modifier.size(12.dp)
                    )
                    Text(
                        " Add".uppercase(),
                        style = TextStyle(
                            fontSize = 12.sp
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun SmallContentCard(smallCardDetailsData: SmallCardDetailsData) {
    Box(
        modifier = Modifier
            .size(200.dp, 300.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
            .padding()

    ){
        Image(
            painter = painterResource(id = smallCardDetailsData.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.Transparent,
                            Color.Black
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
                Text(text = smallCardDetailsData.tag.uppercase(),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .background(
                            color = Color.Black.copy(.5f),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(color = Color.Black.copy(.5f), shape = CircleShape)
                        .size(25.dp)
                ) {
                    Icon(
                        imageVector = smallCardDetailsData.bookmarkTag,
                        contentDescription = "Bookmark",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = smallCardDetailsData.label,
                style = TextStyle(
                    fontSize = 10.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = smallCardDetailsData.dishName,
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row {
                Image(
                    painter = painterResource(smallCardDetailsData.chefProfileImage),
                    contentDescription = "",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(16.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    smallCardDetailsData.chefName,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp
                    )
                )
            }
        }
    }
}

@Composable
fun ExtraSmallContentCard() {

    val ingredientsCount = 11

    Column (
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            // .size(170.dp, 260.dp)
            .width(170.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
    ){
        Box(
            modifier = Modifier.size(170.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.food_one),
                contentDescription = "",
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 0f,
                            endY = 100f
                        )
                    ),
                contentScale = ContentScale.FillWidth
            )
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Text(text = "Weeknight Dinner",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .background(color = Color.White.copy(0.5f), shape = RoundedCornerShape(16.dp))
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Color.Black.copy(.5f), shape = CircleShape)
                            .size(25.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "30min",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "⭐⭐⭐⭐⭐",
                style = TextStyle(
                    fontSize = 10.sp
                )
            )
            Text(
                "Nigerian Jollof",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "$ingredientsCount ingredients",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(100)
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "shopping cart",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun IngredientsList(ingredientsListData: IngredientsListData) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(26.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = ingredientsListData.image),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Text(ingredientsListData.ingredientQuantity + ingredientsListData.ingredientUnit)

            Text(ingredientsListData.ingredientName,
                style = TextStyle(
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.size(26.dp)
            )
        }
    }
}

@Composable
fun NutritionSection(){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ){
        NutritionItems(
            nutritionType = "Calories",
            nutritionValue = "318"
        )
        NutritionItems(
            nutritionType = "Fat",
            nutritionValue = "121.1 g"
        )
        NutritionItems(
            nutritionType = "Protein",
            nutritionValue = "25.6 g"
        )
        NutritionItems(
            nutritionType = "Carbs",
            nutritionValue = "24.9 g"
        )
    }
}

@Composable
fun NutritionItems(
    nutritionType : String,
    nutritionValue : String
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = nutritionType.uppercase(),
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Light
            )
        )
        Text(text = nutritionValue,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun BottomNavigation() {
    Row(
        modifier = Modifier
            .background(Color.White)
            .padding(12.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(100),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier.weight(.4f)
        ) {
            Text(
                "Add to plan".uppercase(),
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(100),
            modifier = Modifier.weight(.6f)
        ) {
            Text(
                "Add to cart".uppercase(),
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
    }
}
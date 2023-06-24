package com.example.sidechefappclone.screens


import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Share
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sidechefappclone.R
import com.example.sidechefappclone.data.CommentsData
import com.example.sidechefappclone.data.CommentsDataRepository
import com.example.sidechefappclone.data.IngredientsListRepository
import com.example.sidechefappclone.util.BottomButtons
import com.example.sidechefappclone.util.IngredientsList
import com.example.sidechefappclone.util.NutritionSection

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LargeCardDetailsScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation()
        },
        content = {
            LargeCardDetails()
        }
    )
}

@Preview
@Composable
fun Preview2() {
    LargeCardDetailsScreen()
}

@Composable
fun DetailsTopBar() {
    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .background(
                    color = Color.Black.copy(.5f),
                    shape = CircleShape
                )
                .size(30.dp)

        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Arrow",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            onClick = { },
            modifier = Modifier
                .background(
                    color = Color.Black.copy(.5f),
                    shape = CircleShape
                )
                .size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Share,
                contentDescription = "Share button",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(
            onClick = { },
            modifier = Modifier
                .background(
                    color = Color.Black.copy(.5f),
                    shape = CircleShape
                )
                .size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.BookmarkBorder,
                contentDescription = "Share button",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
        }
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

@Composable
fun LargeCardDetails(
 //   paddingValues: PaddingValues
) {
    val ingredientsListRepository = IngredientsListRepository()
    val getIngredientsListData = ingredientsListRepository.getIngredientsListData()

    Column(
        modifier = Modifier
            .background(Color.White)
            .verticalScroll(rememberScrollState(0))
         //   .padding(paddingValues)
    ) {
        Box(
            modifier = Modifier
                .height(550.dp)
        ) {
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
            DetailsTopBar()
        }
        Column(
            modifier = Modifier
                .padding(24.dp)
                .offset(y = (-75).dp)
                .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Recipe".uppercase(),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraLight
                )
            )
            Text(
                "Nigerian Jollof",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Text(
                "by Wok & Skillet"
            )
            Spacer(modifier = Modifier.height(16.dp))

            RatingsRow()

            Spacer(modifier = Modifier.height(16.dp))

            RecipeDescription()

            Spacer(modifier = Modifier.height(16.dp))
            // Cook time Box
            Column(
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
                    .padding(20.dp)
            ) {
                Text(
                    "30min",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    "Total time",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.ExtraLight
                    )
                )
            }
            Text(
                "Ingredients",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Left
                )
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Default.RemoveCircleOutline,
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(26.dp)
                    )
                }
                val servesNumber = 4
                Text(
                    "Serves $servesNumber",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircleOutline,
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(26.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Us / Metric".uppercase(),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Light
                    )
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                for (ingredients in getIngredientsListData) {
                    IngredientsList(ingredientsListData = ingredients)
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
            BottomButtons(buttonText = "Add to cart") {
                //TODO : add nav link
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 22.dp)
            ) {
                Text(
                    text = "Nutrition Per Serving",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "View All".uppercase(),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
            NutritionSection()
        }
        DirectionsSection()
        ProfileSection()
        CommentsSection()
    }
}

@Composable
fun RatingsRow() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "4.6 ⭐⭐⭐⭐⭐"
            )
            Text(
                "60 ratings"
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.star_wreath),
                contentDescription = "",
                modifier = Modifier.size(20.dp)
            )
            Text(
                "Community Pick".uppercase(),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

@Composable
fun RecipeDescription() {
    Text(
        "Borrowed plumbed supportable parallels supplemental seize brainwash insure, sims" +
                "connected rubies disc manipulator relative dangle obstructing, alienates mystic" +
                "gleaner expeditions prong ballets intersecting, explorations wasting box top"
    )
}

@Composable
fun DirectionsSection() {
    Column(
        modifier = Modifier
            .background(Color(0xFFDFDFDF))
            .padding(horizontal = 16.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 22.dp)
        ) {
            Text(
                "Directions",
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "Hide Images".uppercase(),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(100),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(12.dp)
        ) {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.size(26.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Step by Step Mode".uppercase(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
        Text(
            "Step 1",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Light
            ),
            modifier = Modifier.padding(vertical = 12.dp)
        )
        DirectionsStepOne()
        Spacer(modifier = Modifier.height(22.dp))
    }
}

@Composable
fun DirectionsStepOne() {
    Text(
        "Purify haggardly impervious attainder grossed discounted repetitive opaque, outwitted" +
                "aviator elective ejaculating went. Discreet dimmer clinic, perceived yeoman harmonize" +
                "multiplication distrust interruptions mushrooming, resurrects bangs.",
        style = TextStyle(
            fontSize = 16.sp
        )
    )
    Spacer(modifier = Modifier.height(12.dp))
    Image(
        painter = painterResource(id = R.drawable.food_one),
        contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ProfileSection() {
    Column(
        modifier = Modifier
            .padding(16.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.food_one),
                contentDescription = "",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(18.dp))
            Text(
                "Wok & Skillet",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(100),
                border = BorderStroke(1.dp, Color.Black),
                contentPadding = PaddingValues(12.dp)
            ) {
                Text(text = "View".uppercase())
            }
        }
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "Radiantly upholders reassessment superscripts ended shoving, commonest " +
                    "crows preferably scour itches crudest pacers clutter."
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun CommentsSection() {
    
    val commentsDataRepository = CommentsDataRepository()
    val getCommentsData = commentsDataRepository.getCommentsData()
    
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 22.dp)
        ) {
            Text(
                text = "Ratings & Comments",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "View All".uppercase(),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            )
        }
        for (comments in getCommentsData){
            CommentsList(commentsData = comments)
        }
        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Composable
fun CommentsList(commentsData: CommentsData) {
    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = commentsData.commentProfileImage),
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = commentsData.commentName,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Text(
                text = commentsData.postedDate,
                style = TextStyle(
                    fontSize = 14.sp
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = commentsData.comment,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Light
                )
            )
        }
    }
}
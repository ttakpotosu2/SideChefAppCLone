package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sidechefappclone.R
import com.example.sidechefappclone.data.AllergiesRepo
import com.example.sidechefappclone.util.BottomButtons
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontVariation.width
import com.example.sidechefappclone.navigation.Navigation

@ExperimentalLayoutApi
@ExperimentalFoundationApi
@Composable
fun ChooseDietScreen(
    navController: NavHostController,

    ) {
    val allergiesRepo = AllergiesRepo()

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        DietScreenProgressBar(navController)

        Text(
            "Do you follow any of the\nfollowing diets?",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        )
        Text(
            "We'll only show you recipes for your diet",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Light
            )
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            content = {
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.coffee),
                        dietType = "None"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.fish),
                        dietType = "Pescatarian"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.cup),
                        dietType = "Vegan"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.tomato),
                        dietType = "Vegetarian"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.cup_2),
                        dietType = "Paleo"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.egg),
                        dietType = "Low-Carb"
                    )
                }
                item {
                    DietsCards(
                        image = painterResource(id = R.drawable.popsickle),
                        dietType = "Keto"
                    )
                }
            }
        )
        Text("Any ingredient allergies or intolerances?", style = TextStyle(fontSize = 20.sp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            allergiesRepo.getAllergies().forEach {
                FilterChips(allergies = it.allergy)
            }
        }
        BottomButtons(
            buttonText = "Continue",
            onClick = { navController.navigate(Navigation.GoalsScreen.route) })
    }
}

@Composable
fun DietsCards(
    image: Painter,
    dietType: String,
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .size(80.dp, 120.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(12.dp))
            .border(
                1.dp,
                Color.LightGray,
                RoundedCornerShape(12.dp)
            ),
    ) {
        Spacer(modifier = Modifier.height(4.dp))
        Image(
            painter = image,
            contentDescription = "",
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(9.dp))
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(dietType)
    }
}

@Composable
fun DietScreenProgressBar(
    navController: NavHostController
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LinearProgressIndicator(
            progress = .3f,
            color = Color.Black,
            backgroundColor = Color.Gray,
            modifier = Modifier.weight(.9f)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = "Skip".uppercase(),
            style = TextStyle(
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Right,
                fontSize = 14.sp
            ),
            modifier = Modifier
                .weight(.1f)
                .clickable { navController.navigate(Navigation.GoalsScreen.route) }
        )
    }
}

@Composable
fun FilterChips(
    allergies: String
) {
    TextButton(
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = Color.Black,
        ),
        onClick = {}
    ) {
        Text(
            text = allergies,
            style = TextStyle(
                fontSize = 20.sp
            ),
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}
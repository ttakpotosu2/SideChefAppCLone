package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sidechefappclone.R
import com.example.sidechefappclone.navigation.Navigation
import com.example.sidechefappclone.util.BottomButtons

@Composable
fun GoalsScreen(
    navController: NavHostController
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        GoalsScreenProgressBar(navController)

        Text(
            "What is your goal?",
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        )
        Text(
            "Select whats important to you.",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Light
            )
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                GoalsCards(
                    image = painterResource(id = R.drawable.healthy_food),
                    goalType = "Eat Healthy"
                )
            }
            item {
                GoalsCards(
                    image = painterResource(id = R.drawable.piggy_bank),
                    goalType = "Budget Friendly"
                )
            }
            item {
                GoalsCards(
                    image = painterResource(id = R.drawable.schedule),
                    goalType = "Plan Better"
                )
            }
            item {
                GoalsCards(
                    image = painterResource(id = R.drawable.badge),
                    goalType = "Learn to Cook"
                )
            }
            item {
                GoalsCards(
                    image = painterResource(id = R.drawable.clock),
                    goalType = "Quick & Easy"
                )
            }
        }
        BottomButtons(
            buttonText = "Continue",
            onClick = { navController.navigate(Navigation.HomeScreen.route) })
    }
}

@Composable
fun GoalsScreenProgressBar(
    navController: NavHostController
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.clickable { navController.navigateUp() }
        )
        Spacer(modifier = Modifier.width(12.dp))
        LinearProgressIndicator(
            progress = .9f,
            color = Color.Black,
            backgroundColor = Color.Gray,
            modifier = Modifier.weight(.9f)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            "Skip".uppercase(),
            style = TextStyle(
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Right,
                fontSize = 14.sp
            ),
            modifier = Modifier
                .weight(.1f)
                .clickable { navController.navigate(Navigation.HomeScreen.route) }
        )
    }
}

@Composable
fun GoalsCards(
    image: Painter,
    goalType: String
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .clip(RoundedCornerShape(12.dp))
            .border(
                1.dp,
                Color.LightGray,
                RoundedCornerShape(12.dp)
            )
            .padding(vertical = 12.dp)

    ) {
        Image(
            painter = image,
            contentDescription = "",
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(80.dp),
            alpha = .5f
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            goalType,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        )
    }
}
package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sidechefappclone.util.BottomButtons
import com.example.sidechefappclone.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GoalsScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ){
        GoalsScreenProgressBar()

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
            cells = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
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
        BottomButtons(buttonText = "Continue", onClick = {  })
    }
}

@Preview(showBackground = true)
@Composable
fun GoalsScreenPreview() {
    GoalsScreen()
}

@Composable
fun GoalsScreenProgressBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "",
            tint = Color.Black,
        //    modifier = Modifier.weight(.1f)
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
            modifier = Modifier.weight(.1f)
        )
    }
}

@Composable
fun GoalsCards(
    image : Painter,
    goalType : String
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
        Text(goalType,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
        )
    }
}
package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sidechefappclone.navigation.Navigation
import com.example.sidechefappclone.R

@Composable
fun IntroPage(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable{ navController.navigate(Navigation.OnboardingPages.route) }
    ){
        Image(
            painter = painterResource(id = R.drawable.image_1),
            contentScale = ContentScale.Crop,
            contentDescription = null)
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().padding(22.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(
                id = R.drawable.side_chef_logo_text),
                contentDescription = null,
                modifier = Modifier.height(70.dp)
            )
            Text(
                text = "Shop Ingredients\n" +
                    " For Any Recipe",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 46.sp
                )
            )
        }
    }
}
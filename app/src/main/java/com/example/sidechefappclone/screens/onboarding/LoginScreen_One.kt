package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sidechefappclone.R

@Composable
fun LoginScreen_One() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_four),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.side_chef_logo_text_white),
                contentDescription = "",
                modifier = Modifier.height(40.dp)
            )
            Text(
                text = "Cook with Confidence",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 36.sp,
                )
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    ),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .weight(1f)
                        .height(40.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.google_logo_2),
                        contentDescription = ""
                    )
                }
                Button(
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xff3362A1)
                    ),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .weight(1f)
                        .height(40.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.facebook_logo),
                        contentDescription = ""
                    )
                }
            }
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ),
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .clip(RoundedCornerShape(40.dp))
                    .fillMaxWidth()
                    .height(40.dp)
            ){
                Icons.Filled.Email

                Text(
                    "Signup with email".uppercase()
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Already have an account? Login",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White
                )
            )
            Text(
                "By using SideChef you agree to our Privacy Policy and\n Terms of Use",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreen_OnePreview() {
    LoginScreen_One()
}
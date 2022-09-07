package com.example.sidechefappclone.screens.onboarding


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen_Two() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = ""
        )
        Text(
            "Sign Up",
            style = TextStyle(
                fontSize = 32.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            "Save delicious recipes and get personalized content.",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black
            )
        )

        LoginTextField(
            label = "Display Name",
            keyboardType = KeyboardType.Text
        )

        LoginTextField(
            label = "Email",
            keyboardType = KeyboardType.Email
        )

        LoginTextField(
            label = "Password",
            keyboardType = KeyboardType.Password
        )

        LoginTextField(
            label = "Confirm Password",
            keyboardType = KeyboardType.Password
        )

        LabelledCheckBox()
        Spacer(modifier = Modifier.height(16.dp))
        BottomButtons(buttonText = "Next")
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreen_TwoPreview() {
    LoginScreen_Two()
}

@Composable
fun LoginTextField(
    label: String,
    keyboardType: KeyboardType
) {
    var textInput by remember{mutableStateOf("")}

    TextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = textInput,
        onValueChange = { textInput = it },
        label = { Text(label)},
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            unfocusedLabelColor = Color.Black,
            focusedLabelColor = Color.Black
        ),
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
    )
}

@Composable
fun LabelledCheckBox() {
    Row (
        verticalAlignment = Alignment.CenterVertically
            ){
       val isChecked = remember { mutableStateOf(false)}
        
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = {isChecked.value = it},
            enabled = true,
            colors = CheckboxDefaults.colors(Color.Black),
            modifier = Modifier.clip(CircleShape)
        )
        Text("I would like to receive recipe inspiration, meal plans, updates and more!")
    }
}

@Composable
fun BottomButtons(
    buttonText : String
) {
    Button(
        onClick = {},
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
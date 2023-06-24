package com.example.sidechefappclone.screens.onboarding


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sidechefappclone.navigation.Navigation
import com.example.sidechefappclone.util.BottomButtons

@Composable
fun LoginScreen_Two(
    navController: NavHostController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        IconButton(onClick = { navController.navigateUp() }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = ""
            )
        }
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
                fontSize = 22.sp,
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
        BottomButtons(buttonText = "Next", onClick = {
            navController.navigate(Navigation.ChooseDietScreen.route)
        }
        )
    }
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
            focusedIndicatorColor = Color.Black,
            cursorColor = Color.Black,
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


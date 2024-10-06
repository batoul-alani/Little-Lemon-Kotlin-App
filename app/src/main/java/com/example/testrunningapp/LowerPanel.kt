package com.example.testrunningapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testrunningapp.ui.theme.TestRunningAppTheme

@Composable
fun LowerPanel(){
    Column {
        WeeklySpecial()
        MenuDish()
    }
}

@Composable
fun WeeklySpecial(){
    Card (modifier = Modifier.fillMaxWidth()) {
        Text(text = "Weekly Special", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp) )
    }
}

@Composable
fun MenuDish(){
       Card {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ) {
                Column {
                    Text(text = "Greek Salad", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...", color = Color.Gray, modifier = Modifier
                        .padding(vertical = 5.dp)
                        .fillMaxWidth(0.75f))
                    Text(text = "\$12.99", color = Color.Gray, fontWeight = FontWeight.Bold)
                }
                Image(painter = painterResource(id = R.drawable.greeksalad) , contentDescription ="Greek Salad Image")
            }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview() {
    LowerPanel()
}
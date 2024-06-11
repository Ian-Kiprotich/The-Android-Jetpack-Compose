package com.timzowen.uat

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.uat.ui.theme.UatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Surface(color = Color.Gray,modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            HorizontalBars(Color.Red)
            HorizontalBars(Color.Green)
            HorizontalBars(Color.Yellow)
            HorizontalBars(Color.Blue)
            HorizontalBars(Color.Magenta)

        }
    }
}

@Composable
fun HorizontalBars(color: Color){
    Surface(color = color,
        modifier = Modifier.height(600.dp).width(50.dp)) {
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UatTheme {
        MainScreen()
    }
}
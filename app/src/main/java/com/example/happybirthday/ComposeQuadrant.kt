package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeQuadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrantContent(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CardContent(color: Color, title: String, content: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrantContent(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1F)) {
            CardContent(
                color = Color(0xFFEADDFF),
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
            CardContent(
                color = Color(0xFFD0BCFF),
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1F)
            )
        }
        Row(modifier = Modifier.weight(1F)) {
            CardContent(
                color = Color(0xFFB69DF8),
                title = "Row composable",
                content = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1F)
            )
            CardContent(
                color = Color(0xFFF6EDFF),
                title = "Column composable",
                content = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Composable
fun CardContent2(color: Color, title: String, content: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}


@Composable
fun ComposeQuadrantContent2(modifier: Modifier = Modifier) {
    Row {
        Column(
            modifier = Modifier.weight(1F)
        ) {
            CardContent2(
                color = Color(0xFFEADDFF),
                title = "Text composableX",
                content = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
            CardContent2(
                color = Color(0xFFB69DF8),
                title = "Row composableX",
                content = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1F)
            )
        }
        Column(
            modifier = Modifier.weight(1F)
        ) {
            CardContent2(
                color = Color(0xFFD0BCFF),
                title = "Image composableX",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1F)
            )
            CardContent2(
                color = Color(0xFFF6EDFF),
                title = "Column composableX",
                content = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Preview
@Composable
fun ComposeQuadrantPreview() {
    HappyBirthdayTheme {
        ComposeQuadrantContent()
    }
}
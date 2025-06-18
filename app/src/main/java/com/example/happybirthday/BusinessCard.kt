package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardContent(
                        modifier = Modifier
                            .padding(innerPadding)

                    )
                }
            }
        }
    }
}

val accentGreen = Color(0xFF006934)

@Composable
fun PersonalInfo(icon: ImageVector, text: String){
    // 每一個大寫的Modifier 就是新的物件
    // 如果用小寫modifier 就會繼承參數原本的設定，再附加新的設定
    Row(modifier = Modifier.padding(bottom = 12.dp)) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.padding(end = 12.dp),
            tint = accentGreen
        )
        Text(
            text = text
        )
    }
}

@Composable
fun BusinessCardContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFFD2E8D4)),
        // 子元素的水平對齊方式
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            // weight 代表佔用父元素的比例，不用再設定fillMaxSize
            modifier = Modifier.weight(4f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .width(120.dp)
                        .background(Color(0xFF073042))
                )
                Text(
                    text = "Boren Ding",
                    fontSize = 48.sp
                )
                Text(
                    text = "Engineering Manager",
                    color = Color(0xFF006934),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.Center
        ) {
            Column {
                PersonalInfo(Icons.Rounded.Phone, "+886(00)123 456 789" )
                PersonalInfo(Icons.Rounded.Share, "@borending1020" )
                PersonalInfo(Icons.Rounded.Email, "boren@android.com" )
            }
        }
    }
}

@Preview
@Composable
fun CBusinessCardPreview() {
    HappyBirthdayTheme {
        BusinessCardContent()
    }
}
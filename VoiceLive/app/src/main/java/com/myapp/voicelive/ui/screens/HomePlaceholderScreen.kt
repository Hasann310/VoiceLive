package com.myapp.voicelive.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.voicelive.ui.theme.BgDark
import com.myapp.voicelive.ui.theme.GoldLight
import com.myapp.voicelive.ui.theme.TealDeep

// Temporary placeholder — the real Home / Room list comes in the next step.
@Composable
fun HomePlaceholderScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(TealDeep, BgDark))),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(24.dp)) {
            Text("🎉 Login সফল!", color = GoldLight, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(12.dp))
            Text(
                "এই স্ক্রিনটা অস্থায়ী। পরের ধাপে Home / Room লিস্ট বানানো হবে।",
                color = Color.White,
                fontSize = 15.sp
            )
        }
    }
}

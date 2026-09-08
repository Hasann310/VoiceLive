package com.myapp.voicelive.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.voicelive.ui.theme.*

@Composable
fun LoginScreen(onLoggedIn: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(TealDeep, BgDark)))
            .padding(horizontal = 28.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(90.dp))
            Box(
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(listOf(GoldLight, GoldAccent))),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Filled.Mic, contentDescription = null, tint = TealDeep, modifier = Modifier.size(48.dp))
            }
            Spacer(Modifier.height(18.dp))
            Text("VoiceLive", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(6.dp))
            Text(
                "Join live rooms, meet new friends",
                color = TextSecondary,
                fontSize = 14.sp
            )

            Spacer(Modifier.weight(1f))

            SocialButton(
                text = "Continue with Facebook",
                bg = FacebookBlue,
                contentColor = Color.White,
                icon = { Icon(Icons.Filled.Facebook, null, tint = Color.White) },
                onClick = onLoggedIn
            )
            Spacer(Modifier.height(14.dp))
            SocialButton(
                text = "Continue with Google",
                bg = Color.White,
                contentColor = Color(0xFF1F1F1F),
                icon = { GoogleG() },
                onClick = onLoggedIn
            )
            Spacer(Modifier.height(14.dp))
            OutlinedButton(
                onClick = onLoggedIn,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(27.dp),
                border = BorderStroke(1.5.dp, GoldAccent),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = GoldLight)
            ) {
                Icon(Icons.Filled.Phone, null, tint = GoldLight)
                Spacer(Modifier.width(10.dp))
                Text("Continue with Phone", fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
            }

            Spacer(Modifier.height(28.dp))
            Text(
                "By continuing you agree to our Terms & Privacy Policy",
                color = TextSecondary,
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 30.dp)
            )
        }
    }
}

@Composable
private fun SocialButton(
    text: String,
    bg: Color,
    contentColor: Color,
    icon: @Composable () -> Unit,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp),
        shape = RoundedCornerShape(27.dp),
        colors = ButtonDefaults.buttonColors(containerColor = bg, contentColor = contentColor)
    ) {
        icon()
        Spacer(Modifier.width(10.dp))
        Text(text, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
    }
}

@Composable
private fun GoogleG() {
    Box(
        modifier = Modifier.size(22.dp).clip(CircleShape).background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text("G", color = Color(0xFF4285F4), fontWeight = FontWeight.Bold, fontSize = 16.sp)
    }
}

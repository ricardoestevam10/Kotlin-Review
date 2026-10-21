package com.example.composeinit.ui.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinit.ui.theme.ComposeInitTheme

@Composable
fun L10TextField(modifier: Modifier = Modifier) {
    Text("Olá Mundo")
}

@Preview(showBackground = true)
@Composable
private fun L10TextFieldPreview() {
    ComposeInitTheme {
    L10TextField()
    }
}
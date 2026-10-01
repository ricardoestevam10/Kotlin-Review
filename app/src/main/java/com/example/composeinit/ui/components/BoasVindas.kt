package com.example.composeinit.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BoasVindas(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Primeiro Componente, Olá $name", modifier = modifier
    )
}
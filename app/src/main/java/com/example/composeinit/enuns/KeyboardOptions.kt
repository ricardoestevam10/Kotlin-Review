package com.example.composeinit.enuns

import androidx.compose.ui.text.input.KeyboardType

enum class KeyboardOptions (
    val label: String,
    val value: KeyboardType
){
    TEXT("Text", value = KeyboardType.Text),
    NUMBER("Number", value = KeyboardType.Number),
    EMAIL("Email", value = KeyboardType.Email)
}


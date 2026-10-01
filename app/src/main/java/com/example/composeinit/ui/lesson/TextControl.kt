package com.example.composeinit.ui.lesson

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange

@Composable
fun TextControl(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) ->Unit,
    label: String

) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        singleLine = true,
        modifier = modifier.fillMaxWidth()
    )
}
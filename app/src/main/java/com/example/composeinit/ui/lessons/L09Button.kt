package com.example.composeinit.ui.lessons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.enuns.ButtonVariant
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl
import com.example.composeinit.ui.lesson.SwitchControl

@Composable
fun L09Button(modifier: Modifier = Modifier) {
    var variant by remember { mutableStateOf(ButtonVariant.FILLED) }
    var enabled by remember { mutableStateOf(true) }
    var cliks by remember { mutableStateOf(0) }
    LessonScaffold(
        title = "Button",
        notice = "Toque no botão e veja o contador subir. Troque a variante e " +
                "desligue 'enabled' para ver o clique ser ignorado",
        controls = {
            OptionsControl(
                label = "Variant",
                options = ButtonVariant.entries.toList(),
                selected = variant,
                optionLabel = {it.label},
                onSelected = {variant = it}
            )
            SwitchControl(
                label = "enable",
                checked = enabled,
                onCheckedChange = {enabled = it}

            )
        }
    ) {
        ButtonDemo(
          variant = variant,
            enabled  = enabled,
            clicks = cliks,
            onClick = {cliks++}
        )


    }
}

@Composable
fun ButtonDemo(
    variant: ButtonVariant,
    enabled: Boolean,
    clicks: Int,
    onClick:() -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        when(variant){
            ButtonVariant.FILLED -> Button(
                onClick = onClick,
                enabled = enabled,
            ) {Text("Entrar - FILLED") }

            ButtonVariant.OUTLINED -> OutlinedButton(
                onClick = onClick,
                enabled = enabled,
            ) {Text("Entrar - OUTLINED") }

            ButtonVariant.TEXT -> TextButton(
                onClick = onClick,
                enabled = enabled,
            ) {Text("Entrar - TEXT") }
        }
        Text(
            text = "clicks: $clicks",
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun L09ButtonPreview() {
    L09Button()
}
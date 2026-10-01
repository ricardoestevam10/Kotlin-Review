package com.example.composeinit.ui.lessons
import android.text.style.LineBackgroundSpan
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeinit.ui.components.calcularIrrf

import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.TextControl


@Composable
fun L04Input() {
    var text by remember { mutableStateOf(value = "") }
    LessonScaffold(
        title = "Parametros",
        notice = "",
        controls = {
            TextControl(
                value = text,
                onValueChange = {text = it},
                label = "Salario Bruto"
            )

        }
    ) {
        ParamtersDemo1(text)
    }

}


@Composable
fun ValoresDigitados(text:String){
    Text(
        text = text,
        fontSize = 28.sp
    )
}

@Composable
fun ParamtersDemo1(text:String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(space = 8.dp)
    ) {
        ValoresDigitados(text)
    }
}

@Preview(showBackground = true)
@Composable
fun ParametersDemoPreview1() {
    ParamtersDemo1(text = "TESTE DSM5")
}
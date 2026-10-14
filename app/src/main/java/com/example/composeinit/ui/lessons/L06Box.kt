package com.example.composeinit.ui.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.enuns.ArrangementOption
import com.example.composeinit.enuns.BoxAlignmentOption
import com.example.composeinit.enuns.RowAlignmentOption
import com.example.composeinit.ui.components.BoxDemo
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl

@Composable
fun L06Box(modifier: Modifier = Modifier) {
    var aligment by remember { mutableStateOf(BoxAlignmentOption.CENTER) }
    LessonScaffold(
        title = "Box",
        "'contentAligment' move a caixa da frente para um outro canto ou para o " +
        "centro do fundo. ligue a sobreposição para empilhar uma segunda camada.",
        controls = {
            OptionsControl(
                label = "Content Aligment",
                options = BoxAlignmentOption.entries.toList(),
                selected = aligment,
                optionLabel = {it.label},
                onSelected = {aligment= it}
            )
        }
    ) {
        Box(
            modifier = Modifier
                .size(160.dp)
                .background(color = MaterialTheme.colorScheme.surfaceVariant),
            contentAlignment = aligment.value
        ){
            Text("FRENTE")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun L06BoxPreview() {
   L06Box()
}
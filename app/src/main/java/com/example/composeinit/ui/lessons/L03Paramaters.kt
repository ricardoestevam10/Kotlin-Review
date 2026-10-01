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
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.TextControl


@Composable
fun L03Parameters() {
    var text by remember { mutableStateOf(value = "Tela de Login") }
    LessonScaffold(
        title = "Parametros",
        notice = "O primeiro titulo ignora oque voce digita- o texto esta escrito por dentro da função",
        controls = {
            TextControl(
                value = text,
                onValueChange = {text = it},
                label = "texto a ser alterado"
            )
        }
    ) {
        ParamtersDemo(text)
    }

}

@Composable
fun StatelessTitle(modifier: Modifier = Modifier){
    Text(
        text = "Tela de login",
        fontSize = 28.sp)
}
@Composable
fun StatefullTitle(text:String){
    Text(
        text = text,
        fontSize = 28.sp
    )
}

@Composable
fun ParamtersDemo(text:String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(space = 8.dp)
    ) {
        Text(text="Componente Stateless")
        StatelessTitle()
        Text(text="Componente Statefull")
        StatefullTitle(text)
        StatefullTitle(text="$text(sendo usado novamente)")
        StatefullTitle(text.uppercase())
    }
}

@Preview(showBackground = true)
@Composable
fun ParametersDemoPreview() {
    ParamtersDemo(text = "TESTE DSM5")
}
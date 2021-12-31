package sk.sandeep.jfldemo.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextFieldItem(
    title: String = "",
    textFieldTitle: String = "",
    textEnabled: Boolean = false,
    color: Color = Color.LightGray,
    onChangeValue: (String) -> Unit ={}
) {
    Text(
        text = title,
        color = Color.Gray,
        modifier = Modifier.padding(4.dp),
    )
    OutlinedTextField(
        value = textFieldTitle,
        onValueChange = onChangeValue,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(0.dp)
            .background(color),
        enabled = textEnabled,
        singleLine = true,
        textStyle = TextStyle(
            fontSize = 14.sp
        )
    )
    Spacer(modifier = Modifier.height(8.dp))
}

package sk.sandeep.jfldemo.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBarWidget(
    subTitle: String
) {
    TopAppBar(
        modifier = Modifier.height(70.dp)
    ) {
        Column() {
            Text(
                text = "Business Verification",
                style = TextStyle(
                    fontSize = 24.sp,
                )
            )
            Text(text = subTitle)
        }
    }
}
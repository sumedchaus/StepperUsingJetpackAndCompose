package sk.sandeep.jfldemo.compose_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sk.sandeep.jfldemo.widgets.DropDownField
import sk.sandeep.jfldemo.widgets.TextFieldItem
import sk.sandeep.jfldemo.widgets.TopAppBarWidget

@Composable
fun PersonalInformation() {
    val number = remember {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            TopAppBarWidget("Personal Information")
        }
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            LazyColumn(modifier = Modifier.fillMaxHeight())
            {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        TextFieldItem(title = "Name of the Applicant")
                        TextFieldItem(title = "Father / Husband / Guardian")
                        TextFieldItem(title = "Age/DOB")
                        TextFieldItem(title = "Marital status")
                        TextFieldItem(
                            title = "Total No. of Family members",
                            color = Color.White,
                            textEnabled = true,
                            onChangeValue = { number.value = it },
                            textFieldTitle = number.value
                        )
                        TextFieldItem(
                            title = "No. of dependents",
                            color = Color.White,
                            textEnabled = true
                        )
                        DropDownField(title = "Residential Status")
                        TextFieldItem(
                            title = "Residing in the present premises from___years",
                            color = Color.White,
                            textEnabled = true
                        )
                        TextFieldItem(title = "Name of the Co-applicant")
                        TextFieldItem(title = "Co-applicant relation with applicant")
                    }
                }
            }
        }
    }
}
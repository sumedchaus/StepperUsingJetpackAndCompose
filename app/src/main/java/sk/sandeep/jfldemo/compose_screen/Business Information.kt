package sk.sandeep.jfldemo.compose_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sk.sandeep.jfldemo.widgets.DropDownField
import sk.sandeep.jfldemo.widgets.TextFieldItem
import sk.sandeep.jfldemo.widgets.TopAppBarWidget


@Composable
fun BusinessInformation() {
    Scaffold(
        topBar = {
            TopAppBarWidget(subTitle = "Business Information")
        }
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            LazyColumn(modifier = Modifier.fillMaxHeight()) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        TextFieldItem(title = "Name of the Shop/ Unit")
                        TextFieldItem(title = "Name of the Business")
                        DropDownField(title = "Business Ownership")
                        DropDownField(title = "Business premise status")
                        TextFieldItem(
                            title = "Existence in the present business----Years",
                            textEnabled = true,
                            color = Color.White,
                        )
                        TextFieldItem(
                            title = "Overall Business experience of the applicant",
                            textEnabled = true,
                            color = Color.White,
                        )

                        Text("Sales information")
                        TextFieldItem(
                            title = "Avg.Daily sales",
                            textEnabled = true,
                            color = Color.White,
                        )
                        TextFieldItem(
                            title = "Avg.Monthly sales",
                            textEnabled = true,
                            color = Color.White,
                        )
                        TextFieldItem(
                            title = "Avg.Margin % in Applicant's opinion",
                            textEnabled = true,
                            color = Color.White,
                        )
                        TextFieldItem(
                            title = "Avg.Margin % in Verified staff opinion",
                            textEnabled = true,
                            color = Color.White,
                        )
                        TextFieldItem(
                            title = "Inventory / Stock Value",
                            textEnabled = true,
                            color = Color.White,
                        )
                        DropDownField(title = "Photograph of the business unit - (Matched/ Unmatched")
                    }
                }
            }

        }
    }
}
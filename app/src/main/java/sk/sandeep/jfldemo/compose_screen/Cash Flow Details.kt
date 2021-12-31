package sk.sandeep.jfldemo.compose_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sk.sandeep.jfldemo.widgets.TextFieldItem
import sk.sandeep.jfldemo.widgets.TopAppBarWidget

@Composable
fun CashFlowDetails() {
    Scaffold(
        topBar = {
            TopAppBarWidget(subTitle = "Cash Flow Details")
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
                        TextFieldItem(
                            title = "Gross income as per the verified staff observation",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(title = "Other income (Total from all sources)")
                        TextFieldItem(title = "Total Business expenses")
                        TextFieldItem(title = "Total Family expenses")
                        TextFieldItem(title = "Net business income")
                        TextFieldItem(
                            title = "Net Business income in Applicant's opinion",
                            textEnabled = true,
                            color = Color.White
                        )


                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "Detail of Expenditure (Business)")
                        TextFieldItem(
                            title = "Employee salaries",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(
                            title = "Rent & Transportation",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(
                            title = "Taxes & Other expenses",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(
                            title = "Operational Expenses",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(title = "Payment of Business debts")


                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "Detail of Expenditure (Family)")
                        TextFieldItem(
                            title = "Family maintenance",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(
                            title = "Rent & Transportation",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(
                            title = "Education & Medicine",
                            textEnabled = true,
                            color = Color.White
                        )
                        TextFieldItem(title = "Payment of Household debts")
                    }
                }
            }
        }
    }
}
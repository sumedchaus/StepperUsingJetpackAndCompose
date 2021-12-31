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
fun VerificationOfDocuments() {
    Scaffold(
        topBar = {
            TopAppBarWidget("Verification of documents")
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
                        TextFieldItem(title = "Proof of Identity")
                        TextFieldItem(title = "Proof of Address")
                        TextFieldItem(title = "Proof of House ownership")
                        TextFieldItem(title = "Proof of business premise ownership")
                        TextFieldItem(title = "Business license")

                        Text(text = "Confirmation of approval requirements & Geo tagging")

                        DropDownField(title = "Availability of Collateral documents in original")
                        DropDownField(title = "Availability of Guarantor")
                        DropDownField(title = "Availability of cheque leaves")

                        Text(text = "Recommendation")
                        TextFieldItem(
                            title = "Loan Amount",
                            textEnabled = true,
                            color = Color.White
                        )
                        DropDownField(title = "tenure")
                        DropDownField(title = "Mortgage requirement")
                    }
                }
            }
        }
    }
}

package com.example.weatherapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

@Composable
fun WeatherLocationPage(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()) {

    }
}
@Composable
fun WeatherLocationCard(){
    Card {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Location")
                Text(text = "Today 13 March")
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Column {
                    Text(
                        text = "22 C",
                        fontSize = 35.sp
                    )
                    Text(
                        text = "Mostly Clear",
                        fontSize = 20.sp
                    )
                    }
                }
            Column {
                Row (modifier = Modifier.fillMaxWidth()){

                }

            }
            }
        }

}
@Composable
fun CardComponets(){

}
@Preview(showBackground = true)
@Composable
fun CardCompnentsPreview(){
    WeatherAppTheme {
        WeatherLocationCard()
    }
}
@Preview(showBackground = true)
@Composable
fun LocationPage(){
    WeatherAppTheme {
        WeatherLocationPage()
    }
}
package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.data.WeatherData
import com.example.weatherapp.data.weatherData
import com.example.weatherapp.ui.theme.WeatherAppTheme

/**
 * Weather App Home Page
 */
@Composable
fun WeatherApp(
    modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            WeatherTopAppBar()
        }
    ) { it
        Column (modifier = Modifier.fillMaxWidth()){
            LazyColumn(){
                items(weatherData){
                    WeatherDayComponent(
                        weather = it,
                        modifier = Modifier.padding(26.dp)
                    )
                }
            }
        }
    }
}
@Composable
fun WeatherDayComponent(
    modifier: Modifier = Modifier,
    weather: WeatherData
){
    Card(
        modifier = Modifier
            .padding(4.dp)
    ) {
       Row (

           modifier = Modifier
               .fillMaxWidth()
               .padding(8.dp),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween
       ){
           Column {
               Text(
                   text = stringResource(weather.day),
                   fontSize = 15.sp
               )
               Text(
                   text = stringResource(weather.date),
                   fontFamily = FontFamily.Monospace
               )
           }
           Text(text = "22 C")

           Image(
               painter = painterResource(weather.weatherIcon),
               contentDescription = "Weather Icon"
           )
       }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherTopAppBar(){
   CenterAlignedTopAppBar(
       title = {
           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(15.dp),
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.SpaceBetween
           ){
               Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Top App Bar Back Icon")
               Text(
                   text = "Weather App",
                   fontSize = 15.sp
               )
               Icon(imageVector = Icons.Default.Notifications, contentDescription = "Top App Bar Notification Icon")
           }
       }
   )
}
@Composable
fun WeatherBottomAppBar(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(16.dp))
    {
        Icon(imageVector = Icons.Default.Home, contentDescription = "Home Button")
        Icon(imageVector = Icons.Default.Add, contentDescription = "Add Button")
        Icon(imageVector = Icons.Default.Face, contentDescription = "Account Button")
    }
}
@Preview(showBackground = true)
@Composable
fun WeatherBottomAppBarPreview(){
    WeatherAppTheme {
        WeatherBottomAppBar()
    }
}
@Preview(showBackground = true)
@Composable
fun WeatherTopAppBarPreview(){
    WeatherAppTheme {
        WeatherTopAppBar()
    }
}
@Preview(showBackground = true)
@Composable
fun WeatherDayComponentPreview(){
    WeatherAppTheme {
       //WeatherDayComponent(weather = WeatherData(R))
    }
}
/**
 * Weather App preview
 */
@Preview(showBackground = true)
@Composable
fun WeatherAppPreview(){
    WeatherAppTheme {
        WeatherApp()
    }
}
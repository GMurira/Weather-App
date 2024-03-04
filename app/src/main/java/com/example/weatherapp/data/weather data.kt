package com.example.weatherapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.weatherapp.R
import java.util.Date

data class WeatherData(
   @StringRes val day: Int,
   @StringRes val date: Int,
    val temperature: Int,
   @DrawableRes val weatherIcon: Int
)

val weatherData = listOf(
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy), WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy), WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy), WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy), WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy), WeatherData(R.string.Monday,R.string.date1,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date2,22, R.drawable.sunny),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Thursday,R.string.date2,22, R.drawable.rainy),
    WeatherData(R.string.Tuesaday,R.string.date1,22, R.drawable.cloudy),
    WeatherData(R.string.Wednesday,R.string.date2,22, R.drawable.cloudy),
    WeatherData(R.string.Monday,R.string.date1,22, R.drawable.rainy)
)
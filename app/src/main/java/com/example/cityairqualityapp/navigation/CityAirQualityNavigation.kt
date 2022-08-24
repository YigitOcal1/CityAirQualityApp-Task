package com.example.cityairqualityapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cityairqualityapp.view.CityDetailsScreen
import com.example.cityairqualityapp.view.SearchCityScreen

@Composable
fun CityAirQualityNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = CityAirQualityScreens.SearchCityScreen.name) {
        composable(CityAirQualityScreens.SearchCityScreen.name) {
            SearchCityScreen(navController = navController)
        }
        composable(CityAirQualityScreens.CityDetailsScreen.name) {
            CityDetailsScreen(navController = navController)
        }

    }
}
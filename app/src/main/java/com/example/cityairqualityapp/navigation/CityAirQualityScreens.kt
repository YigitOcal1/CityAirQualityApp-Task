package com.example.cityairqualityapp.navigation

enum class CityAirQualityScreens {
    SearchCityScreen,
    CityDetailsScreen;

    companion object{
        fun fromRoute(route: String?):CityAirQualityScreens
                =when(route?.substringBefore(delimiter = "/")){
            SearchCityScreen.name->SearchCityScreen
            CityDetailsScreen.name->CityDetailsScreen

            null->SearchCityScreen
            else->throw  IllegalAccessException("Route is not correct")
        }
    }
}

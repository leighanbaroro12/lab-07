package com.example.lab_7

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.sql.Driver

@Composable
fun FormulaZeroApp() {
    val navController = rememberNavController()

    // so each screen needs to take the navcontroller
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("races") { UpcomingRacesScreen(navController) }
        composable("drivers") { DriversScreen(navController) }
    }
}
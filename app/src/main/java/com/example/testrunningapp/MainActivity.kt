package com.example.testrunningapp

import LocationScreen
import LoginScreen
import MainScreen
import MenuContent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testrunningapp.ui.theme.TestRunningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.main_dish_1).setOnClickListener {
            IngredientsActivity.start(this, "Hamburger")
        }
        findViewById<View>(R.id.main_dish_2).setOnClickListener {
            IngredientsActivity.start(this, "Pasta")
        }
    }
}

@Composable
fun MyNavigation(paddingValues: PaddingValues){
    val navController = rememberNavController()
    NavHost(
        navController, startDestination =  Login.route
    ){
        composable(Home.route) {
            HomeScreen()
        }
        composable(Main.route) {
            MainScreen()
        }
        composable(Location.route) {
            LocationScreen()
        }
        composable(Login.route) {
            LoginScreen(navController = navController)
        }
        composable(MenuList.route) {
            MenuContent()
        }
    }
}
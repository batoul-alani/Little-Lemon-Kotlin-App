package com.example.testrunningapp

import LocationScreen
import LoginScreen
import MainScreen
import MenuContent
import android.os.Bundle
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
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TestRunningAppTheme {
                Scaffold (

                    topBar =
                    {
                        TopAppBar(
                            title = {
                                Text(resources.getString(R.string.app_name))
                            },
                            )
                    },

                    content = {
                            paddingValues ->
                        MyNavigation(paddingValues = paddingValues)
                    }
                )

            }
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
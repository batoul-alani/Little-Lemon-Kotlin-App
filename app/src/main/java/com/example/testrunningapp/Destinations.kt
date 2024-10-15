package com.example.testrunningapp

import android.graphics.drawable.Drawable

interface Destinations {
    val route:String
    val icon:Int?
    val title:String
}

object Main:Destinations{
    override val route = "Main"
    override val icon = null
    override val title = "Main"
}

object Home:Destinations{
    override val route = "Home"
    override val icon = R.drawable.ic_home
    override val title = "Home"
}

object Login:Destinations{
    override val route = "Login"
    override val icon = null
    override val title = "Login"
}

object MenuList:Destinations{
    override val route = "MenuList"
    override val icon = R.drawable.ic_menu
    override val title = "Menu"
}

object Location:Destinations{
    override val route = "Location"
    override val icon = R.drawable.ic_location
    override val title = "Location"
}


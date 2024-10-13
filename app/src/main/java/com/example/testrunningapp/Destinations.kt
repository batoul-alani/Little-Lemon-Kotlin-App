package com.example.testrunningapp

interface Destinations {
    val route:String
}

object Home:Destinations{
    override val route = "Home"
}

object Login:Destinations{
    override val route = "Login"
}

object MenuList:Destinations{
    override val route = "MenuList"
}


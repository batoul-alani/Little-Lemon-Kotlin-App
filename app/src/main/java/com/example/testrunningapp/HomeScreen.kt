package com.example.testrunningapp


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.littlelemon.UpperPanel

@Composable
fun HomeScreen(){
    Column {
        UpperPanel()
        LowerPanel()
    }
}
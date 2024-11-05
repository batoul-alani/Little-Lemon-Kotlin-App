package com.example.testrunningapp


import LazyGrid
import ScrollableGalleryScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.littlelemon.UpperPanel

@Composable
fun HomeScreen(){
    Column {
        LazyGrid()
        UpperPanel()
        LowerPanel()
    }
}
package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column() {
        TopAppBar()
        UpperPanel()
        LowerPanel(navController, DishRepository.dishes)
    }
}

package uk.ac.tees.mad.weatherwise.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController,
    modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        ){
        Text("Main Screen")
    }
}
package com.example.taskmanager.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskmanager.HomeScreen
import com.example.taskmanager.ui.screen.AddTaskScreen

@Composable
fun TaskManager(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable("home")
        {
            HomeScreen(navController)
        }
        composable("addTask"){
          AddTaskScreen(navController = navController)
        }


    }
}
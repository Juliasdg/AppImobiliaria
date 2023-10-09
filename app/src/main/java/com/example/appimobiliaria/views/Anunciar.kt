package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.ui.theme.RosaEscuro

@SuppressLint("UnusedMaterial33ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnunciarScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = RosaEscuro
                ),
                navigationIcon = {

                }
            )
        }
    ){
        ContentAnunciarScreen(navController)
    }
}

@Composable
fun ContentAnunciarScreen(navController: NavController){

}

@Preview(showBackground = true)
@Composable
fun AnunciarPreview(){
    val navController = rememberNavController()
    AnunciarScreen(navController)
}
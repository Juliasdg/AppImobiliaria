package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.components.Botao2
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.components.Voltar
import com.example.appimobiliaria.ui.theme.Rosa
import com.example.appimobiliaria.ui.theme.RosaEscuro

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NovoScreen(navController: NavController){
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
                    Voltar()
                }
            )
        }
    ){
        NovoComprarScreen(navController)
    }
}

@Composable
fun NovoComprarScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Rosa)
        .padding(top = 80.dp),
        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Botao2(text = "Apartamento", icon = Icons.Default.KeyboardArrowRight){
            navController.navigate("PaginaInicial")
        }

        Spacer(modifier = Modifier.height(28.dp))


        Botao2(text = "Apartamentos", icon = Icons.Default.KeyboardArrowRight){
            navController.navigate("home")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun NovoPreview(){
    val navController = rememberNavController()
    NovoScreen(navController)
}
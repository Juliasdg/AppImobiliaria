package com.example.appimobiliaria.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appimobiliaria.R

@Composable
fun CardImagens(text: String, preco: String, corT: Color, imagem: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp,
    ),
    modifier = Modifier
        .width(170.dp)
    ){
       Column(
           modifier = Modifier.background(Color.White)
       ){
           Image(
            painter = imagem,
            contentDescription = "Apartamento"
           )

           Spacer(modifier = Modifier.height(16.dp))

           Text(
               text = text,
               modifier = Modifier.padding(start = 16.dp, end = 16.dp),
               textAlign = TextAlign.Center, 
               color = corT,
               fontSize = 15.sp
           )
           
           Spacer(modifier = Modifier.height(16.dp))
       }
    }
}

@Composable
fun CardImagensTime(text: String, imagem: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp),
    ) {
        Column (
            modifier = Modifier.background(Color.White)
        ){
            Image(
                painter = imagem,
                contentDescription = "Apartamento"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardImagensPreview(){
    Row(
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        CardImagens(
            "Apartamento - Barra Funda",
            "R$  60.000.00",
            Color.Black,
            painterResource(R.drawable.apartamento1)
        )

        CardImagens(
            "Apartamento - Mooca",
            "R$  75.000.00",
            Color.Black,
            painterResource(R.drawable.apartamento2)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CardImagensTimePreview(){
    Row(
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        CardImagensTime(
            "Júlia da Silva Dias - Contador(a)",
            painterResource(R.drawable.julia)
        )

        CardImagensTime(
            "Elis Costa Batista - Corretor(a)",
            painterResource(R.drawable.corretor)
        )
    }
}
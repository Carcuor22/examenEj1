package com.carloscuevasortiz.examenej1

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.net.URL




fun main() {

    val videojuegos = listOf(
        ListaVideojuegos("Videojuego1", 50, URL("https://loremflickr.com/400/400/seville?lock=1")),
        ListaVideojuegos("Videojuego2", 50, URL("https://loremflickr.com/400/400/seville?lock=2")),
        ListaVideojuegos("Videojuego3", 50, URL("https://loremflickr.com/400/400/seville?lock=3"))
    )




    @Composable
    fun ListaVideojuegos(videojuegos : ListaVideojuegos) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(videojuegos) { videojuego ->
                ListaVideojuegos(videojuego)
            }
        }
    }

    @Composable
    fun Videojuego(videojuego: ListaVideojuegos) {
        AsyncImage(
            model = videojuego.imageURL,
            contentDescription = videojuego.name,
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = videojuego.name, style = Material3Theme.typography.titleLarge)
        Text(text = "Precio: $${videojuego.price}")
    }




}






package fr.epsi.ferrarettokarakhanyan.rickandmorty.ui.navigation

sealed class Screen(val route : String)
data object Home : Screen("/home")
data object Detail : Screen("/detail")
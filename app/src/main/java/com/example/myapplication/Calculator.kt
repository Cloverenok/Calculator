package com.example.myapplication

object Calculator {

    fun calculatePoints(points: Int?): String {
        if (points == null) {
            return "Brak oceny (nie wprowadzono punktów)"
        }

        return when {
            points < 0 -> "Błąd danych (liczba ujemna)"
            points < 50 -> "2.0"
            points in 50..60 -> "3.0"
            points in 61..70 -> "3.5"
            points in 71..80 -> "4.0"
            points in 81..90 -> "4.5"
            points in 91..100 -> "5.0"
            else -> "Błąd danych"
        }
    }
}
package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun currentMood(): String {
        return "It is happy"
    }
}
package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun currentMood(): String {
        return "It is sad"
    }
}
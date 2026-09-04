package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun currentMood(): String
}
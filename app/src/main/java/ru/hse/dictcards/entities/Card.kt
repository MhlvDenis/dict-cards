package ru.hse.dictcards.entities

data class Card(
    val word: String,
    val translation: String,
    val context: String? = null,
    val contextTranslation: String? = null
)
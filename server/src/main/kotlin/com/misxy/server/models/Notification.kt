package com.misxy.server.models

data class Notification(
    val source: String,
    val destination: String,
    val text: String
)

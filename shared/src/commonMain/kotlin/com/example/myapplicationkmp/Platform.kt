package com.example.myapplicationkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
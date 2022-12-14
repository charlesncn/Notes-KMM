package net.smartmoti.me

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.dheeraj.paginationcmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
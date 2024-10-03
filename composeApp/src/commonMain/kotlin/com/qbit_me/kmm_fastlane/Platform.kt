package com.qbit_me.kmm_fastlane

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
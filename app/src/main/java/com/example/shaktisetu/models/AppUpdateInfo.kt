package com.example.shaktisetu.models

data class AppUpdateInfo(
    val versionCode: Int = 0,
    val versionName: String = "",
    val updateUrl: String = "",
    val updateNotes: String = "",
    val forceUpdate: Boolean = false
)

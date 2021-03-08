package com.example.unahur.utils

import android.content.Context

fun Context.translate(id: Int, vararg args: Any): String {
    return resources.getString(id, *args)
}
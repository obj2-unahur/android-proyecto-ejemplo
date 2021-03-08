package com.example.unahur.domain

import org.jetbrains.annotations.TestOnly

object Contador {
    var valor = 0
        private set

    fun incrementar() {
        valor++
    }

    @TestOnly
    fun reiniciar() {
        valor = 0
    }
}
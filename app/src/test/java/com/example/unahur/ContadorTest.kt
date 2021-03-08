package com.example.unahur

import com.example.unahur.domain.Contador
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ContadorTest : StringSpec({
    beforeEach {
        Contador.reiniciar()
    }

    "El valor inicial es 0" {
        Contador.valor shouldBe 0
    }

    "`incrementar` aumenta el valor en 1" {
        Contador.incrementar()
        Contador.valor shouldBe 1
    }

    "`reiniciar` reinicia el contador a 0" {
        Contador.incrementar()
        Contador.incrementar()
        Contador.valor shouldBe 2

        Contador.reiniciar()
        Contador.valor shouldBe 0
    }
})
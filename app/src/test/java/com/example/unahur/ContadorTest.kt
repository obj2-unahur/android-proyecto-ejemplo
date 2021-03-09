package com.example.unahur

import com.example.unahur.domain.Contador
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ContadorTest : DescribeSpec({
    describe("Contador") {
        beforeEach {
            Contador.reiniciar()
        }

        it("El valor inicial es 0") {
            Contador.valor shouldBe 0
        }

        it("`incrementar` aumenta el valor en 1") {
            Contador.incrementar()
            Contador.valor shouldBe 1
        }

        it("`reiniciar` reinicia el contador a 0") {
            Contador.incrementar()
            Contador.incrementar()
            Contador.valor shouldBe 2

            Contador.reiniciar()
            Contador.valor shouldBe 0
        }
    }
})
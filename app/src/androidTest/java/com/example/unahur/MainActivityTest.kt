package com.example.unahur

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.example.unahur.activities.MainActivity
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun AlPresionarElBotonTresVecesIncrementarLaEtiquetaDiceContador3() {
        onScreen<MainActivityScreen> {
            boton_incrementar.click()
            boton_incrementar.click()
            boton_incrementar.click()
            etiqueta_contador.hasText("Contador: 3")
        }
    }

    @Test
    fun AlPresionarElBotonReiniciarLaCuentaVuelveACero() {
        onScreen<MainActivityScreen> {
            boton_incrementar.click()
            boton_reiniciar.click()
            etiqueta_contador.hasText("Contador: 0")
        }
    }
}

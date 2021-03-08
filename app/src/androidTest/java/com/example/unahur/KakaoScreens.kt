package com.example.unahur

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

class MainActivityScreen : Screen<MainActivityScreen>() {
    val etiqueta_contador = KTextView { withId(R.id.etiqueta_contador) }
    val boton_incrementar = KButton { withId(R.id.boton_incrementar) }
    val boton_reiniciar = KButton { withId(R.id.boton_reiniciar) }
}
package com.example.unahur.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.unahur.R
import com.example.unahur.databinding.ActivityMainBinding
import com.example.unahur.domain.Contador
import com.example.unahur.utils.translate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarVista()
    }

    private fun configurarVista() {
        actualizar()

        binding.botonIncrementar.setOnClickListener {
            actualizar { Contador.incrementar() }
        }

        binding.botonReiniciar.setOnClickListener {
            actualizar { Contador.reiniciar() }
        }
    }

    private fun actualizar(accion: () -> Unit = {}) {
        accion()
        binding.etiquetaContador.text = translate(R.string.contador_n, Contador.valor)
    }
}
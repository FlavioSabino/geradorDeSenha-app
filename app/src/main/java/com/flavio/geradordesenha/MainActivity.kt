package com.flavio.geradordesenha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flavio.geradordesenha.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val alfabeto = arrayOf(
        "A","B", "C","D","E","F","G","H","I","J","K","L",
        "M","N","O","P","Q","R","S","T","U","V","W","Y","X","Z"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btGerarSenha.setOnClickListener {
            gerarSenha()
        }
    }

    private fun gerarSenha(){
        val primeiraLetra = (alfabeto.indices).random()
        val segundaLetra = (alfabeto.indices).random()

        val letra1 = alfabeto[primeiraLetra]
        val letra2 = alfabeto[segundaLetra]

        val gerarNumeros = Random()
        val numeros = gerarNumeros.nextInt(9999)
        


        binding.txtSenha.text = "$letra1$letra2-$numeros"
    }
}
package com.stackmobile.register.calculadoraandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stackmobile.register.calculadoraandroid.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)


       val calculo = binding.calculo


        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }
        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }
        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        binding.parenteseabrindo.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        binding.parentesefechando.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        binding.adicao.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }
        binding.subtracao.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        binding.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }
        binding.ce.setOnClickListener {
            calculo.text =  ""
            binding.resultado.text = ""
        }
        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }
        binding.igual.setOnClickListener {
            val resultadocalculado = Expression(calculo.text.toString()).calculate()

            if (resultadocalculado.isNaN()){
                binding.resultado.text = "expressão invalida"
            } else {

                binding.resultado.text = resultadocalculado.toString()

            }



        }
        binding.delete.setOnClickListener {
              calculo.text = calculo.text.dropLast(1)
        }


    }



}


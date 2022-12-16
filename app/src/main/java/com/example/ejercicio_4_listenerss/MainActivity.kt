package com.example.ejercicio_4_listenerss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            findViewById<Button>(R.id.botonSumar).setOnClickListener { sumar() }
            findViewById<Button>(R.id.botonRestar).setOnClickListener { restar() }

        val cambioColor : Button = findViewById<Button>(R.id.botonRestar)
        val cambioColor2 : Button = findViewById<Button>(R.id.botonSumar)
/*
        //Cambia el color del texto luego de hacer click
            findViewById<EditText>(R.id.numero).setOnClickListener {
                cambioColor.setBackgroundColor((0xFF03DAC5.toInt()))
                cambioColor2.setBackgroundColor((0xFF03DAC5.toInt()))

            }
*/
        //Cambia el color del texto luego de hacer click y despues
        findViewById<EditText>(R.id.numero).setOnFocusChangeListener { view: View, b: Boolean ->
            if (b.equals(true)){
                cambioColor.setBackgroundColor((0xFF03DAC5.toInt()))
                cambioColor2.setBackgroundColor((0xFF03DAC5.toInt()))

            }else {
                cambioColor.setBackgroundColor((0xFF3700B3.toInt()))
                cambioColor2.setBackgroundColor((0xFF3700B3.toInt()))

            }

        }




    }


    private fun sumar() {
        var num= findViewById<TextView>(R.id.numero).text.toString().toInt()
        var num2= findViewById<TextView>(R.id.solucion).text.toString().toInt()
        var result = num+num2
        findViewById<TextView>(R.id.solucion).text =  result.toString()

    }
    private fun restar() {

        if ( (findViewById<TextView>(R.id.solucion).text.toString().toInt() - findViewById<TextView>(R.id.numero).text.toString().toInt() ) >= 0){
            var num= findViewById<TextView>(R.id.numero).text.toString().toInt()
            var num2= findViewById<TextView>(R.id.solucion).text.toString().toInt()
            var result = num2-num
            findViewById<TextView>(R.id.solucion).text =  result.toString()
        }


    }

}



package com.arp.arpvocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //private Button btn1
    //private Button btn2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // btn1 = (Button) findViewById(R.id.view_responsavel)
        // btn2 = (Button) findViewById(R.id.create_responsavel)

    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.mensagem)
        val message = editText.text.toString()
        val intent = Intent(this, CriarResponsavel::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Irá chamar a tela de resposável e seus usuários */
    fun viewResponsavel(view: View) {
        // tela de view do responsável
    }
    /** Irá chamar a tela para criar novo resposável */
    fun createResponsavel(view: View) {
        // tela de create do responsável
    }
}
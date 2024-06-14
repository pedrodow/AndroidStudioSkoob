package com.example.projetoavaliativo2

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val limpar: Button = findViewById(R.id.facebook)
        val cadastroButton: Button = findViewById(R.id.cadastro)  // Botão para abrir o modal

        limpar.setOnClickListener {
            Toast.makeText(this, "Facebook não está respondendo", Toast.LENGTH_LONG).show()
        }

        cadastroButton.setOnClickListener {
            showSimpleModal()
        }
    }

    fun TelaPrincipal(view: View) {
        val intent = Intent(this, TelaPrincipal::class.java)
        startActivity(intent)
    }

    private fun showSimpleModal() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Cadastro")
        builder.setMessage("Tem certeza que deseja cadastrar?")
        builder.setPositiveButton("sim") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
}

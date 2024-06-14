package com.example.projetoavaliativo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class PesquisarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pesquisar, container, false)

        val fontes = arrayOf(
            "A Sociedade do Anel", "As Duas Torres", "O Retorno Do Rei", "O Hobbit", "Silmarilion",
            "A Lenda de Ruff Ghanor", "O Guia do Mochileiro das Galaxias", "Diário de Um Banana",
            "2001 uma odisseia no espaço", "Harry Potter", "O Herdeiro do Imperio", "1984", "Laranja Mecanica", "Dune",
            "Neuromancer", "Enders Game", "Sherlock Homes"
        )

        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.item_textview, R.id.textViewItem, fontes)
        val lista: ListView = view.findViewById(R.id.navList)
        lista.adapter = arrayAdapter

        return view
    }
}
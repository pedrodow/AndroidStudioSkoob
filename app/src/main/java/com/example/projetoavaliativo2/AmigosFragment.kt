package com.example.projetoavaliativo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projetoavaliativo2.R

class AmigosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_amigos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.imageView1).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView2).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView3).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView4).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView5).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView6).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView7).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView8).setOnClickListener {
            abrirPerfilAmigo()
        }
        view.findViewById<ImageView>(R.id.imageView9).setOnClickListener {
            abrirPerfilAmigo()
        }
    }

    private fun abrirPerfilAmigo() {
        findNavController().navigate(R.id.fragment_pefil_amigo)
    }
}

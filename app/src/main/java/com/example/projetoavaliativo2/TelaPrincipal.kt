package com.example.projetoavaliativo2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.projetoavaliativo2.databinding.ActivityTelaPrincipalBinding

class TelaPrincipal : AppCompatActivity() {
    private lateinit var binding: ActivityTelaPrincipalBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()

        val searchButton: ImageButton = findViewById(R.id.search_button)
        val backButton: Button = findViewById(R.id.back_button)
        val searchEditText: EditText = findViewById(R.id.search_edit_text)
        val toolbarTitle: TextView = findViewById(R.id.toolbar_title)
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        searchButton.setOnClickListener {
            toolbarTitle.visibility = View.GONE
            searchEditText.visibility = View.VISIBLE
            backButton.visibility = View.VISIBLE
            searchEditText.requestFocus()
        }

        backButton.setOnClickListener {
            toolbarTitle.visibility = View.VISIBLE
            searchEditText.visibility = View.GONE
            backButton.visibility = View.GONE
            searchEditText.text.clear()
        }
    }

    private fun initNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.btnv, navController)
    }
}
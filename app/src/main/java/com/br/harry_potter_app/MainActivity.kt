package com.br.harry_potter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import com.br.harry_potter_app.presentation.CharactersHomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

internal class MainActivity : AppCompatActivity() {
    private val viewModel : CharactersHomeViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.test)
        val text  = findViewById<TextView>(R.id.textView)

        viewModel.charactersList.observe(this, Observer { list ->
            println("AQUIII -> $list")
        })

        button.setOnClickListener {
            viewModel.getCharactersList()
        }
    }

}
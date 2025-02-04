package com.humber.lab3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity


class ViewRecipe : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_view_recipe)
        val recipeDetails: TextView = findViewById(R.id.text_recipe_details)
        val deleteButton: Button = findViewById(R.id.btn_delete_recipe)
        MainActivity.currentRecipe?.let {
            recipeDetails.text = it.getDetails()
        }
        deleteButton.setOnClickListener {
            MainActivity.currentRecipe = null
            finish()
        }
    }
}
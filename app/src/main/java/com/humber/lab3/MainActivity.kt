package com.humber.lab3




import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.humber.lab3.models.Recipe

class MainActivity : ComponentActivity() {

    companion object{
        var currentRecipe: Recipe? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addEditButton: Button = findViewById(R.id.btn_add_edit_recipe)
        val viewButton: Button = findViewById(R.id.btn_view_recipe)

        addEditButton.setOnClickListener {
            val intent = Intent(this, AddEditRecipeActivity::class.java)
            startActivity(intent)
        }

        viewButton.setOnClickListener{
            val intent = Intent(this, ViewRecipe::class.java)
            startActivity(intent)
        }

    }
}
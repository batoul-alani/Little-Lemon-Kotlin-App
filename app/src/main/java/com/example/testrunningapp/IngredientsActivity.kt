package com.example.testrunningapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngredientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ingredients)

        val dishName = intent.getStringExtra(EXTRA_DISH_NAME_KEY)
        findViewById<TextView>(R.id.ingredients_list).text = when (dishName) {
            "Hamburger" -> "Minced meat\nBun\nTomato"
            "Pasta" -> "Spaghetti\nTomato\nParmesan"
            else -> "Unknown dish"
        }
    }
    companion object {
        val EXTRA_DISH_NAME_KEY = "DishName"
        fun start(context : Context, dishName : String){
            val intent = Intent(context, IngredientsActivity::class.java)
            intent.putExtra(EXTRA_DISH_NAME_KEY, dishName)
            context.startActivity(intent)
        }
    }
}
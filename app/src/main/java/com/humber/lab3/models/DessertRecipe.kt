package com.humber.lab3.models



class DessertRecipe (
    id: Int,
    title: String,
    ingredients: String,
    instructions: String,
    sweetnessLevel: String
) : Recipe(id, title, ingredients, instructions, "Dessert"){
    var sweetnessLevel: String = sweetnessLevel
    override fun getDetails(): String {
        return super.getDetails() + """
            
            Sweetness Level: $sweetnessLevel
        """.trimIndent()
    }
}
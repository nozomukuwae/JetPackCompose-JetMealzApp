package com.example.mealzapp.model

import com.google.gson.annotations.SerializedName

data class MealCategoriesResponse(val categories: List<MealCategory>)

data class MealCategory(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val description: String,
    @SerializedName("strCategoryDescription") val imageUrl: String,
)

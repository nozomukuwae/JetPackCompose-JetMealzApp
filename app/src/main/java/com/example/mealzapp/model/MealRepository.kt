package com.example.mealzapp.model

class MealRepository(private val mealWebService: MealWebService = MealWebService()) {
    suspend fun getMealCategories(): MealCategoriesResponse = mealWebService.getMealCategories()
}

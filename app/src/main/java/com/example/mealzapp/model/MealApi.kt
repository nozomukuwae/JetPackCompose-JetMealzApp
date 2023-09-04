package com.example.mealzapp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

class MealWebService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.themealdb.com/api/json/v1/1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api = retrofit.create<MealApi>()

    suspend fun getMealCategories(): MealCategoriesResponse = api.getMealCategories()

    interface MealApi {
        @GET("categories.php")
        suspend fun getMealCategories(): MealCategoriesResponse
    }
}

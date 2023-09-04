package com.example.mealzapp.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MealRepository(private val mealWebService: MealWebService = MealWebService()) {
    fun getMealCategories(): Flow<MealCategoriesResponse> = flow {
        emit(mealWebService.getMealCategories())
    }.flowOn(Dispatchers.IO)
}

package com.example.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.example.mealzapp.model.MealRepository

class MealCategoriesViewModel(private val repository: MealRepository = MealRepository()) :
    ViewModel()

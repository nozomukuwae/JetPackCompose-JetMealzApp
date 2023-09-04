package com.example.mealzapp.ui.meals

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealzapp.model.MealCategory
import com.example.mealzapp.model.MealRepository
import kotlinx.coroutines.launch

class MealCategoriesViewModel(private val repository: MealRepository = MealRepository()) :
    ViewModel() {
    val mealCategories: MutableState<List<MealCategory>> = mutableStateOf(emptyList())

    fun getMealCategories() = viewModelScope.launch {
        mealCategories.value = repository.getMealCategories().categories
    }
}

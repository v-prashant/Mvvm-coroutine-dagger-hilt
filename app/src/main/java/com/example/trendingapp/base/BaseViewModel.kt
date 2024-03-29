package com.example.trendingapp.base

import androidx.lifecycle.ViewModel
import com.example.trendingapp.ui.Application

/**
 *
 * Created by Prashant Verma
 *
 */
abstract class BaseViewModel : ViewModel() {
    val applicationContext: Application = Application.getInstance()
}
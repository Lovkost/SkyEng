package com.example.professionalandroidapplicationdevelopment.presenter

import com.example.professionalandroidapplicationdevelopment.model.data.AppState
import com.example.professionalandroidapplicationdevelopment.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}
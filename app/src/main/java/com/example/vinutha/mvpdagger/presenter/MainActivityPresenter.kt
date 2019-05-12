package com.example.vinutha.mvpdagger.presenter

import com.example.vinutha.mvpdagger.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(): MainActivityContract.Presenter {

    lateinit var view: MainActivityContract.View

    override fun setViewToPresenter(view: MainActivityContract.View) {
        this.view = view
        view.initializeView()
    }
}
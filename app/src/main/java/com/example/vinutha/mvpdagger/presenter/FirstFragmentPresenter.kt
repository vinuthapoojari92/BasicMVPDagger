package com.example.vinutha.mvpdagger.presenter

import com.example.vinutha.mvpdagger.FirstFragmentContract
import javax.inject.Inject

class FirstFragmentPresenter @Inject constructor(): FirstFragmentContract.Presenter {

    lateinit var view: FirstFragmentContract.View

    override fun setViewToPresenter(view: FirstFragmentContract.View) {
        this.view = view
        view.initializeView()
    }
}
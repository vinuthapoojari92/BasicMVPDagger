package com.example.vinutha.mvpdagger

interface MainActivityContract {
    interface View{
        fun initializeView()
    }

    interface Presenter{
        fun setViewToPresenter(view: View)
    }
}
package com.example.vinutha.mvpdagger

interface FirstFragmentContract {
    interface View {
        fun initializeView()
    }

    interface Presenter {
        fun setViewToPresenter(view: View)
    }
}
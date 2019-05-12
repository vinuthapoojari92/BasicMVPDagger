package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.FirstFragmentContract
import com.example.vinutha.mvpdagger.presenter.FirstFragmentPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class FirstFragmentModule {
    @Binds
    abstract fun bindPresenter(presenter: FirstFragmentPresenter): FirstFragmentContract.Presenter
}
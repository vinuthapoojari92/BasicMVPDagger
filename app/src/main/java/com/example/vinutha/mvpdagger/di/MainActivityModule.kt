package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.MainActivityContract
import com.example.vinutha.mvpdagger.presenter.MainActivityPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {
    @Binds
    abstract fun bindPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter
}
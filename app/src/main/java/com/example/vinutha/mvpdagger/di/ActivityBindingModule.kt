package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [FragmentBindingModule::class, MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}
package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.view.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {
    @ContributesAndroidInjector(modules = [FirstFragmentModule::class])
    abstract fun bindFileListFragment(): FirstFragment
}
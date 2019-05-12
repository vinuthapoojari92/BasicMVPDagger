package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.view.SmartPhoneApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBindingModule::class]
)
interface AppComponent: AndroidInjector<SmartPhoneApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: SmartPhoneApplication): Builder

        fun build(): AppComponent
    }
}
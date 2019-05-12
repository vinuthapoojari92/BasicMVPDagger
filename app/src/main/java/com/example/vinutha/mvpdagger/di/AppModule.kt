package com.example.vinutha.mvpdagger.di

import com.example.vinutha.mvpdagger.view.SmartPhoneApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun providesApplicationContext(applicationContext: SmartPhoneApplication): SmartPhoneApplication {
        return applicationContext;
    }
}
package com.example.daggerdi

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
   // fun getAnalyticsService() : AnalyticsService

    //fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory

    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder

}
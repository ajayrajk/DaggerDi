package com.example.daggerdi

import android.app.Application
import dagger.internal.DaggerCollections
import javax.inject.Inject

class UserApplication : Application(){
    //lateinit var userRegistrationComponent: UserRegistrationComponent
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        //userRegistrationComponent=DaggerUserRegistrationComponent.factory().create(4)
         appComponent=DaggerAppComponent.builder().build()
    }
}
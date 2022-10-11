package com.example.daggerdi

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email :String , password :String)
}


@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email :String, password :String){
        Log.d("TAG", "user saved in SQL")
        analyticsService.trackEvent("Save User","CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "user saved in Firebase")
        analyticsService.trackEvent("Save User","CREATE")

    }
}
package com.example.daggerdi

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {
/*
* When our component can not provide object so in this case
* we can use  for object creation Provides annotations
* */
//    @Provides
//    fun getFirebaseRepository() : UserRepository{
//        return FirebaseRepository()
//    }
    /*
    * When our component can provide the object in this case we can use binds annotations
    * */
    @ActivityScope
    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}
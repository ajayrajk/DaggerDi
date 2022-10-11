package com.example.daggerdi

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

//@Singleton
@ActivityScope
/*@Component */@Subcomponent(/*dependencies = [AppComponent::class],*/ modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

//       fun getUserRegistrationService() : UserRegistrationService
//
//       fun getEmailService() : EmailService

         fun inject(mainActivity: MainActivity)

        /* @Subcomponent.Factory
         interface Factory{
             fun create(@BindsInstance retryCount : Int *//*, appComponent: AppComponent*//*): UserRegistrationComponent
         }*/

         @Subcomponent.Builder
         interface Builder{
                fun build() : UserRegistrationComponent
                fun retryCount(@BindsInstance retryCount: Int) : Builder
         }


    /*
    * We need to use for Builder define these 3 steps follow
    * 1. @Component.Builder
    * 2. build --> Component
    * 3. Method builder
    * */
}
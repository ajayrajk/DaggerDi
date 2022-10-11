package com.example.daggerdi

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService=(userRepository,emailService)

        //userRegistrationService.registerUser("ajayhbti11@gmail.com", "ajayraj123")
            //.notificationServiceModule(NotificationServiceModule(3))
            //.build()

         //val component=(application as UserApplication).userRegistrationComponent
        val appComponent=(application as UserApplication).appComponent
        //val userRegistrationComponent=DaggerAppComponent.factory().create(3,appComponent)
        val userRegistrationComponent=appComponent.getUserRegistrationComponentBuilder()
            .retryCount(3)
            .build()
         //component.inject(this)
        userRegistrationComponent.inject(this)

//        val registrationService =component.getUserRegistrationService()
//
//        val emailService=component.getEmailService()

          userRegistrationService.registerUser("ajayhbti11@gmail.com", "ajayraj123")


    }
}
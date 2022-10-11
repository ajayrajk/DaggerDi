package com.example.daggerdi

import javax.inject.Inject

class UserRegistrationService @Inject constructor (private val userRepository : UserRepository,
                                                 @MessageQualifier  private val notificationService: NotificationService){
//    private val userRepository= UserRepository()
//    private val emailService= EmailService()

    fun registerUser(email :String , password :String){
         userRepository.saveUser(email , password)
         notificationService.sendEmail(email , "no-reply@gamil.com", "User Registration" )
    }
}

/*
* Unit Testing
* Single Responsibility
* Lifetime of these Objects
* Extensible
* */

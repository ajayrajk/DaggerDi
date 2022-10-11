package com.example.daggerdi

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun sendEmail(email :String , fromEmail :String , body :String )
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService{
    override fun sendEmail(email :String, fromEmail :String, body :String ){
          Log.d("TAG" , "Email Send...")
    }
}

class MessageService(private val retryCount : Int) : NotificationService{
    override fun sendEmail(email :String, fromEmail :String, body :String ){
        Log.d("TAG" , "Message Send...$retryCount")
    }
}
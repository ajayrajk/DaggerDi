package com.example.daggerdi

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule(/*private val retryCount:Int*/) {

    //@Named("message")
//    @MessageQualifier
//    @Provides
//    fun getNotificationServiceModule():NotificationService{
//        return MessageService(retryCount)
//    }
    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int):NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}
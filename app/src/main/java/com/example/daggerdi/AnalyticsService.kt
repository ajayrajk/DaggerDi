package com.example.daggerdi

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName : String , eventType :String)
}


class MixPanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("TAG", "MixPanel $eventName $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("TAG", "Firebase Analytics $eventName $eventType")
    }
}
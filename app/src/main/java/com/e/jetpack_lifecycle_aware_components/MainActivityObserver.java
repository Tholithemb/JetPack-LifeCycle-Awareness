package com.e.jetpack_lifecycle_aware_components;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class  MainActivityObserver implements LifecycleObserver{

    private String TAG =this.getClass().getSimpleName();
    //Keep track of the event
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent(){
        Log.d(TAG, "onCreateEvent: Observer ON_CREATE ");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public  void onResumeEvent(){
        Log.d(TAG, "onResumeEvent: Observer On_Resume");
    }

}
package com.killapp;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;


public class KillAppModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  KillAppModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }
  @Override
  public String getName() {
    return "KillApp";
  }
  
  @ReactMethod
  public void kill() {
    final Activity activity = getCurrentActivity();
    activity.finishAndRemoveTask();
    System.exit(0);
  }
}
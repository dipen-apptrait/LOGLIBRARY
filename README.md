# LOGLIBRARY
<i>Simple Android	Logging library</i>
---
A loggin framework for use in Android application. It allows you to log error, warrning and information easily to the console, just like you would have with Log.e or Log.i or Log.d, but in easy way.It automatically add key param so you only need to pass the message you want to display.


## USAGE

*1. To log an error*
- Instead of ```Log.e(“LOGLIBRARY”,”Print	Error”);``` just write ```logError("Print	Error");```

*2. To log a debug message*
- Instead of ```Log.d(“LOGLIBRARY”,”Print	Debug Message”);``` just write ```logDebug("Print	Debug Message");```

*3. To log an info message*
- Instead of ```Log.i(“LOGLIBRARY”,”Print	Info Message”);``` just write ```logInfo("Print	Info Message");```


 ## Gradle
``` 
repositories {
  maven { url '' }
}
```

 ## Tutorial
 
 1. Create a new Android Studio Project called Log Demo
 
 2. ```In app/build.gradle```, add the following dependencies:
 ``` 
 repositories {
  maven { url '' }
 }
 ```
 3. Now open your activity
 
 - To log an error write 
 ```logError("This is an Error");```

 - To log an info message 
 ```logInfo("This is an Info Message");```

 - To log a debug message  
 ```logDebug("This is a Debug Message");```

 4. Buid and Run application
 
 5. Open Logcat window and you can see a log messages as attached.

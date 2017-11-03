# LOGLIBRARY
<i>Simple Android	Logging library</i>
---
A loggin framework for use in Android application. It allows you to log error, warrning and information easily to the console, just like you would have with Log.e or Log.i or Log.d, but in easy way.It automatically add key param so you only need to pass the message you want to display.


## USAGE

*1. To log an error*
- Instead of ```Log.e(“LOGLIBRARY”,”Print	Error”);``` just write ```LogLib.logError("Print	Error");```

*2. To log a debug message*
- Instead of ```Log.d(“LOGLIBRARY”,”Print	Debug Message”);``` just write ```LogLib.logDebug("Print	Debug Message");```

*3. To log an info message*
- Instead of ```Log.i(“LOGLIBRARY”,”Print	Info Message”);``` just write ```LogLib.logInfo("Print	Info Message");```


 ## Gradle
 
 Step 1. Add the JitPack repository to your build file
 
 Add it in your root build.gradle at the end of repositories:
 
``` 
     allprojects {
         repositories {
             jcenter()
             maven { url "https://jitpack.io" }
         }
    }
```

Step 2. Add the dependency

``` compile 'com.github.dipen-apptrait:LOGLIBRARY:0.1.0'```


 ## Tutorial
 
 1. Create a new Android Studio Project called Log Demo
 
 2. You need to add following gradle dependencies in yours ```project/build.gradle``` (Root gradle file):
 ``` 
     allprojects {
         repositories {
             jcenter()
             maven { url "https://jitpack.io" }
         }
    }
 ```
 
 3. Add following gradle dependencies in yours ```app/build.gradle```:
 
``` compile 'com.github.dipen-apptrait:LOGLIBRARY:0.1.0'```
 
 4. Now open your activity
 
 - To log an error write 
 ```LogLib.logError("This is an Error");```

 - To log an info message 
 ```LogLib.logInfo("This is an Info Message");```

 - To log a debug message  
 ```LogLib.logDebug("This is a Debug Message");```

 5. Buid and Run application
 
 6. Open Logcat window and you can see a log messages as attached.
 
 ![alt text](http://apptraitsolutions.com/images/logcat.png)

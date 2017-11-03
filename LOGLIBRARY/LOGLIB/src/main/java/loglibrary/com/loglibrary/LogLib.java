package loglibrary.com.loglibrary;

import android.util.Log;

/**
 * Created by Innotyle 2 on 11/3/2017.
 */

public class LogLib {


    public static String TAG = "LOGLIBRARY";

    public static void logError(String message) {
        Log.e(TAG, message);
    }

    public static void logDebug(String message) {
        Log.d(TAG, message);
    }

    public static void logInfo(String message) {
        Log.i(TAG, message);
    }


}

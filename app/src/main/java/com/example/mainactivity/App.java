package com.example.mainactivity;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    //source: https://www.youtube.com/watch?v=tTbd1Mfi-Sk&ab_channel=CodinginFlow

    public static final String CHANNEL_1_ID = "It's time for medications";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannels();
    }

    private void createNotificationChannels() {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channell = new NotificationChannel(
                        CHANNEL_1_ID,
                        "channel 1",
                        NotificationManager.IMPORTANCE_HIGH
                );
                channell.setDescription("Take your medicals");

                NotificationManager manager = getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channell);
            }
    }
}

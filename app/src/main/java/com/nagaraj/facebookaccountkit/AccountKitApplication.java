package com.nagaraj.facebookaccountkit;

import android.app.Application;

import com.facebook.accountkit.AccountKit;

/**
 * Created by NAGARAJ on 6/26/2016.
 */
public class AccountKitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AccountKit.initialize(getApplicationContext());

    }
}

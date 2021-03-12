package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("79UOhscc0WL3khdLr4cCN1hu4ClSsLKWXEWfG3if")
                .clientKey("QgkuXtin842XwyvNTzj0mRPgve553GbIIT7m4JtI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

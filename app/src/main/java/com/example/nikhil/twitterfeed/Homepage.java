package com.example.nikhil.twitterfeed;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by NIKHIL on 29-11-2017.
 */

public class Homepage extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.homepage);
        String username = getIntent().getStringExtra("username");

        TextView uname = (TextView) findViewById(R.id.TV_username);

        uname.setText(username);
    }
}

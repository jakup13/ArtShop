package com.example.android.artshop;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void openWebsite(View view) {
        switch (view.getId()){
            case (R.id.website):
                Intent webaddress = new Intent(Intent.ACTION_VIEW);
                webaddress.setData(Uri.parse("http://www.google.com"));
                startActivity(webaddress);
        }
    }
}
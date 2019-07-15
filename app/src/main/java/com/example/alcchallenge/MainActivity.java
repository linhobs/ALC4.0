package com.example.alcchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonAbout;
    private Button mButtonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeDisplay();
    }
//function to handle display and listeners of buttons
    private void initializeDisplay() {
        mButtonAbout= (Button) findViewById(R.id.button_about);
        mButtonProfile = (Button)findViewById(R.id.button_profile);
        //set listener on button 1
        mButtonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutIntent= new Intent(MainActivity.this,AboutActivity.class);
                startActivity(AboutIntent);
            }
        });
        //listener on button 2
        mButtonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProfileIntent= new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(ProfileIntent);
            }
        });

    }

}

package com.example.workshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_select);

        Intent i = getIntent();
        String assn = i.getStringExtra("Assignment");
        ((TextView)findViewById(R.id.assn)).setText(assn);

    }
    public void goToSettings(View v){
        Intent i = new Intent(this,SettingsActivity.class);
        startActivity(i);
    }

}
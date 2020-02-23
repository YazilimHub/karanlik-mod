package com.yazilimhub.darkmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    private DayNightSwitch dayNightSwitch;

    private View view;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        dayNightSwitch = findViewById(R.id.dayNightSwitch);

        view= findViewById(R.id.view);

        text = findViewById(R.id.text);


        dayNightSwitch.setDuration(450);
        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean is_night) {
                if (is_night){
                    Toast.makeText(MainActivity.this,"Dark Mode seçili",Toast.LENGTH_SHORT).show();
                    text.setTextColor(Color.parseColor("#ffffff"));
                    view.setAlpha(1f);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Day Mode seçili",Toast.LENGTH_SHORT).show();
                    text.setTextColor(Color.parseColor("#212121"));
                    view.setAlpha(0f);
                }
            }
        });



    }
}

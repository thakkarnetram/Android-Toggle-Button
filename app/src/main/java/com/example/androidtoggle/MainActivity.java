package com.example.androidtoggle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toggle_button.ToggleSwitch;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleSwitch toggleSwitch = (ToggleSwitch) findViewById(R.id.n_items_toggle_switch);
        ArrayList<String> labels = new ArrayList<>();
        labels.add("A");
        labels.add("B");
        labels.add("C");
        labels.add("D");
        toggleSwitch.setLabels(labels);
    }
}
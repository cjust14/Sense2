package com.example.cecil.sense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mma);
    }

    public void tilbage (View V) {
        Intent intent = new Intent(this, kalender.class);
        startActivity(intent);
    }
}

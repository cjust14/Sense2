package com.example.cecil.sense;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

public class kalender extends AppCompatActivity {
private DatePicker date;
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalender);
        date = findViewById(R.id.datePicker);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        date.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Intent intent3 = new Intent(kalender.this, mma.class);
                startActivity(intent3);
            }
        });
    }

    public void Logud (View V) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
}

    public void info (View V) {
        Intent intent2 = new Intent(this, info.class);
        startActivity(intent2);
    }
}



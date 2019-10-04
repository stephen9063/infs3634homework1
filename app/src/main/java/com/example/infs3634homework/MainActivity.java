package com.example.infs3634homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.gettimesydney);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                String sydneytime = "Sydney time" + format.format(calendar.getTime());

                TextView textview = findViewById(R.id.sydneytime);
                textview.setText(sydneytime);
            }
        });

        Button button1 = findViewById(R.id.gettimelondon);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT+01:00"));
                String londontime = "London time" + (format.format(date));

                TextView textview = findViewById(R.id.londontime);
                textview.setText(londontime);
            }
        });

        Button button2 = findViewById(R.id.gettimebeijing);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viewb) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
                String beijingtime = "Beijing time" + (format.format(date));

                TextView textview = findViewById(R.id.beijingtime);
                textview.setText(beijingtime);
            }
        });

        Button button3 = findViewById(R.id.gettimenewyork);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viewn) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT-05:00"));
                String newyorktime = "New York time" + (format.format(date));

                TextView textview = findViewById(R.id.newyorktime);
                textview.setText(newyorktime);
            }
        });

        Button button4 = findViewById(R.id.gettimehongkong);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viewh) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
                String hongkongtime = "HongKong time" + (format.format(date));

                TextView textview = findViewById(R.id.hongkongtime);
                textview.setText(hongkongtime);
            }
        });
    }
}

package com.example.infs3634homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = findViewById(R.id.gettimelondon);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss zzz");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT"));
                String time = (format.format(date));

                TextView textview = findViewById(R.id.londontime);
                textview.setText(time);
            }
        });
    }
}

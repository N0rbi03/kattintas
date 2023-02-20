package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview.findViewById(R.id.katt);
    textview.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a=1;
            textview.setText("Ennyiszer klikkeltél:"+a);
            a++;
        }
    });
    }


}
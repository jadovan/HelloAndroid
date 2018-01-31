package com.example.jadov.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textElement = (TextView) findViewById(R.id.address);
        textElement.setText("2465 Latham St.\n Mountain View, CA 94043");
    }
}

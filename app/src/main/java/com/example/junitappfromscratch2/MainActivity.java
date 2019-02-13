package com.example.junitappfromscratch2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberHelper numberHelper = new NumberHelper().getInstance();
        if (numberHelper.oddOrEven(5).equals("odd")) {
            //print
        } else {
            //print
        }
    }
}

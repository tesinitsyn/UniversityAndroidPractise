package com.example.universityandroidpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getApplicationContext();
        CharSequence text = "On create toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        CharSequence text = "On start toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onStart();
    }
    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        CharSequence text = "on stop toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        CharSequence text = "on destroy toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Context context = getApplicationContext();
        CharSequence text = "on pause toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Context context = getApplicationContext();
        CharSequence text = "on resume toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onResume();
    }
}
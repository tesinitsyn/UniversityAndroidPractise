package com.example.universityandroidpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getApplicationContext();
        CharSequence text = "On create toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "on create error");
        Log.w(TAG, "on create warning");
        Log.i(TAG, "on create info");
        Log.d(TAG, "on create debug");
        Log.v(TAG, "on create debug");
    }

    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        CharSequence text = "On start toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onStart();
        Log.e(TAG, "on start error");
        Log.w(TAG, "on start warning");
        Log.i(TAG, "on start info");
        Log.d(TAG, "on start debug");
        Log.v(TAG, "on start debug");
    }
    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        CharSequence text = "on stop toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onStop();
        Log.e(TAG, "on stop error");
        Log.w(TAG, "on stop warning");
        Log.i(TAG, "on stop info");
        Log.d(TAG, "on stop debug");
        Log.v(TAG, "on stop debug");
    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        CharSequence text = "on destroy toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.e(TAG, "on create error");
        Log.w(TAG, "on create warning");
        Log.i(TAG, "on create info");
        Log.d(TAG, "on create debug");
        Log.v(TAG, "on create debug");
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
        Log.e(TAG, "on pause error");
        Log.w(TAG, "on pause warning");
        Log.i(TAG, "on pause info");
        Log.d(TAG, "on pause debug");
        Log.v(TAG, "on pause debug");
    }
    @Override
    protected void onResume() {
        Context context = getApplicationContext();
        CharSequence text = "on resume toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onResume();
        Log.e(TAG, "on resume error");
        Log.w(TAG, "on resume warning");
        Log.i(TAG, "on resume info");
        Log.d(TAG, "on resume debug");
        Log.v(TAG, "on resume debug");
    }
}
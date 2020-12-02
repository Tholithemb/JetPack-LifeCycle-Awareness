package com.e.jetpack_lifecycle_aware_components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

// Lifecycle owner
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Owner ON_CREATE");
        getLifecycle().addObserver(new MainActivityObserver());
    }
    @Override
    protected void onResume() {
        super.onResume();
        getLifecycle().addObserver(new MainActivityObserver());
        Toast.makeText(this, "The app has resumed", Toast.LENGTH_SHORT).show();
    }

}
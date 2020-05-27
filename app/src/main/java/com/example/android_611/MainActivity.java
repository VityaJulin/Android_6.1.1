package com.example.android_611;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mainField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainField = findViewById(R.id.text_main_field);

        Log.d("Lifecycle", "onCreate");
        mainField.append("\n" + "onCreate");

        String logSave = mainField.getText().toString();
        if (savedInstanceState == null) {
            mainField.append("\n" + "null");
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown");
        mainField.append("\n" + "onKeyDown");

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.d("Lifecycle", "onRestoreInstanceState");
        mainField.append("\n" + "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d("Lifecycle", "onSaveInstanceState");
        mainField.append("\n" + "onSaveInstanceState");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.d("Lifecycle", "onBackPressed");
        mainField.append("\n" + "onBackPressed");
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress");
        mainField.append("\n" + "onKeyLongPress");

        return super.onKeyLongPress(keyCode, event);
    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Log.d("Lifecycle", "onPostCreate");
        mainField.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d("Lifecycle", "onPostResume");
        mainField.append("\n" + "onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle", "onStart");
        mainField.append("\n" + "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle", "onStop");
        mainField.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle", "onDestroy");
        mainField.append("\n" + "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lifecycle", "onPause");
        mainField.append("\n" + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle", "onResume");
        mainField.append("\n" + "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle", "onRestart");
        mainField.append("\n" + "onRestart");
    }
}

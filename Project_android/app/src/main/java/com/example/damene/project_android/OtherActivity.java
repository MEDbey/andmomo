package com.example.damene.project_android;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by damene1 on 14/12/2018.
 */

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        // TextView login = findViewById(R.id.textView5);
        //Log.d("momo", "onCreate: " + getIntent().getStringExtra("login"));
        //login.setText(getIntent().getStringExtra("login"));
        //TextView mdp = findViewById(R.id.textView6);
        //mdp.setText(getIntent().getStringExtra("mdp"));
    }
}
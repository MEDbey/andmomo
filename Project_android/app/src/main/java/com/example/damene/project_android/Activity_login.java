package com.example.damene.project_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button auth = findViewById(R.id.button);
        auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText login = findViewById(R.id.editText2);
                EditText mdp = findViewById(R.id.editText3);
                String log = login.getText().toString();
                String mp = mdp.getText().toString();
                if(log.equals("momo") && mp.equals("momo")) {
                    Intent intent = new Intent(getApplicationContext(), Activity_arro.class);
                    intent.putExtra("login", log);
                    intent.putExtra("mdp", mp);
                    startActivity(intent);
                } else {
                    Toast.makeText(Activity_login.this, "Identifiant ou Mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

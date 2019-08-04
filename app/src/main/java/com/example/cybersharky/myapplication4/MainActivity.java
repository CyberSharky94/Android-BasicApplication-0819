package com.example.cybersharky.myapplication4;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    public static final String TAG = MainActivity.class.getSimpleName();

    Button btnRun;
    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRun = (Button) findViewById(R.id.btnRun);
        txtName = (EditText) findViewById(R.id.txtName);

        Log.d(TAG, "onCreate: Welcome to this application");

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                String myName = txtName.getText().toString();
                intent.putExtra("myName", myName);

                startActivity(intent);
            }
        });
    }

    public void showMessage(View v) {
//        Toast.makeText(this, "P is P....", Toast.LENGTH_SHORT).show();
        Snackbar msg = Snackbar.make(v, "P is P....", Snackbar.LENGTH_LONG);
        msg.show();
    }
}

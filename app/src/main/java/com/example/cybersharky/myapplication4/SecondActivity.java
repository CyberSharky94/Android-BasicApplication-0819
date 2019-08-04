package com.example.cybersharky.myapplication4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    Button btnSubmit2;
    EditText txtEditText;
    TextView txtSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnSubmit2 = (Button) findViewById(R.id.btnSubmit2);
        txtEditText = (EditText) findViewById(R.id.txtEditText);
        txtSecond = (TextView) findViewById(R.id.txtSecond);

        String myName = getIntent().getStringExtra("myName");
        Log.d(TAG, "onCreate: myName: " + myName);

        txtSecond.setText("I'm running this activity AS " + myName);

        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theText = txtEditText.getText().toString();

                showMessage(v, theText);
            }
        });
    }

    public void showMessage(View v, String text) {
        Snackbar msg = Snackbar.make(v, "My Message: " + text, Snackbar.LENGTH_LONG);
        msg.show();
    }
}

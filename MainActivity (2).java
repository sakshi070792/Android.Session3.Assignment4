package com.mani.session2ass4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText etemail, etpass;
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etemail = (EditText) findViewById(R.id.etemail);
        etpass = (EditText) findViewById(R.id.etpass);
        btlogin = (Button) findViewById(R.id.btlogin);
        btlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String email = etemail.getText().toString();
        String pass = etpass.getText().toString();
        if (email.equals("") || pass.equals("")) {
            Toast.makeText(this, "Please enter something", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
    }
}

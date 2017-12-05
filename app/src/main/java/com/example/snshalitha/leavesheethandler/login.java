package com.example.snshalitha.leavesheethandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login=(Button)findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AutoCompleteTextView userNameTextView=(AutoCompleteTextView)findViewById(R.id.userNameautoCompleteTextView);
                AutoCompleteTextView passwordTextView=(AutoCompleteTextView)findViewById(R.id.passwordautoCompleteTextView);
                String userName=userNameTextView.getText().toString();
                String password=passwordTextView.getText().toString();


            }
        });
    }
}

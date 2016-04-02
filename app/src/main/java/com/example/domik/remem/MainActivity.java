package com.example.domik.remem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        EditText email,password;
        Button login,signIn,buttonNext;

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.Password);
        login = (Button)findViewById(R.id.login_button);
        signIn = (Button)findViewById(R.id.sign_in_button);
        buttonNext = (Button)findViewById(R.id.buttonNext);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Calendar.class));
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register_one.class));
            }
        });

    }

}
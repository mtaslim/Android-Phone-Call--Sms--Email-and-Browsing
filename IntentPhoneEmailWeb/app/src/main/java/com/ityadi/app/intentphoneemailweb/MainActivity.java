package com.ityadi.app.intentphoneemailweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ETmobile,ETemail,ETurl;
    String mobile,email,url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobile = getIntent().getStringExtra("mobile");
        email = getIntent().getStringExtra("email");
        url = getIntent().getStringExtra("url");

        ETmobile = (EditText) findViewById(R.id.ETmobile);
        ETemail = (EditText) findViewById(R.id.ETemail);
        ETurl = (EditText) findViewById(R.id.ETurl);

        ETmobile.setText(mobile);
        ETemail.setText(email);
        ETurl.setText(url);
    }

    public void submitForm(View view) {
        ETmobile = (EditText) findViewById(R.id.ETmobile);
        ETemail = (EditText) findViewById(R.id.ETemail);
        ETurl = (EditText) findViewById(R.id.ETurl);

        mobile = ETmobile.getText().toString();
        email = ETemail.getText().toString();
        url = ETurl.getText().toString();

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("mobile",mobile);
        intent.putExtra("email",email);
        intent.putExtra("url",url);
        startActivity(intent);
    }
}

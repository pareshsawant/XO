package com.example.paresh.xo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class win extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");


        TextView txtView = (TextView) findViewById(R.id.textView4);
        txtView.setText(message);
    }
}

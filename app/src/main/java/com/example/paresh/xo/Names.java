package com.example.paresh.xo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Names extends AppCompatActivity {
    public void playOnclick (View view){

        Intent intent2=new Intent(getApplicationContext(),Play.class);
        startActivity(intent2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);
    }
}

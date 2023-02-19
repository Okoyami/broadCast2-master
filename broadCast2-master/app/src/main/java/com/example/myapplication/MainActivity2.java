package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
Button a; Button b; Button c;      public EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a = findViewById(R.id.BOnline);
        b = findViewById(R.id.BBot);
        c = findViewById(R.id.BFriend);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        editText = findViewById(R.id.Et);

    }

    @Override
    public void onClick(View view) {
        if(editText.getText().length()<1)
            Toast.makeText(this, "Please enter your Nickname", Toast.LENGTH_SHORT).show();

        else {
            if (view == b) {Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
        }
        }
    }
}
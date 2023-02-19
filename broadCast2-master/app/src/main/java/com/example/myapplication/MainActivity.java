package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener


{ @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    Button a; a=findViewById(R.id.button); a.setOnClickListener(this);
    int [] cards = {R.drawable.a_10_of_clubs,R.drawable.a_10_of_diamonds,R.drawable.a_10_of_hearts,R.drawable.a_10_of_spades,R.drawable.a_2_of_clubs,R.drawable.a_2_of_diamonds,R.drawable.a_2_of_hearts,R.drawable.a_2_of_spades,R.drawable.a_3_of_clubs,R.drawable.a_3_of_diamonds,R.drawable.a_3_of_hearts,R.drawable.a_3_of_spades,R.drawable.a_4_of_clubs,R.drawable.a_4_of_diamonds,R.drawable.a_4_of_hearts,R.drawable.a_4_of_spades,R.drawable.a_5_of_clubs,R.drawable.a_5_of_diamonds,R.drawable.a_5_of_hearts,R.drawable.a_5_of_spades,R.drawable.a_6_of_clubs,R.drawable.a_6_of_diamonds,R.drawable.a_6_of_hearts,R.drawable.a_6_of_spades,R.drawable.a_7_of_clubs,R.drawable.a_7_of_diamonds,R.drawable.a_7_of_hearts,R.drawable.a_7_of_spades,R.drawable.a_8_of_clubs,R.drawable.a_8_of_diamonds,R.drawable.a_8_of_hearts,R.drawable.a_8_of_spades,R.drawable.a_9_of_clubs,R.drawable.a_9_of_diamonds,R.drawable.a_9_of_hearts,R.drawable.a_9_of_spades,R.drawable.a_ace_of_clubs,R.drawable.a_ace_of_diamonds,R.drawable.a_ace_of_hearts,R.drawable.a_ace_of_spades,R.drawable.a_jack_of_clubs,R.drawable.a_jack_of_diamonds,R.drawable.a_jack_of_hearts,R.drawable.a_jack_of_spades,R.drawable.a_king_of_clubs,R.drawable.a_king_of_diamonds,R.drawable.a_king_of_hearts,R.drawable.a_king_of_spades,R.drawable.a_queen_of_clubs,R.drawable.a_queen_of_diamonds,R.drawable.a_queen_of_hearts,R.drawable.a_queen_of_spades};



}
    @Override public void onClick(View view)
    {Intent intent = new Intent(MainActivity.this,MainActivity2.class);startActivity(intent);  }



}


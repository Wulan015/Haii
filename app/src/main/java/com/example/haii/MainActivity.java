package com.example.haii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.haii.hallo2;
import com.example.haii.hallo3;
import com.example.haii.hallo4;
import com.example.haii.hallo5;
import com.example.haii.hallo6;
import com.example.haii.hallo7;

public class MainActivity extends AppCompatActivity {

    ImageView ivTwitter, ivInstagram, ivFacebook, ivWattpad, ivWhatsaap, ivTelegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivTwitter = findViewById(R.id.iv_Twitter);
        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo2.class);
                startActivity(intent);
            }
        });

        ivInstagram = findViewById(R.id.iv_Instagram);
        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo3.class);
                startActivity(intent);
            }
        });

        ivFacebook = findViewById(R.id.iv_Facebook);
        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo4.class);
                startActivity(intent);
            }
        });

        ivWattpad = findViewById(R.id.iv_Wattpad);
        ivWattpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo5.class);
                startActivity(intent);
            }
        });

        ivWhatsaap = findViewById(R.id.iv_Whatsapp);
        ivWhatsaap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo6.class);
                startActivity(intent);
            }
        });

        ivTelegram = findViewById(R.id.iv_Telegram);
        ivTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, hallo7.class);
                startActivity(intent);
            }
        });

    }
}
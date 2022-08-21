package com.amath.knowyourlagos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalInfo extends AppCompatActivity {

    ImageView imageView;

    TextView textView,descInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);

        textView = findViewById(R.id.txt_info);
        imageView = findViewById(R.id.imgCircled);
        descInfo = findViewById(R.id.description);


        Intent intent = getIntent();

       imageView.setImageResource(intent.getIntExtra("image",R.drawable.ic_launcher_foreground));
       textView.setText(intent.getStringExtra("name"));
       descInfo.setText(intent.getStringExtra("description"));

    }
}
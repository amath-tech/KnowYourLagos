package com.amath.knowyourlagos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

public class FoodInfo extends AppCompatActivity {

    TextView returnDesc,returnName,returnAddress,returnContact;
    CardView backArow;
    AppCompatImageView returnImg1,returnImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_info);

        returnDesc = findViewById(R.id.returnDesc);
        returnName = findViewById(R.id.returnName);
        returnImg1 = findViewById(R.id.returnImg1);
        returnImg2 = findViewById(R.id.returnImg2);
       returnAddress = findViewById(R.id.returnAddress);
        returnContact = findViewById(R.id.returnContact);

        backArow = findViewById(R.id.backArrow);

        backArow.setOnClickListener(view -> finish());

     //   Intent intent = getIntent();

        returnImg1.setImageResource(getIntent().getIntExtra("imageFood",R.drawable.ic_launcher_foreground));
        returnImg2.setImageResource(getIntent().getIntExtra("imageTwoFood",R.drawable.ic_launcher_foreground));
        returnName.setText(getIntent().getStringExtra("nameFood"));
        returnDesc.setText(getIntent().getStringExtra("descriptionFood"));
        returnAddress.setText(getIntent().getStringExtra("locationFood"));
        returnContact.setText(getIntent().getStringExtra("contactFood"));

    }
}
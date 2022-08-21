package com.amath.knowyourlagos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.amath.knowyourlagos.Adapter.ViewPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    ViewPager viewPager;
    int[] images = {R.drawable.oshodi,R.drawable.lm,R.drawable.cms};
    ViewPagerAdapter viewPagerAdapter;
    //int currentPage = 0;
    Timer timer;
    CardView cardViewFood,cardViewDrinks,cardViewTowns,cardViewHotels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       cardViewFood = findViewById(R.id.cardViewFood);
       cardViewDrinks = findViewById(R.id.cardViewDrinks);
       cardViewTowns = findViewById(R.id.cardViewTowns);
       cardViewHotels = findViewById(R.id.cardViewHotels);

       cardViewFood.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent =  new Intent(MainActivity2.this,FoodActivity.class);
               startActivity(intent);

           }
       });

        cardViewDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =  new Intent(MainActivity2.this,DrinksActivity.class);
                startActivity(intent);

            }
        });

        cardViewTowns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =  new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);

            }
        });

        cardViewHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =  new Intent(MainActivity2.this,HotelsActivity.class);
                startActivity(intent);

            }
        });

        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(MainActivity2.this,images);
        viewPager.setAdapter(viewPagerAdapter);

        final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
        final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            public void run() {
                if (viewPager.getCurrentItem() == viewPagerAdapter.getCount() - 1) { //adapter is your custom ViewPager's adapter
                    viewPager.setCurrentItem(0);
                }
                else {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
                }
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(update);
            }
        }, DELAY_MS, PERIOD_MS);

    }

    @Override
    protected void onDestroy() {
        timer.cancel();
        super.onDestroy();
    }
}
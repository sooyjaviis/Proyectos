package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;

public class CarouselActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel);

        viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(images);
        viewPager.setAdapter(adapter);
    }
}

package com.example.kilogram.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kilogram.R;

public class DetailCars extends AppCompatActivity {
    TextView tvName_Cars;
    ImageView imageCars;
    TextView detailCars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cars);
        tvName_Cars = findViewById(R.id.cars_nama);
        imageCars = findViewById(R.id.cars_thumbnail);
        detailCars = findViewById(R.id.cars_detail);

        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("detail");
        int gambar = getIntent().getIntExtra("image",0);

        tvName_Cars.setText(name);
        detailCars.setText(overview);
        imageCars.setImageResource(gambar);
    }
}

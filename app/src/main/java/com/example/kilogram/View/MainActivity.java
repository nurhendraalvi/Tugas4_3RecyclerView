package com.example.kilogram.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kilogram.Adapter.CarsAdapter;
import com.example.kilogram.Model.CarsModel;
import com.example.kilogram.Presenter.CarsPresenter;
import com.example.kilogram.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    RecyclerView A;
    RecyclerView B;
    RecyclerView C;
    CarsAdapter adapter;
    CarsPresenter listdata;
    List<CarsModel> carsModel = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            A = findViewById(R.id.Rc_v);
            B = findViewById(R.id.Rc_H);
            C = findViewById(R.id.Rc_G);

            A.setLayoutManager(new LinearLayoutManager(this));
            adapter = new CarsAdapter(this,carsModel);
            A.setAdapter(adapter);
            listdata = new CarsPresenter(this,this);
            listdata.setData();

            B.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true));
            adapter = new CarsAdapter(this, carsModel);
            B.setAdapter(adapter);
            listdata = new CarsPresenter(this, this);
            listdata.setData();

            C.setLayoutManager(new GridLayoutManager(this,2));
            adapter = new CarsAdapter(this,carsModel);
            C.setAdapter(adapter);
            listdata = new CarsPresenter(this,this);
            listdata.setData();
    }

    @Override
    public void onSucsess(List<CarsModel> carsModels) {
        this.carsModel.clear();
        this.carsModel.addAll(carsModels);
        this.adapter.notifyDataSetChanged();
    }
}




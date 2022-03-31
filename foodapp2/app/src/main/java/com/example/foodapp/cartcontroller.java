package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import android.net.Uri;
import android.os.Bundle;
//import android.util.Log;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.util.ArrayList;

public class cartcontroller extends AppCompatActivity {
    RecyclerView cart  ;
    ArrayList<Itemdata> arrr;
    Cart mos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_cartcontroller);
        cart=findViewById(R.id.popular_recycler2);
//        Gson gson = new Gson();
        shareprefrance shareprefrance=new shareprefrance(this);

        arrr =shareprefrance.getitem();

//  arrr = gson.fromJson(getIntent().getStringExtra("data"), token.getType());

        mos2= new Cart(arrr,this );

//        Uri ur1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.c);

        cart.setAdapter(mos2);
        cart.setLayoutManager(new LinearLayoutManager(this));
        cart.setHasFixedSize(true);
        mos2.notifyDataSetChanged();


    }
}
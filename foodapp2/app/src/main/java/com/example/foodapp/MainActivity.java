    package com.example.foodapp;

    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageView;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView  ;
    ArrayList<Itemdata> arr;
    recyclerview mos;
    ImageView imageView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView=findViewById(R.id.popular_recycler2);
            arr=new ArrayList<>();
            mos= new recyclerview(arr,this);
            imageView=findViewById(R.id.imageView5);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,cartcontroller.class));
                }
            });
            recyclerView.setAdapter(mos);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setHasFixedSize(true);
            Uri ur1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.c);
            arr.add(new Itemdata(ur1.toString(),"50Egy","cake1","served with two sauces"));
            Uri ur2 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.n);
            arr.add(new Itemdata(ur2.toString(),"70Egy","cake2","served with Three sauces"));
            Uri ur3 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.o);
            arr.add(new Itemdata(ur3.toString(),"80Egy","cake3","served with FOur sauces"));
            Uri ur4 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.q);
            arr.add(new Itemdata(ur4.toString(),"70Egy","cake4","served with two sauces"));
            Uri ur5 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.c);
            arr.add(new Itemdata(ur5.toString(),"130Egy","cake5","served with three sauces"));
            Uri ur6 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.i);
            arr.add(new Itemdata(ur6.toString(),"90EGy","cake6","served with Four sauces"));
            Uri ur7 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.w);
            arr.add(new Itemdata(ur7.toString(),"80Egy","cake7","served with two sauces"));
            Uri ur8 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.y);
            arr.add(new Itemdata(ur8.toString(),"120Egy","cake8","served with Three sauces"));
            Uri ur9 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.vv);
            arr.add(new Itemdata(ur9.toString(),"50Egy","cake9","served with Four sauces"));

        }

    }
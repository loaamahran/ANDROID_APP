package com.example.foodapp;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class Cart extends RecyclerView.Adapter<Cart.Adapter>  {



    ArrayList<Itemdata> arrr ;
    Context context;










    public Cart(ArrayList<Itemdata> arrr, Context context ) {
        this.arrr = arrr;
        this.context = context;


    }

    @NonNull
    @NotNull
    @Override
    public Adapter onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.desgin,parent,false);




        return new Adapter(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Cart.Adapter holder, int position) {
        holder.image2.setImageURI(Uri.parse(arrr.get(position).getImg()));
        holder.name2.setText(arrr.get(position).getName());
        holder.price2.setText(arrr.get(position).getPrice());
        holder.desc2.setText(arrr.get(position).getDesc());





    }

    @Override
    public int getItemCount() {
        return arrr.size();
    }

    public class Adapter extends RecyclerView.ViewHolder {
        ImageView image2;
        TextView name2;
        TextView price2;
        TextView desc2;


        public Adapter(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            image2=itemView.findViewById(R.id.image1);
            name2=itemView.findViewById(R.id.price);
            price2=itemView.findViewById(R.id.desc);
            desc2=itemView.findViewById(R.id.name);

        }
    }
}

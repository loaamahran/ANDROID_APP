package com.example.foodapp;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

class recyclerview extends RecyclerView.Adapter<recyclerview.Adapter>  {



ArrayList<Itemdata> models ;
Context context;

 public  static ArrayList<Itemdata> arrr;





    public recyclerview(ArrayList<Itemdata> models, Context context ) {
        this.models = models;
        this.context = context;
        arrr=new ArrayList<>();


    }

    @NonNull
    @NotNull
    @Override
    public Adapter onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.desgin,parent,false);




        return new Adapter(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull recyclerview.Adapter holder, int position) {
holder.image1.setImageURI(Uri.parse(models.get(position).getImg()));
        holder.name.setText(models.get(position).getName());
        holder.price.setText(models.get(position).getPrice());
holder.desc.setText(models.get(position).getDesc());
holder.button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        Toast.makeText(context, "item has been added", Toast.LENGTH_SHORT).show();


        shareprefrance shareprefrance=new shareprefrance(context);
        Itemdata itemdata=new Itemdata(models.get(position).getImg(),models.get(position).name,models.get(position).desc,models.get(position).price);
        shareprefrance.additemtocart(itemdata);

    }
});

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Adapter extends RecyclerView.ViewHolder {
        ImageView image1;
        TextView name;
        TextView price;
        TextView desc;
        Button button;

        public Adapter(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            name=itemView.findViewById(R.id.price);
            price=itemView.findViewById(R.id.desc);
            desc=itemView.findViewById(R.id.name);
            button=itemView.findViewById(R.id.getstart);
        }
    }

}

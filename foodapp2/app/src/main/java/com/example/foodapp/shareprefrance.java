package com.example.foodapp;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class shareprefrance {
static SharedPreferences sharedPreferences;

ArrayList<Itemdata> itemsincart;
public shareprefrance(Context context) {
        sharedPreferences=context.getSharedPreferences("Itemsdata",Context.MODE_PRIVATE);


    }

    void additemtocart(Itemdata item){
        itemsincart=new ArrayList<>();
        Gson gson =new Gson();
        String itemsstr="";
        String items=sharedPreferences.getString("itemsdata","");
        if (items.equals("")){
            itemsincart.add(item);
             itemsstr=   gson.toJson(itemsincart);
        }
        else {
            TypeToken<ArrayList<Itemdata>> token = new TypeToken<ArrayList<Itemdata>>() {};
            itemsincart=gson.fromJson(items, token.getType());
            itemsincart.add(item);
            itemsstr  = gson.toJson(itemsincart);
        }
        sharedPreferences.edit().putString("itemsdata",itemsstr).apply();
    }
    ArrayList<Itemdata> getitem(){
        itemsincart=new ArrayList<>();
        Gson gson =new Gson();
        String items=sharedPreferences.getString("itemsdata","");
    if (!items.equals("")){
        TypeToken<ArrayList<Itemdata>> token = new TypeToken<ArrayList<Itemdata>>() {};
        itemsincart=gson.fromJson(items, token.getType());

    }
    return itemsincart;
    }
    Boolean removeitem(int postion){
        String itemsstr="";
        Gson gson =new Gson();
       itemsincart =new ArrayList<>();
        itemsincart=getitem();
        itemsincart.remove(postion);
        itemsstr=   gson.toJson(itemsincart);
        sharedPreferences.edit().putString("itemsdata",itemsstr).apply();
        return true;
    }

     void clearcart() {
        sharedPreferences.edit().putString("itemsdata","").apply();
    }

}

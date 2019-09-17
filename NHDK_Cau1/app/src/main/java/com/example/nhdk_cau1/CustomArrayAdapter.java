package com.example.nhdk_cau1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<Coutry> {
    Context context;
    ArrayList<Coutry>arrayList;
    int layoutResource;

    public CustomArrayAdapter(Context context,int resource,ArrayList<Coutry>objects){
        super(context,resource,objects);
        this.context=context;
        this.arrayList=objects;
        this.layoutResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=LayoutInflater.from(context);
        convertView=inflater.inflate(layoutResource,null);
        TextView txt1=(TextView)convertView.findViewById(R.id.textView);
        txt1.setText(arrayList.get(position).getName());

        TextView txt2=(TextView)convertView.findViewById(R.id.textView2);
        txt2.setText(arrayList.get(position).getPopulate());

        ImageView img=(ImageView)convertView.findViewById(R.id.img);
        img.setImageResource(arrayList.get(position).getImg());

        ImageView img2=(ImageView)convertView.findViewById(R.id.img2);
        img2.setImageResource(arrayList.get(position).getImg2());

        return  convertView;
    }
}

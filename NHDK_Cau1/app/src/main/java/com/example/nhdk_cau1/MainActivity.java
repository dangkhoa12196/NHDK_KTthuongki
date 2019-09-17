package com.example.nhdk_cau1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Coutry>arrayList;
    CustomArrayAdapter customArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

        arrayList=new ArrayList<>();
        arrayList.add(new Coutry("Ky Duyen","1990",R.drawable.pic1,R.drawable.co1));
        arrayList.add(new Coutry("Dang Thu Thao","1995",R.drawable.pic2,R.drawable.co2));
        arrayList.add(new Coutry("Nguyen Thi Huyen","1990",R.drawable.pic3,R.drawable.co3));
        arrayList.add(new Coutry("Thanh Huyen","1996",R.drawable.pic4,R.drawable.co4));
        arrayList.add(new Coutry("Do My Linh","1997",R.drawable.pic4,R.drawable.co4));

        customArrayAdapter=new CustomArrayAdapter(MainActivity.this,R.layout.custom_layout,arrayList);
        listView.setAdapter(customArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

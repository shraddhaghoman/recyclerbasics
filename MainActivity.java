package com.example.shraddha.rate1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;
    itemAdapter adapter;
    List<itemInfo> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=(RecyclerView)findViewById(R.id.recv);
         //recyclerView.setHasFixedSize(true);

        linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
         adapter=new itemAdapter(getdata());
       recyclerView.setAdapter(adapter);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        
    }


    private List<itemInfo> getdata()
    {
        List<itemInfo> data=new ArrayList<>();
        int[] age={25,23,34,26,35,29,38,31,30,40};
        String[] name={"name1","name2","name3","name4","name5","name6","name7","name8","name9","name10"};

        for(int i=0;i<name.length;i++)
        {
            itemInfo current=new itemInfo();
            current.name=name[i];
            current.age=age[i];
            data.add(current);
           // adapter.notifyDataSetChanged();

        }
        return data;


    }
}

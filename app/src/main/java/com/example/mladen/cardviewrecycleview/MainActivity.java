package com.example.mladen.cardviewrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView mRecyclerView; //todo ovo pokriva recyclerview iz activity_main.xml
private RecyclerView.Adapter mAdapter;
private RecyclerView.LayoutManager mLayoutManager;//TODO ovo pokriva context this


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_phone, "tekst1" , "tekst2"));
        exampleList.add(new ExampleItem(R.drawable.ic_supervisor_account_black_24dp, "tekst1" , "tekst2"));



        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
mRecyclerView.setLayoutManager(mLayoutManager);
mRecyclerView.setAdapter(mAdapter);


    }
}

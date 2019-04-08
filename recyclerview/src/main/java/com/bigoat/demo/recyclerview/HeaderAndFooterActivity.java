package com.bigoat.demo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HeaderAndFooterActivity extends AppCompatActivity {
    private List<String> datas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_and_footer);

        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");
        datas.add("5");
        datas.add("6");

        RecyclerView recyclerView = findViewById(R.id.content);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        BaseAdapter adapter = new BaseAdapter(datas);
        HeaderAndFooterAdapterWrapper newAdapter = new HeaderAndFooterAdapterWrapper(adapter);

        View headerView = getLayoutInflater().inflate(R.layout.item_header, recyclerView, false);
        View footerView = getLayoutInflater().inflate(R.layout.item_footer, recyclerView, false);

        newAdapter.addFooterView(footerView);
//        newAdapter.addHeaderView(headerView);

        recyclerView.setAdapter(newAdapter);
    }
}

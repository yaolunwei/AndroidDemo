package com.bigoat.demo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity {

    private List<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        RecyclerView recyclerView = findViewById(R.id.list);

        // 1. 布局
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.canScrollHorizontally();//能否横向滚动
//        layoutManager.canScrollVertically();//能否纵向滚动
//        layoutManager.scrollToPosition(int position);//滚动到指定位置
//
//        layoutManager.setOrientation(int orientation);//设置滚动的方向
//        layoutManager.getOrientation();//获取滚动方向
//
//        layoutManager.findViewByPosition(int position);//获取指定位置的Item View
//        layoutManager.findFirstCompletelyVisibleItemPosition();//获取第一个完全可见的Item位置
//        layoutManager.findFirstVisibleItemPosition();//获取第一个可见Item的位置
//        layoutManager.findLastCompletelyVisibleItemPosition();//获取最后一个完全可见的Item位置
//        layoutManager.findLastVisibleItemPosition();//获取最后一个可见Item的位置//
        recyclerView.setLayoutManager(layoutManager);



        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");
        datas.add("5");
        datas.add("6");
        datas.add("7");
        datas.add("8");
        datas.add("9");

        BaseAdapter adapter = new BaseAdapter(datas);

        // 2. 提供数据
        recyclerView.setAdapter(adapter);
    }
}

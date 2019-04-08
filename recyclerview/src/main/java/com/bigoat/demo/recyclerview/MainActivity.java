package com.bigoat.demo.recyclerview;

import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

//https://www.jianshu.com/p/4f9591291365
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void base(View view) {
        startActivity(new Intent(this, BaseActivity.class));
    }

    public void headerAndFooter(View view) {
        startActivity(new Intent(this, HeaderAndFooterActivity.class));

    }
}

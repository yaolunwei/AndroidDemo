package com.bigoat.demo.databindinglivedataviewmode;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bigoat.demo.databindinglivedataviewmode.databinding.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final UserViewMode viewMode = ViewModelProviders.of(this).get(UserViewMode.class);

        binding.setUser(viewMode);


        viewMode.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                Log.d("TAG", "observe: " + viewMode.getUser().getValue().toString());

            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", viewMode.getUser().getValue().toString());
                binding.executePendingBindings();
            }
        });


    }
}

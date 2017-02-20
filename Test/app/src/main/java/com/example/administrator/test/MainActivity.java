package com.example.administrator.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvshow)
    TextView tvshow;
    @BindView(R.id.btshow)
    Button btshow;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;
    @BindView(R.id.lvshow)
    ListView lvshow;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);

    }

    @OnClick({R.id.tvshow, R.id.btshow, R.id.activity_main})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvshow:
                break;
            case R.id.btshow:
                break;
            case R.id.activity_main:
                break;
        }
    }

    @OnClick(R.id.lvshow)
    public void onClick() {
    }
}

package com.cucharo.cucharoquiz1.Secondary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.cucharo.cucharoquiz1.R;

public class AndroidPagesActivity extends AppCompatActivity {
    TextView codename,version,api,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        codename = (TextView) findViewById(R.id.tvCodename);
        version = (TextView) findViewById(R.id.tvVersion);
        api = (TextView) findViewById(R.id.tvAPI);
        date = (TextView) findViewById(R.id.tvDate);


    }
}

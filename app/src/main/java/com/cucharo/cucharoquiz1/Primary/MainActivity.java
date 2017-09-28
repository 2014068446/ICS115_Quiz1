package com.cucharo.cucharoquiz1.Primary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.cucharo.cucharoquiz1.R;
import com.cucharo.cucharoquiz1.Secondary.AndroidPagesActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] android, version, api, date;
    ListView lv_android;
    CustomAdapter adapter;
    List<Android> listandroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_android = (ListView) findViewById(R.id.lvAndroid);
        listandroid = new ArrayList<Android>();
        android = getResources().getStringArray(R.array.codename);
        date = getResources().getStringArray(R.array.date);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.API);


        for (int i = 0; i < android.length; i++) {
            listandroid.add(new Android(android[i]));
        }
        adapter = new CustomAdapter(this, listandroid);
        lv_android.setAdapter(adapter);
        lv_android.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "Rank in my favorites: " + (position+1);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void callSecondActivity (View view) {
        Intent intent = new Intent(this,AndroidPagesActivity.class);
        intent.putExtra("codename", android[0]);  // getText returns object
        intent.putExtra("version", version[0]);
        intent.putExtra("api", api[0]);
        intent.putExtra("date", date[0]);

        startActivity(intent);
    }
}

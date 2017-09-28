package com.example.donnald.quiz1.Home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.donnald.quiz1.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] android;
    ListView lv_android;
    com.example.donnald.quiz1.Home.CustomAdapter adapter;
    List<Android> listandroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_android = (ListView) findViewById(R.id.lvAndroid);
        listandroid = new ArrayList<Android>();
        android = getResources().getStringArray(R.array.codename);

        for (int i = 0; i < android.length; i++) {
            listandroid.add(new Android(android[i]));
        }
        adapter = new com.example.donnald.quiz1.Home.CustomAdapter(this, listandroid);
        lv_android.setAdapter(adapter);
        lv_android.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "Rank in my favorites: " + (position+1);
                Toast.makeText(com.example.donnald.quiz1.Home.MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

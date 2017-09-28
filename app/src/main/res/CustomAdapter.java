package com.example.donnald.quiz1.Home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.donnald.quiz1.R;

import java.util.List;

/**
 * Created by Donnald on 9/28/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    private List<Android> listandroid;
    TextView tvCodeName;


    public CustomAdapter(Context c, List<Android> listandroid) {
        this.c = c;
        this.listandroid = listandroid;
    }




    @Override
    public int getCount() {
        return listandroid.size();
    }

    @Override
    public Object getItem(int position) {
        return listandroid.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(c, R.layout.row_layout, null);
        tvCodeName = (TextView) v.findViewById(R.id.tvAndroidName);
        tvCodeName.setText(listandroid.get(position).getCodename());
        return v;
    }
}

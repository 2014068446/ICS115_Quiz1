package com.cucharo.cucharoquiz1.Secondary;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cucharo.cucharoquiz1.R;

import java.util.List;

/**
 * Created by Donnald on 9/28/2017.
 */

public class CustomAdapterSecondary extends BaseAdapter {
    Context c;
    private List<AndroidSecondary> listandroid;
    TextView tvCodeName,tvVersion,tvAPI,tvDate;
    ImageView ivLogo;

    public CustomAdapterSecondary(Context c,
                                  List<AndroidSecondary> listandroid,
                                  TextView tvCodeName,
                                  TextView tvVersion,
                                  TextView tvAPI,
                                  TextView tvDate,
                                  ImageView ivLogo) {
        this.c = c;
        this.listandroid = listandroid;
        this.tvCodeName = tvCodeName;
        this.tvVersion = tvVersion;
        this.tvAPI = tvAPI;
        this.tvDate = tvDate;
        this.ivLogo = ivLogo;
    }

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    public List<AndroidSecondary> getListandroid() {
        return listandroid;
    }

    public void setListandroid(List<AndroidSecondary> listandroid) {
        this.listandroid = listandroid;
    }

    public TextView getTvCodeName() {
        return tvCodeName;
    }

    public void setTvCodeName(TextView tvCodeName) {
        this.tvCodeName = tvCodeName;
    }

    public TextView getTvVersion() {
        return tvVersion;
    }

    public void setTvVersion(TextView tvVersion) {
        this.tvVersion = tvVersion;
    }

    public TextView getTvAPI() {
        return tvAPI;
    }

    public void setTvAPI(TextView tvAPI) {
        this.tvAPI = tvAPI;
    }

    public TextView getTvDate() {
        return tvDate;
    }

    public void setTvDate(TextView tvDate) {
        this.tvDate = tvDate;
    }

    public ImageView getIvLogo() {
        return ivLogo;
    }

    public void setIvLogo(ImageView ivLogo) {
        this.ivLogo = ivLogo;
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
        View v = View.inflate(c, R.layout.activity_pages, null);
        ivLogo = (ImageView) v.findViewById(R.id.ivLogo);
        tvCodeName = (TextView) v.findViewById(R.id.tvCodename);
        tvAPI = (TextView) v.findViewById(R.id.tvAPI);
        tvDate = (TextView) v.findViewById(R.id.tvDate);
        tvVersion = (TextView) v.findViewById(R.id.tvVersion);

        ivLogo.setImageResource(listandroid.get(position).getLogo());
        tvCodeName.setText(listandroid.get(position).getCodename());
        tvAPI.setText(listandroid.get(position).getApi());
        tvVersion.setText(listandroid.get(position).getVersion());
        tvDate.setText(listandroid.get(position).getDate());

        return v;
    }
}

package com.example.kashasha.m101;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PH-Data™ 01221240053 on 09/12/2017.
 */

public class DiseasesAdapter extends ArrayAdapter<Disease> {

    Context mContext;
    private List<Disease> DataList;


    public DiseasesAdapter(Context mContext, List<Disease> DataList) {
        super(mContext,R.layout.diseas_item,DataList);
        this.mContext = mContext;
        this.DataList = DataList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(R.layout.diseas_item, parent, false);

        TextView textViewDiseaseName = (TextView) listItem.findViewById(R.id.disease_name);

      Disease disease= DataList.get(position);

        textViewDiseaseName.setText(disease.getName());
        return listItem;
    }
}
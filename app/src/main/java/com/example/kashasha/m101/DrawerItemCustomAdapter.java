package com.example.kashasha.m101;

/**
 * Created by PH-Data™ 01221240053 on 06/12/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DrawerItemCustomAdapter extends ArrayAdapter<DataModel> {

    Context mContext;
    private List<DataModel> DataList;


    public DrawerItemCustomAdapter(Context mContext,List<DataModel> DataList) {

        super(mContext,R.layout.side_menu_item, DataList);
        this.mContext = mContext;
        this.DataList=DataList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(R.layout.side_menu_item, parent, false);

        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.icon);
        TextView textViewTitle = (TextView) listItem.findViewById(R.id.title);

        DataModel model = DataList.get(position);

        textViewTitle.setText(model.getTitle());
        imageViewIcon.setBackgroundResource(model.getIcon());


        return listItem;
    }
}
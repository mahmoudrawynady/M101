package com.example.kashasha.m101;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PH-Data™ 01221240053 on 09/12/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.SideMenuViewHolder> {

    private List<DataModel> DataList;
    private Context context;

    public class SideMenuViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView icon;

        public SideMenuViewHolder(View view) {
            super(view);

        }
    }


    public  RecyclerAdapter(List<DataModel> moviesList,Context context) {
        this.DataList = moviesList;
        this.context=context;

    }

    @Override
    public SideMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.side_menu_item, parent, false);

        return new SideMenuViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SideMenuViewHolder holder, int position) {

        DataModel model = DataList.get(position);
        holder.title.setText(model.getTitle());
        holder.icon.setBackgroundResource(model.getIcon());

    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }
}
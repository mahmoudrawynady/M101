package com.example.kashasha.m101;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PH-Data™ 01221240053 on 09/12/2017.
 */

public class Community extends Fragment {

    public Community() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.community, container, false);

        return rootView;
    }

}
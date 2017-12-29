package com.example.kashasha.m101;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PH-Data™ 01221240053 on 08/12/2017.
 */

public class Info extends Fragment {
List<Disease>Diseases;
ListView list;
    public Info () {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info, container, false);
        Diseases=new ArrayList();
        Diseases.add(new Disease(getString(R.string.firstdis),getString(R.string.firs_information)));
        Diseases.add(new Disease(getString(R.string.second),getString(R.string.second_info)));
        Diseases.add(new Disease(getString(R.string.third),getString(R.string.third_info)));
        Diseases.add(new Disease(getString(R.string.fourth),getString(R.string.fourth_info)));
        Diseases.add(new Disease(getString(R.string.fifth),getString(R.string.fifth_info)));
        Diseases.add(new Disease(getString(R.string.six),getString(R.string.six_info)));
        Diseases.add(new Disease(getString(R.string.seven),getString(R.string.seven_info)));
        Diseases.add(new Disease(getString(R.string.eight),getString(R.string.eight_info)));
        Diseases.add(new Disease(getString(R.string.nien),getString(R.string.nien_info)));
        DiseasesAdapter adapter=new DiseasesAdapter(getActivity(),Diseases);
        list= (ListView) rootView.findViewById(R.id.dis_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Disease disease=(Disease) Diseases.get(position);
                Intent intent=new Intent(getActivity(),InfoActivity.class);
                intent.putExtra("name",disease.getName());
                intent.putExtra("info",disease.getInfo());
                intent.putExtra("title",getActivity().getTitle());
                getActivity().startActivity(intent);

            }
        });



        return rootView;
    }

}
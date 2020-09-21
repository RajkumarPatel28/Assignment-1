package com.example.rajkumarpatel_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentUp extends Fragment {

    ListView listview;

    String[] activities = new String[]{"AIActivity", "VRActivity"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_up, container, false);
        listview = (ListView) view.findViewById(R.id.ListView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activities);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), AIActivity.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), VRActivity.class);
                    startActivityForResult(intent, 1);
                }

            }
        });
        return view;
    }
}
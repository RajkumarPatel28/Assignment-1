package com.example.rajkumarpatel_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.fragment.app.ListFragment;

public class FragmentUp extends ListFragment {

    String[] activities = new String[]{"AIActivity", "VRActivity"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_up, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activities);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        if (position == 0) {
            Intent intent = new Intent(v.getContext(), AIActivity.class);
            startActivity(intent);
        }

        else {
            Intent intent = new Intent(v.getContext(), VRActivity.class);
            startActivity(intent);
        }
    }
}








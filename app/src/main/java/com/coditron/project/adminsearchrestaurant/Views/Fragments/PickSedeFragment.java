package com.coditron.project.adminsearchrestaurant.Views.Fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.coditron.project.adminsearchrestaurant.R;


public class PickSedeFragment extends Fragment {
    private ArrayAdapter adapter;
    public PickSedeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pick_sede, container, false);
    }

    @Override
    public  void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Spinner spinnerSede = (Spinner) getActivity().findViewById(R.id.spinner_sede);
        adapter= ArrayAdapter.createFromResource(this.getActivity(), R.array.Ciudades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSede.setAdapter(adapter);
    }


}

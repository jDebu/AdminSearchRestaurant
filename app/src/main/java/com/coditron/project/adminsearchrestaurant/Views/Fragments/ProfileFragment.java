package com.coditron.project.adminsearchrestaurant.Views.Fragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.coditron.project.adminsearchrestaurant.R;
import com.coditron.project.adminsearchrestaurant.Views.Activities.DashboardActivity;

/**
 * Created by estacion on 03/07/15.
 */
public class ProfileFragment extends Fragment {
    private String title;
    public ProfileFragment(String title) {
        // Required empty public constructor
        this.title=title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public  void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Button btnEditBasicInfo = (Button) getActivity().findViewById(R.id.action_edit_basic_info);
       // final LinearLayout layoutContentBasicInfo = (LinearLayout) getActivity().findViewById(R.id.layout_content_basic_info);
       // layoutContentBasicInfo.setVisibility(View.VISIBLE);
        btnEditBasicInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         //       layoutContentBasicInfo.setVisibility(View.GONE);
                Intent intent= new Intent(getActivity(),DashboardActivity.class);
                intent.putExtra("editBasicInfo", "Editar");
                startActivity(intent);
            }
        });

    }


}

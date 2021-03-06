package com.coditron.project.adminsearchrestaurant.Views.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.coditron.project.adminsearchrestaurant.R;
import com.coditron.project.adminsearchrestaurant.Views.Activities.SplashLoginActivity;
import com.coditron.project.adminsearchrestaurant.Views.Activities.VerifyCodeRecoverPassActivity;

/**
 * Created by estacion on 02/07/15.
 */
public class LoginFragment extends Fragment {
    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public  void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Button btnStartSession = (Button) getActivity().findViewById(R.id.btn_start_session);
        btnStartSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SplashLoginActivity.class);
                startActivity(intent);

            }
        });
        Button btnRecoverPassword = (Button) getActivity().findViewById(R.id.btn_recover_password);
        btnRecoverPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),VerifyCodeRecoverPassActivity.class);
                startActivity(intent);
            }
        });
    }
}

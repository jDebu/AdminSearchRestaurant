package com.coditron.project.adminsearchrestaurant.Views.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.coditron.project.adminsearchrestaurant.R;
import com.coditron.project.adminsearchrestaurant.Views.Fragments.LoginFragment;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setToolbar();
        Button btnAddUser = (Button) findViewById(R.id.btn_add_user);
        btnAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this,NewUserActivity.class);
                startActivity(intent);
            }
        });
        displayFragmentLogin();

    }

    private void displayFragmentLogin() {
        Button btnAddUser = (Button) findViewById(R.id.btn_add_user);
        ImageView imgAddUser= (ImageView) findViewById(R.id.image_add_user);
        FrameLayout frameLayoutStarSession = (FrameLayout) findViewById(R.id.frame_start_session);
        if (getIntent().getExtras().getInt("enableUserRegister")==1){ /*habilitado login quitar imagen*/
            btnAddUser.setVisibility(View.GONE);
            imgAddUser.setVisibility(View.GONE);
            frameLayoutStarSession.setVisibility(View.VISIBLE);
            Fragment fragmentLogin = new LoginFragment();
            if (fragmentLogin!=null){
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_start_session, fragmentLogin).commit();

            }else{
                Log.e("LoginFragment", "Failed create fragment");
            }
        }else{
            btnAddUser.setVisibility(View.VISIBLE);
            imgAddUser.setVisibility(View.VISIBLE);
            frameLayoutStarSession.setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setToolbar() {
        // Añadir la Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}

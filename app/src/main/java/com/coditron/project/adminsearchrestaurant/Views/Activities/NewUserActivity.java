package com.coditron.project.adminsearchrestaurant.Views.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.coditron.project.adminsearchrestaurant.R;
import com.coditron.project.adminsearchrestaurant.Views.Fragments.BasicInfoFragment;
import com.coditron.project.adminsearchrestaurant.Views.Fragments.CreateAccountFragment;
import com.coditron.project.adminsearchrestaurant.Views.Fragments.PickSedeFragment;


public class NewUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        setToolbar();
        if (savedInstanceState == null)
            displayAllFragments();


    }

    private void displayAllFragments() {
        Fragment fragmentBasicInfo= new BasicInfoFragment();
        if (fragmentBasicInfo!=null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_basic_info, fragmentBasicInfo).commit();

        }else{
            Log.e("BasicInfoFragment","Failed create fragment");
        }
        Fragment fragmentPickSede= new PickSedeFragment();
        if (fragmentPickSede!=null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_sede, fragmentPickSede).commit();

        }else{
            Log.e("PickSedeFragment","Failed create fragment");
        }
        Fragment fragmentCreateAccount= new CreateAccountFragment();
        if (fragmentCreateAccount!=null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_account, fragmentCreateAccount).commit();

        }else{
            Log.e("CreateAccountFragment","Failed create fragment");
        }
    }

    private void setToolbar() {
        // Añadir la Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) // Habilitar up button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

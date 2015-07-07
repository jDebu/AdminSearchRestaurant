package com.coditron.project.adminsearchrestaurant.Views.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.coditron.project.adminsearchrestaurant.R;


public class ConfirmationAddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_add_user);
        setToolbar();

        Thread timerThread= new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent= new Intent(ConfirmationAddUserActivity.this,LoginActivity.class);
                    intent.putExtra("enableUserRegister",1);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

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
        getMenuInflater().inflate(R.menu.menu_confirmation_add_user, menu);
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
    @Override
    protected  void onPause(){
        super.onPause();
        finish();
    }
}

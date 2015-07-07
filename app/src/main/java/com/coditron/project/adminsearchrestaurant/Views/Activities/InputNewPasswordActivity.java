package com.coditron.project.adminsearchrestaurant.Views.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.coditron.project.adminsearchrestaurant.R;

/**
 * Created by estacion on 03/07/15.
 */
public class InputNewPasswordActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_new_pass);
        setToolbar();
        Button btnChangePassword= (Button) findViewById(R.id.btn_change_pass);

        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputNewPasswordActivity.this,LoginActivity.class);
                intent.putExtra("enableUserRegister",1);
                startActivity(intent);
            }
        });
    }
    private void setToolbar() {
        // Añadir la Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) // Habilitar up button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

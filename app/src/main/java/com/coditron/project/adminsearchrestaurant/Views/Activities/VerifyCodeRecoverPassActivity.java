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
public class VerifyCodeRecoverPassActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code_recover_password);
        final Button btnSendCodeEmail = (Button) findViewById(R.id.btn_send_code_to_email);
        setToolbar();
        Button btnSendNewPassword= (Button) findViewById(R.id.btn_send_input_new_pass);
        btnSendCodeEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSendCodeEmail.setText("Reenviar código");
            }
        });
        btnSendNewPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(VerifyCodeRecoverPassActivity.this,InputNewPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setToolbar() {
        // Añadir la Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*if (getSupportActionBar() != null) // Habilitar up button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
    }
}

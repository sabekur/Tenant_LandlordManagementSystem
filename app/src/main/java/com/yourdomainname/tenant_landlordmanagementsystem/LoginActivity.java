package com.yourdomainname.tenant_landlordmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

 Button loginbtn;
    TextView registernow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginbtn=(Button)findViewById(R.id.btnSingIn);
        registernow=(TextView)findViewById(R.id.regisNowText);
        registernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(LoginActivity.this,RegistrationOption.class);
                startActivity(myintent);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,Tenant_All_Options.class);
                startActivity(intent);
            }
        });
    }
}

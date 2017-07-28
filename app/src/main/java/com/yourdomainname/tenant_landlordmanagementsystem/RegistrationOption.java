package com.yourdomainname.tenant_landlordmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationOption extends AppCompatActivity {
    Button landlordbtn,tenantbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_option);
        landlordbtn=(Button)findViewById(R.id.landlordbtn) ;
        tenantbtn=(Button)findViewById(R.id.tenantbtn);

        landlordbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegistrationOption.this,LandlordRegistrationFrom.class);
                startActivity(intent);
            }
        });

        tenantbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegistrationOption.this,TenantRegistrationFrom.class);
                startActivity(intent);
            }
        });

    }
}

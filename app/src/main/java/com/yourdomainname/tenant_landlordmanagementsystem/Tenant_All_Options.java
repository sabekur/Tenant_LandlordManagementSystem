package com.yourdomainname.tenant_landlordmanagementsystem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.yourdomainname.tenant_landlordmanagementsystem.Tenant_All_options.Notice_board_Tenant;
import com.yourdomainname.tenant_landlordmanagementsystem.Tenant_All_options.Objection_tanant;
import com.yourdomainname.tenant_landlordmanagementsystem.Tenant_All_options.Payment_tenant;
import com.yourdomainname.tenant_landlordmanagementsystem.Tenant_All_options.Profile_tenant;
import com.yourdomainname.tenant_landlordmanagementsystem.Tenant_All_options.Rules_tenant;

import java.util.ArrayList;

public class Tenant_All_Options extends AppCompatActivity {
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant__all__options);
        Bitmap profileIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.profile);
        Bitmap rulesIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.rules);
        Bitmap objectionIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.objection);
        Bitmap paymentIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.payment);
        Bitmap noticeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.noticeboard);


        gridArray.add(new Item(profileIcon,"Profile"));
        gridArray.add(new Item(rulesIcon,"Rules"));
        gridArray.add(new Item(objectionIcon,"Objection"));
        gridArray.add(new Item(paymentIcon,"Payment"));
        gridArray.add(new Item(noticeIcon,"NoticeBoard"));

        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if(position == 0){
                    Intent intent=new Intent(Tenant_All_Options.this,Profile_tenant.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent=new Intent(Tenant_All_Options.this,Rules_tenant.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent=new Intent(Tenant_All_Options.this,Objection_tanant.class);
                    startActivity(intent);

                }
                if(position == 3){
                    Intent intent=new Intent(Tenant_All_Options.this,Payment_tenant.class);
                    startActivity(intent);

                }
                if(position == 4){
                    Intent intent=new Intent(Tenant_All_Options.this,Notice_board_Tenant.class);
                    startActivity(intent);

                }
            }
        });
    }
}

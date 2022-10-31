package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class Home_Activity extends AppCompatActivity {

    Button ferti_Btn,map_Btn,weather_Btn,chatbot_Btn;

    BottomNavigationView nav;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        nav=findViewById(R.id.nav);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(Home_Activity.this,Home_Activity.class));
                        break;

                    case R.id.news:
                        startActivity(new Intent(Home_Activity.this,Invent_tory.class));
                        break;

                    case R.id.drone:
                        startActivity(new Intent(Home_Activity.this,Agri_Learn.class));
                        break;

                    case R.id.setting:
                        startActivity(new Intent(Home_Activity.this,Setting_info.class));
                        break;

                    default:
                }

                return false;
            }
        });




        ferti_Btn=findViewById(R.id.calci_btn);
        map_Btn=findViewById(R.id.map_btn);
        weather_Btn=findViewById(R.id.weather_btn);
        chatbot_Btn=findViewById(R.id.chatbot_btn);

        ferti_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Home_Activity.this,crop_practice.class);
                startActivity(f);
            }
        });

        map_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent m=new Intent(Home_Activity.this,News_info.class);
               startActivity(m);
            }
        });

        weather_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w=new Intent(Home_Activity.this,Weather_info.class);
               startActivity(w);
            }
        });

        chatbot_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(Home_Activity.this,Drone_service.class);
                startActivity(c);
            }
        });





    }
}
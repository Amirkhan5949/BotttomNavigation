package com.example.mybottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frameLayout=findViewById(R.id.frame);
        bottomNavigationView=findViewById(R.id.bottom);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        replace(new HomeFragment ());
                         return true;
                    case R.id.cloud:
                        replace(new iconFragment ());
                        return true;

                    case R.id.chat:
                        replace(new ChatFragment());
                        return true;

                 }
                return false;
            }
        });
      }
      void replace(Fragment fragment){
          FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
          ft.replace(R.id.frame,fragment);
          ft.commit();
      }
}

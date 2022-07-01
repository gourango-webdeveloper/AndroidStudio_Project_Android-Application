package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private BottomNavigationView bottomNavigationView;
    public NavController navController;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.fragment_layout);


        drawerLayout = findViewById(R.id.dwrawer_layout);
        navigationView = findViewById(R.id.navigation_View);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_profile:
                Toast.makeText(this,"View Profile",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_Course:
                Toast.makeText(this,"Course Details",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_attendence_Report:
                Toast.makeText(this,"Attendance report",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_marksheet:
                Toast.makeText(this,"Marksheet",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_about: Toast.makeText(this,"About College",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_placement_Update:
                Toast.makeText(this,"Placement Update",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_setting:
                Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_privacy_Policy:
                Toast.makeText(this,"Privacy Policy",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_Rating:
                Toast.makeText(this,"Rating Us",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }



}
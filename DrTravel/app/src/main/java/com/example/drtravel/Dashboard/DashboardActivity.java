package com.example.drtravel.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.drtravel.Dashboard.BerandaActivity.HomeFragment;
import com.example.drtravel.Dashboard.LainnyaActivity.LainnyaFragment;
import com.example.drtravel.Dashboard.PenandaActivity.PenandaFragment;
import com.example.drtravel.Dashboard.WisataActivity.WisataFragment;
import com.example.drtravel.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    static DashboardActivity activity_home;

    public static DashboardActivity getInstance() {
        return activity_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        activity_home=this;

        //set default Home Fragment
        loadFragment(new ListFragment());

        //inisialisasi BottomnavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        //beri listener pada saat intem/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    //load fragment ke frame layout
    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        }
        return false;
    }

    //method listener untuk logika pemilihan
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;
        //switch case fragment{}
        switch (item.getItemId()){
            case R.id.beranda_menu:
                fragment = new HomeFragment();
                break;
            case R.id.wisata_menu:
                fragment = new WisataFragment();
                break;
            case R.id.penanda_menu:
                fragment = new PenandaFragment();
                break;
            case R.id.lainnya_menu:
                fragment = new LainnyaFragment();
                break;
        }
        return loadFragment(fragment);
    }
}

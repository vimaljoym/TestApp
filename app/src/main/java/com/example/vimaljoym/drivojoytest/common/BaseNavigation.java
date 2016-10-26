package com.example.vimaljoym.drivojoytest.common;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.vimaljoym.drivojoytest.MapActivity;
import com.example.vimaljoym.drivojoytest.R;
import com.example.vimaljoym.drivojoytest.VehiclesActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by vimaljoym on 25/10/16.
 */

public class BaseNavigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;


    protected void initializeNavigationMenu() {

        ButterKnife.bind(this);


        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_vehicles && !this.getClass().getSimpleName().equals("VehiclesActivity")) {

            finish();
            Intent intent = new Intent(this, VehiclesActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_map && !this.getClass().getSimpleName().equals("MapActivity")) {
            finish();
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}

package com.jamesbon.cmpiler;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set the initial fragment
        loadFragment(new home());

        // Set up the navigation item selection listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                // Use if-else statements for clarity
                if (item.getItemId() == R.id.nav_home) {
                    selectedFragment = new home();
                } else if (item.getItemId() == R.id.announcement) {
                    selectedFragment = new announcement();
                } else if (item.getItemId() == R.id.account) {
                    selectedFragment = new account();
                } else if (item.getItemId() == R.id.settings) {
                    selectedFragment = new settings();
                }

                return loadFragment(selectedFragment);
            }
        });
    }

    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }
}

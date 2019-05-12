package com.example.tacomiendo.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.example.tacomiendo.Fragments.AccountFragment;
import com.example.tacomiendo.Fragments.CategoryFragment;
import com.example.tacomiendo.Fragments.HomeFragment;
import com.example.tacomiendo.Fragments.SettingsFragment;
import com.example.tacomiendo.R;

public class MainActivity extends AppCompatActivity {

    //objects for a drawer
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the toolbar
        setToolbar();

        //setting the ui
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navview);
        //setup a fragment by default
        setFragmentByDefault();

        //event fot item selected at navigation drawer
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                boolean fragmentTransaction = false;
                Fragment fragment = null;

                switch(item.getItemId()){
                    case R.id.menu_start:
                        fragment = new HomeFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.menu_account:
                        fragment = new AccountFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.menu_category:
                        fragment = new CategoryFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.menu_settings:
                        fragment = new SettingsFragment();
                        fragmentTransaction = true;
                        break;
                }

                if(fragmentTransaction){
                    changeFragment(fragment, item);
                    drawerLayout.closeDrawers();
                }
                return true;
            }
        });
    }

    //setting up the toolbar
    public void setToolbar(){
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //method that set homeFragmentByDefault
    public void setFragmentByDefault(){
        changeFragment(new HomeFragment(), navigationView.getMenu().getItem(0));
    }

    //method that allow us to chanche a fragment
    public void changeFragment(Fragment fragment, MenuItem item){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                //open the navigationDrawer
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}

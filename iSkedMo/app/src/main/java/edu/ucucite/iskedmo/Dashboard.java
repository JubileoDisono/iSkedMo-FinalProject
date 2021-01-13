package edu.ucucite.iskedmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {
DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        drawerLayout = findViewById(R.id.drawer_layout);


    }
    public void ClickMenu(View view)
    {
        HomeActivity.openDrawer(drawerLayout);

    }
    public void ClickLogo(View view)
    {
        HomeActivity.closeDrawer(drawerLayout);

    }

    public void ClickHome(View view)
    {
        HomeActivity.redirectActivity(this,HomeActivity.class);


    }

    public void ClickDashboard(View view)
    {
     recreate();



    }
    public void ClickAboutUs(View view)
    {
        HomeActivity.redirectActivity(this,AboutUs.class);


    }
    public void ClickLogout(View view)
    {
     HomeActivity.logout(this);


    }
    @Override
    protected void onPause() {

        super.onPause();
        HomeActivity.closeDrawer(drawerLayout);
    }
}
package com.example.sidemenu;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openButton = (Button) findViewById(R.id.open_button);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 左でオープン
                DrawerLayout mDrawer;
                mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                mDrawer.openDrawer(Gravity.LEFT);
            }
        });

        // メニューバークローズ処理
        Button closeButton = (Button) findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // クローズ
                DrawerLayout mDrawer;
                mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                mDrawer.closeDrawers();
            }
        });
    }
}

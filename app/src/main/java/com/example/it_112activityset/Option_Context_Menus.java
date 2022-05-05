package com.example.it_112activityset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Option_Context_Menus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set Title
        setContentView(R.layout.activity_option_context_menus);

        Button main_button = findViewById(R.id.explore_btn);
        registerForContextMenu(main_button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menu_if = getMenuInflater();
        getMenuInflater().inflate(R.menu.wonders_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.full_menu, menu);
    }
}
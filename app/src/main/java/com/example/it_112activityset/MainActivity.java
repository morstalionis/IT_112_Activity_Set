package com.example.it_112activityset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button image_view_btn;
    private Button image_switch_btn;
    private Button grid_view_btn;
    private Button oc_m_btn;
    private Button web_view_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide Title Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        image_view_btn = findViewById(R.id.image_view_btn);
        image_view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class x = Image_View.class;
                openimage_view(x);
            }
        });

        image_switch_btn = findViewById(R.id.image_switch_btn);
        image_switch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class x = Image_Switcher.class;
                openimage_view(x);
            }
        });

        grid_view_btn = findViewById(R.id.grid_view_btn);
        grid_view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class x = GridViewAct.class;
                openimage_view(x);
            }
        });

        oc_m_btn = findViewById(R.id.oc_m_btn);
        oc_m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class x = Option_Context_Menus.class;
                openimage_view(x);
            }
        });

        web_view_btn = findViewById(R.id.web_view_btn);
        web_view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class x = Webview.class;
                openimage_view(x);
            }
        });
    }

    public void openimage_view(Class x){
        Intent activity_intent = new Intent(this, x);
        startActivity(activity_intent);
    };

}
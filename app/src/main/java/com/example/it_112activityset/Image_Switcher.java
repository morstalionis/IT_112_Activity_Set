package com.example.it_112activityset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Image_Switcher extends AppCompatActivity {

    ImageSwitcher switcher;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide Title Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_image_switcher);


        switcher=findViewById(R.id.switcher);
        prev= findViewById(R.id.prev_btn);
        next= findViewById(R.id.next_btn);

        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView current_pic = new ImageView(getApplicationContext());
                return current_pic;
            }
        });

        int [] image = new int[]{R.drawable.blue_mosque_f, R.drawable.pantheon_f, R.drawable.duomo_f};
        final int[] x = {0};
        switcher.setImageResource(image[x[0]]);

            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switcher.setImageResource(image[x[0]]);
                    x[0] = 0;
                }

            });

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switcher.setImageResource(image[x[0]+1]);
                    x[0] = 1;
                }
            });




    }

    public void indexer_add(int x, int y){
        x++;
        y++;
    }

    public void indexer_sub(int x, int y){
        x--;
        y--;
    }

}
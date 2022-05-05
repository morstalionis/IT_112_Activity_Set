package com.example.it_112activityset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class GridViewAct extends AppCompatActivity {

    com.example.it_112activityset.databinding.ActivityGridViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = com.example.it_112activityset.databinding.ActivityGridViewBinding.inflate(getLayoutInflater());

        //Hide Title Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(binding.getRoot());

        String[] wonder_name = {"Alhambra", "Angkor Wat", "Big Ben", "Bolshoi Theatre", "Borobudur Temple", "Brandenburg Gate", "Broadway", "Casa de Contratación", "Eiffel Tower", "The Forbidden City", "The Great Wall", "Hermitage", "Kotoku In", "The Louvre", "Macchu Pichu", "Mahabodhi Temple", "Notre Dame", "Országház", "Parthenon", "Petra", "Poatala Palace", "The Pyramids", "St. Basil's Cathedral", "Statue of Liberty", "Stonehenge", "Sydney Opera House", "Taj Mahal"};

        int[] wonder_images = {R.drawable.a, R.drawable.b,R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.j, R.drawable.k, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x, R.drawable.y, R.drawable.z, R.drawable.z1, R.drawable.z2, R.drawable.z3};

        grid_adapter adapterfinal = new grid_adapter(GridViewAct.this, wonder_name, wonder_images);
        binding.gridMain.setAdapter(adapterfinal);



    }
}
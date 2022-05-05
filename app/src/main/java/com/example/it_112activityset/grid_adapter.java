package com.example.it_112activityset;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class grid_adapter extends BaseAdapter {

    Context context;
    String[] wonder_name;
    int[] images;

    LayoutInflater inflater;

    public grid_adapter(Context context, String[] wonder_name, int[] images) {
        this.context = context;
        this.wonder_name = wonder_name;
        this.images = images;
    }

    @Override
    public int getCount() {
        return wonder_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null){

            view = inflater.inflate(R.layout.grid_item, null);

        }

        ImageView imagefin = view.findViewById(R.id.grid_image);
        TextView name = view.findViewById(R.id.grid_text);

        imagefin.setImageResource(images[i]);
        name.setText(wonder_name[i]);

        return view;
    }
}

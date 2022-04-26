package com.hanna.myfirstapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


import com.hanna.myfirstapplication.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return thumbImages.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);

        return imageView;
    }

    // Add all our images to arraylist
    public Integer[] thumbImages = {
            R.drawable.contact, R.drawable.gear,
            R.drawable.gmail, R.drawable.facebook,
            R.drawable.book, R.drawable.comments, R.drawable.instagram,
            R.drawable.whatsapp, R.drawable.telephone, R.drawable.youtube,
            R.drawable.contact, R.drawable.gear,
            R.drawable.gmail, R.drawable.facebook,
            R.drawable.book, R.drawable.comments, R.drawable.instagram,
            R.drawable.whatsapp, R.drawable.telephone, R.drawable.youtube
    };
}

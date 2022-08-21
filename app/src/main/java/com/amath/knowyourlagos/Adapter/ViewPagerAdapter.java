package com.amath.knowyourlagos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.amath.knowyourlagos.R;

import java.util.Objects;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int[] images;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
         layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.viewpager_item,container,false);

        ImageView imageView = itemView.findViewById(R.id.itemImg);

        imageView.setImageResource(images[position]);

        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}

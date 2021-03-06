package com.example.lenovo.jd_ljq_what.ui.classify.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.List;

public class MyAdapter extends PagerAdapter {
    private List<String> list;
    private Context context;

    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        PhotoView photoView = new PhotoView(container.getContext());
        container.addView(photoView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        Glide.with(context).load(list.get(position)).into(photoView);
        return photoView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
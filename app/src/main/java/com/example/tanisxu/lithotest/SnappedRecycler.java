package com.example.tanisxu.lithotest;

import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.widget.Recycler;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/27/17.
 */

public class SnappedRecycler {

    public static Recycler.Builder create(ComponentContext c) {
        return Recycler.create(c)
                .onScrollListener(mScrollListener);
    }



    private static final RecyclerView.OnScrollListener mScrollListener =
            new RecyclerView.OnScrollListener() {
                boolean mAlreadySetSnap = false;


                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                    super.onScrollStateChanged(recyclerView, newState);
                    if (!mAlreadySetSnap) {
                        mAlreadySetSnap = true;
                        PagerSnapHelper snapHelper = new PagerSnapHelper();
                        snapHelper.attachToRecyclerView(recyclerView);
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                }
            };

}

package com.example.tanisxu.lithotest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;

import com.example.tanisxu.lithotest.components.TrainCard;
import com.example.tanisxu.lithotest.components.TrainExpandCardFlow;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;



public class MainActivity extends Activity {

    static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext c = new ComponentContext(this);
//        final RecyclerBinder recyclerBinder = new RecyclerBinder(
//                c,
//                new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));

//        final Component component = SnappedRecycler.create(c)
//                .binder(recyclerBinder)
//                .build();

//        addContent(recyclerBinder, c);
        setContentView(LithoView.create(this, TrainExpandCardFlow.create(c).build()));
//        setContentView(LithoView.create(this, component));
    }

    private static void addContent(RecyclerBinder recyclerBinder, ComponentContext context) {
        for (int i = 0; i < 32; i++) {
            recyclerBinder.insertItemAt(
                    i,
                    ComponentInfo.create()
                            .component(TrainCard.create(context)
                                            .build())
                            .build());
        }
    }

//
//    public void waitFor(int millis) {
//        final long startTime = System.currentTimeMillis();
//        final long endTime = startTime + millis;
//        while (System.currentTimeMillis() < endTime);
//    }

//    private final RecyclerView.OnScrollListener mScrollListener =
//            new RecyclerView.OnScrollListener() {
//                boolean mScrolled = false;
//                int y = 0;
//                int pos = 0;
//
//                @Override
//                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                    super.onScrollStateChanged(recyclerView, newState);
//
//                    if (newState == RecyclerView.SCROLL_STATE_IDLE && mScrolled) {
//                        mScrolled = false;
////                        snapToTargetExistingView();
//                        recyclerView.scrollBy(0, pos * 400-y);
//                        y = pos*400;
//                    }
//                }
//
//                @Override
//                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                    if (dx != 0 || dy != 0) {
//                        Log.d("daddasd", "" + y);
//                        mScrolled = true;
//                        y += dy;
//                        pos = y / 400;
//                    }
//                }
//            };

//    @Nullable
//    protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager, RecyclerView mRecyclerView) {
//        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
//            return null;
//        }
//        return new LinearSmoothScroller(mRecyclerView.getContext()) {
//            @Override
//            protected void onTargetFound(View targetView, RecyclerView.State state, Action action) {
//                int[] snapDistances = calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(),
//                        targetView);
//                final int dx = snapDistances[0];
//                final int dy = snapDistances[1];
//                final int time = calculateTimeForDeceleration(Math.max(Math.abs(dx), Math.abs(dy)));
//                if (time > 0) {
//                    action.update(dx, dy, time, mDecelerateInterpolator);
//                }
//            }
//
//            @Override
//            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
//                return 100f / displayMetrics.densityDpi;
//            }
//        };
//    }
//
//    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager,
//                                              @NonNull View targetView) {
//        int[] out = new int[2];
//
//        if (layoutManager.canScrollHorizontally()) {
//            if (gravity == Gravity.START) {
//                out[0] = distanceToStart(targetView, getHorizontalHelper(layoutManager), false);
//            } else { // END
//                out[0] = distanceToEnd(targetView, getHorizontalHelper(layoutManager), false);
//            }
//        } else {
//            out[0] = 0;
//        }
//
//        if (layoutManager.canScrollVertically()) {
//            if (gravity == Gravity.TOP) {
//                out[1] = distanceToStart(targetView, getVerticalHelper(layoutManager), false);
//            } else { // BOTTOM
//                out[1] = distanceToEnd(targetView, getVerticalHelper(layoutManager), false);
//            }
//        } else {
//            out[1] = 0;
//        }
//
//        return out;
//    }
//
//    private int distanceToStart(View targetView, OrientationHelper helper, boolean fromEnd) {
//        if (isRtlHorizontal && !fromEnd) {
//            return distanceToEnd(targetView, helper, true);
//        }
//
//        return helper.getDecoratedStart(targetView) - helper.getStartAfterPadding();
//    }
//
//    private int distanceToEnd(View targetView, OrientationHelper helper, boolean fromStart) {
//        if (isRtlHorizontal && !fromStart) {
//            return distanceToStart(targetView, helper, true);
//        }
//
//        return helper.getDecoratedEnd(targetView) - helper.getEndAfterPadding();
//    }
}

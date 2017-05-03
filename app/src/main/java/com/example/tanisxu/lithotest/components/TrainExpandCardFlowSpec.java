package com.example.tanisxu.lithotest.components;

import android.support.v7.widget.OrientationHelper;
import android.util.Log;

import com.example.tanisxu.lithotest.SnappedRecycler;
import com.facebook.litho.ClickEvent;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.StateValue;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateInitialState;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.OnEvent;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.State;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 5/2/17.
 */

@LayoutSpec(events = { ClickEvent.class })
public class TrainExpandCardFlowSpec {

    final static String TAG = "TrainExpandCardFlow";

    private static int height = 400;

    @OnCreateInitialState
    static void createInitialState(
            ComponentContext c,
            StateValue<Boolean> isExpanded) {
        isExpanded.set(false);
    }

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @State boolean isExpanded) {

        final RecyclerBinder recyclerBinder = new RecyclerBinder(
                c,
                new LinearLayoutInfo(c.getBaseContext(), OrientationHelper.VERTICAL, false));

        addContent(recyclerBinder, c);

        final ComponentLayout component = SnappedRecycler.create(c)
                .binder(recyclerBinder)
                .buildWithLayout();

        final ComponentLayout expandedCard = TrainExpandedCard.create(c).height(height).buildWithLayout();

        Log.d(TAG, "expand card " + isExpanded);
        if (isExpanded) {
            return expandedCard;
        } else {
            return component;
        }
    }

    @OnEvent(ClickEvent.class)
    static void onClick1(
            ComponentContext c,
            @State boolean isExpanded) {
        isExpanded = !isExpanded;
        Log.d(TAG, "expand  " + isExpanded);
    }

    private static void addContent(RecyclerBinder recyclerBinder, ComponentContext context) {
        for (int i = 0; i < 3; i++) {
            recyclerBinder.insertItemAt(
                    i,
                    ComponentInfo.create()
                            .component(TrainCard.create(context)
                                            .clickEventHandler(
                                                    TrainExpandCardFlow.onClick1(context))
                                            .build())
                            .build());
        }
    }
}

package com.example.tanisxu.lithotest.components;

import android.support.v7.widget.OrientationHelper;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 5/2/17.
 */

@LayoutSpec
public class TrainExpandedCardSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop int height) {

        final RecyclerBinder recyclerBinder = new RecyclerBinder(
                c,
                new LinearLayoutInfo(c.getBaseContext(), OrientationHelper.VERTICAL, false));

        addContent(recyclerBinder, c, height);

        final ComponentLayout component = Recycler.create(c)
                .binder(recyclerBinder)
                .buildWithLayout();

        return component;
    }

    private static void addContent(RecyclerBinder recyclerBinder, ComponentContext context, int height) {
        for (int i = 0; i < 2; i++) {
            recyclerBinder.insertItemAt(
                    i,
                    ComponentInfo.create()
                            .component(TrainCard.create(context)
                                    .height(height)
                                    .build())
                            .build());
        }
    }
}

package com.example.tanisxu.lithotest.components;

import com.example.tanisxu.lithotest.R;
import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;

import static com.facebook.yoga.YogaEdge.HORIZONTAL;
import static com.facebook.yoga.YogaEdge.VERTICAL;
import static com.facebook.yoga.YogaJustify.SPACE_BETWEEN;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/27/17.
 */

@LayoutSpec
public class TrainCardSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c) {

        return Column.create(c)
                .heightPx(400)
                .paddingDip(VERTICAL, 8)
                .paddingDip(HORIZONTAL, 40)
                .justifyContent(SPACE_BETWEEN)
                .child(
                        SpaceBetweenText.create(c)
                                .marginTop(20)
                                .textLeft("27 May")
                                .sizeLeft(10)
                                .textRight("G101")
                                .sizeRight(14)
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        StationTime.create(c)
                                .time("06:22")
                                .station("station one")
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        StationTime.create(c)
                                .time("16:22")
                                .station("station two")
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        SpaceBetweenText.create(c)
                                .marginBottom(20)
                                .textLeft("5 hours")
                                .sizeLeft(10)
                                .textRight("$500")
                                .sizeRight(14)
                                .withLayout()
                                .flexGrow(1)
                )
                .build();
    }
}

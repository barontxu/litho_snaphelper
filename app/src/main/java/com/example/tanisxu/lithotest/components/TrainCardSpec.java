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
                                .textLeft("04月27日 星期四")
                                .sizeLeft(10)
                                .textRight("G101")
                                .sizeRight(14)
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        StationTime.create(c)
                                .time("06:22")
                                .station("北京南站")
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        StationTime.create(c)
                                .time("16:22")
                                .station("北京北站")
                                .withLayout()
                                .flexGrow(1)
                )
                .child(
                        SpaceBetweenText.create(c)
                                .marginBottom(20)
                                .textLeft("约5小时")
                                .sizeLeft(10)
                                .textRight("获取失败")
                                .sizeRight(14)
                                .withLayout()
                                .flexGrow(1)
                )
                .build();
    }
}

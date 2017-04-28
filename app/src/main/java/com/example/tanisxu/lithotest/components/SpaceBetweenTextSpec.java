package com.example.tanisxu.lithotest.components;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.PropDefault;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.BOTTOM;
import static com.facebook.yoga.YogaEdge.TOP;
import static com.facebook.yoga.YogaEdge.VERTICAL;
import static com.facebook.yoga.YogaJustify.SPACE_BETWEEN;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/27/17.
 */

@LayoutSpec
public class SpaceBetweenTextSpec {
    @PropDefault static final int marginTop = 0;
    @PropDefault static final int marginBottom = 0;

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String textLeft,
            @Prop int sizeLeft,
            @Prop String textRight,
            @Prop int sizeRight,
            @Prop(optional = true) int marginTop,
            @Prop(optional = true) int marginBottom) {

        return Row.create(c)
                .justifyContent(SPACE_BETWEEN)
                .paddingDip(VERTICAL, 8)
                .marginPx(TOP, marginTop)
                .marginPx(BOTTOM, marginBottom)
                .child(
                        Text.create(c)
                                .text(textLeft)
                                .textSizeDip(sizeLeft))
                .child(
                        Text.create(c)
                                .text(textRight)
                                .textSizeDip(sizeRight)
                )
                .build();
    }

}

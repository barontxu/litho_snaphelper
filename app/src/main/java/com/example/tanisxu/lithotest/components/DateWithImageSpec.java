package com.example.tanisxu.lithotest.components;

import android.graphics.Color;
import android.text.TextUtils;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

import static com.facebook.yoga.YogaJustify.FLEX_START;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/27/17.
 */

@LayoutSpec
public class DateWithImageSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String text,
            @Prop int textSize,
            @Prop(optional = true) int image,
            @Prop int marginTop,
            @Prop int marginBottom) {

        return Row.create(c)
                .marginPx(YogaEdge.TOP, marginTop)
                .marginPx(YogaEdge.BOTTOM, marginBottom)
                .justifyContent(FLEX_START)
                .child(TextUtils.isEmpty(text) ? null :
                        Text.create(c)
                                .text(text)
                                .textSizePx(textSize)
                                .textColor(Color.WHITE)
                                .withLayout())
                .child(
                        Image.create(c)
                                .drawableRes(image)
                                .withLayout()
                                .widthDip(24)
                                .heightDip(24))
                .build();
    }
}

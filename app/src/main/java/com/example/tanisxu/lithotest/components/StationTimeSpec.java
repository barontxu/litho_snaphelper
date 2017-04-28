package com.example.tanisxu.lithotest.components;

import com.example.tanisxu.lithotest.R;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.VERTICAL;
import static com.facebook.yoga.YogaJustify.SPACE_BETWEEN;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/27/17.
 */

@LayoutSpec
public class StationTimeSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String time,
            @Prop String station
            ) {

        return Row.create(c)
                .justifyContent(SPACE_BETWEEN)
                .paddingDip(VERTICAL, 8)
                .child(
                    DateWithImage.create(c)
                        .text(time)
                        .textSize(24)
                        .marginTop(0)
                        .marginBottom(0)
                        .image(R.drawable.ic_launcher))
                .child(
                        Text.create(c)
                                .text(station)
                                .textSizePx(28)
                )
                .build();
    }

}

//
//@LayoutSpec
//public class DateWithImageSpec {
//
//    @OnCreateLayout
//    static ComponentLayout onCreateLayout(
//            ComponentContext c,
//            @Prop String title,
//            @Prop(optional = true) int image) {
//
//        return Row.create(c)
//                .justifyContent(SPACE_BETWEEN)
//                .child(TextUtils.isEmpty(title) ? null :
//                        Text.create(c)
//                                .text(title)
//                                .textSizeSp(24)
//                                .textColor(Color.BLUE)
//                                .withLayout()
//                                .flexGrow(1f))
//                .child(
//                        Image.create(c)
//                                .drawableRes(image)
//                                .withLayout()
//                                .widthDip(24)
//                                .heightDip(24)
//                )
//                .build();
//    }
//}

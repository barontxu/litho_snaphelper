//package com.example.tanisxu.lithotest;
//
//import android.graphics.Color;
//
//import com.example.tanisxu.lithotest.components.DateWithImage;
//import com.facebook.litho.Column;
//import com.facebook.litho.ComponentContext;
//import com.facebook.litho.ComponentLayout;
//import com.facebook.litho.annotations.LayoutSpec;
//import com.facebook.litho.annotations.OnCreateLayout;
//import com.facebook.litho.annotations.Prop;
//import com.facebook.litho.widget.Text;
//import com.facebook.yoga.YogaAlign;
//
//import static com.facebook.yoga.YogaEdge.ALL;
//
///**
// * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/25/17.
// */
//
//@LayoutSpec
//public class ListItemSpec {
//
//    @OnCreateLayout
//    static ComponentLayout onCreateLayout(ComponentContext c, @Prop int size1, @Prop int size2) {
//
//        return Column.create(c)
//                .alignItems(YogaAlign.CENTER)
//                .paddingDip(ALL, 16)
//                .backgroundColor(Color.WHITE)
//                .child(
//                        Text.create(c)
//                                .text("Hello world")
//                                .textSizeSp(size1)
//                )
//                .child(
//                        Text.create(c)
//                                .text("Litho tutorial")
//                                .textSizeSp(size2)
//                )
//                .child(
//                        DateWithImage.create(c)
//                                .text("06:44")
//                                .textSize(24)
//                                .marginTop(0)
//                                .marginBottom(0)
//                                .image(R.drawable.ic_launcher)
//                )
//                .build();
//    }
//
//
//}
package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by bruno on 6/14/16.
 */
public class OneOneImageView extends ImageView {

    public OneOneImageView(Context context) {
        super(context);
    }

    public OneOneImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OneOneImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int oneToOneHeight = MeasureSpec.getSize(widthMeasureSpec);
        int oneToOneHeightSpec = MeasureSpec.makeMeasureSpec(oneToOneHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, oneToOneHeightSpec);
    }
}

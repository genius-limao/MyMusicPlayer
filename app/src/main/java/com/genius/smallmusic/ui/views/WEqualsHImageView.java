package com.genius.smallmusic.ui.views;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class WEqualsHImageView extends AppCompatImageView {
    public WEqualsHImageView(@NonNull Context context) {
        super(context);
    }

    public WEqualsHImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //使高度的计算方式和宽度计算方式一样，实现高度等于宽度
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}

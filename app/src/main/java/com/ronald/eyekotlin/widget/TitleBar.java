package com.ronald.eyekotlin.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.penod.mylibrary.utils.DensityUtils;
import com.penod.mylibrary.utils.LogUtil;
import com.penod.mylibrary.utils.ScreenUtils;
import com.ronald.eyekotlin.R;

/**
 * @author Penoder
 * @date 18-3-21.
 */
public class TitleBar extends FrameLayout {

    /**
     * 标题栏背景颜色
     */
    @ColorInt
    private int backgroundColor = R.color.mainColor;

    /**
     * 标题字体颜色
     */
    @ColorInt
    private int titleColor = Color.WHITE;

    /**
     * 标题字体大小
     */
    private float titleSize;

    /**
     * 返回按钮图标
     */
    @IdRes
    private int imgIcon = R.drawable.icon_back_white;

    /**
     * 标题栏高度
     */
    private int titleHeight;

    public TitleBar(Context context) {
        this(context, null);
    }

    public TitleBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        titleSize = DensityUtils.dp2px(context, 16);
        titleHeight = DensityUtils.dp2px(context, 48);
        initParams(context, attrs);
        initView(context);
    }

    @SuppressLint("ResourceType")
    private void initView(Context context) {
        int width = ScreenUtils.getScreenWidth(context);

        TextView textView = new TextView(context);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(width, titleHeight);
        textView.setLayoutParams(params);
        textView.setTextSize(titleSize);
        textView.setTextColor(titleColor);
        textView.setGravity(Gravity.CENTER);
        addView(textView);  // 增加 TextView+
        LogUtil.i(textView.getLayoutParams().width + "  --+--  " + textView.getLayoutParams().height);

        ImageView backImg = new ImageView(context);
        ViewGroup.LayoutParams imgParams = new ViewGroup.LayoutParams(titleHeight, titleHeight);
        backImg.setLayoutParams(imgParams);
        backImg.setImageResource(imgIcon);
        backImg.setPadding(12, 12, 12, 12);
        backImg.setOnClickListener(v -> {
            if (onBackImgListenner != null) {
                onBackImgListenner.onClick(v);
            }
        });
        addView(backImg);
        LogUtil.i(backImg.getLayoutParams().width + "  --*--  " + backImg.getLayoutParams().height);

        setLayoutParams(new LayoutParams(width, titleHeight));
        setBackgroundColor(R.color.mainColor);

        LogUtil.i(getLayoutParams().width + "  -----  " + getLayoutParams().height);
    }

    /**
     * 初始化定义的参数
     */
    private void initParams(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleBar);
            for (int i = 0; i < typedArray.getIndexCount(); i++) {
                switch (typedArray.getIndex(i)) {
                    case R.styleable.TitleBar_backgroundColor:
                        backgroundColor = typedArray.getColor(R.styleable.TitleBar_backgroundColor, getResources().getColor(R.color.mainColor));
                        break;
                    case R.styleable.TitleBar_titleColor:
                        titleColor = typedArray.getColor(R.styleable.TitleBar_titleColor, Color.WHITE);
                        break;
                    case R.styleable.TitleBar_titleSize:
                        titleSize = typedArray.getDimension(R.styleable.TitleBar_titleSize, DensityUtils.dp2px(context, 16));
                        break;
                    case R.styleable.TitleBar_imgIcon:
                        imgIcon = typedArray.getResourceId(R.styleable.TitleBar_imgIcon, R.drawable.icon_back_white);
                        break;
                    default:
                        break;
                }
            }

            typedArray.recycle();
        }
    }

    public OnBackImgListenner onBackImgListenner;

    public void setOnBackClickListener(OnBackImgListenner onBackImgListenner) {
        this.onBackImgListenner = onBackImgListenner;
    }

    public interface OnBackImgListenner {
        void onClick(View view);
    }
}

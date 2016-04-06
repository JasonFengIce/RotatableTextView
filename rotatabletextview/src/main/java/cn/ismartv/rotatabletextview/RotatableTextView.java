package cn.ismartv.rotatabletextview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by huaijie on 2016/3/6.
 */
public class RotatableTextView extends TextView {
    public RotatableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.rotate(45, getWidth() / 2, getHeight() / 2);
//        canvas.translate(0, -getHeight() / 4);
        super.onDraw(canvas);
    }
}

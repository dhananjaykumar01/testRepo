package crossingdeal.com.crossingdeal.Activity.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class CustomTextRegular extends TextView {
    public CustomTextRegular(Context context) {
        super(context);
        setFont();
    }

    public CustomTextRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public CustomTextRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/cabin_r.otf");
        setTypeface(font, Typeface.NORMAL);
    }
}
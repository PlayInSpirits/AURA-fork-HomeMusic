/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import defpackage.mh;
import defpackage.st3;

public class DialogTitle
extends mh {
    public DialogTitle(Context context) {
        super(context, null);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int n16) {
        super(context, attributeSet, n16);
    }

    @Override
    public final void onMeasure(int n16, int n17) {
        int n18;
        super.onMeasure(n16, n17);
        Object object = this.getLayout();
        if (object != null && (n18 = ((Layout)object).getLineCount()) > 0 && ((Layout)object).getEllipsisCount(n18 - 1) > 0) {
            this.setSingleLine(false);
            this.setMaxLines(2);
            object = this.getContext().obtainStyledAttributes(null, st3.y, 0x1010041, 16973892);
            n18 = ((TypedArray)object).getDimensionPixelSize(0, 0);
            if (n18 != 0) {
                this.setTextSize(0, n18);
            }
            ((TypedArray)object).recycle();
            super.onMeasure(n16, n17);
        }
    }
}


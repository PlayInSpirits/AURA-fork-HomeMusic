package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import defpackage.g12;
import defpackage.j65;
import defpackage.yd;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView n;
    public Button o;
    public final TimeInterpolator p;
    public int q;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = g12.O(context, R.attr.motionEasingEmphasizedInterpolator, yd.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.n.getPaddingTop() == i2 && this.n.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.n;
        WeakHashMap weakHashMap = j65.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.o;
    }

    public TextView getMessageView() {
        return this.n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.n = (TextView) findViewById(R.id.snackbar_text);
        this.o = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.n.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.q <= 0 || this.o.getMeasuredWidth() <= this.q) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.q = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}

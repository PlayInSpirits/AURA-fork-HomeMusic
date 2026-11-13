package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class jq {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public jq(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        uc5.c(context, attributeSet, i, i2);
        int[] iArr = ht3.d;
        uc5.g(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = h12.u(context, obtainStyledAttributes, 8, dimensionPixelSize);
        this.b = Math.min(h12.u(context, obtainStyledAttributes, 7, 0), this.a / 2);
        this.e = obtainStyledAttributes.getInt(4, 0);
        this.f = obtainStyledAttributes.getInt(1, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.c = new int[]{g12.s(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                kf2.n("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = obtainStyledAttributes.getColor(6, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = g12.l(this.d, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void a();
}

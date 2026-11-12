package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(Context r4, AttributeSet r5) {
        TypedArray r6 = r4.obtainStyledAttributes(r5, kt3.g);
        int r7 = r6.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L16;
        int r1 = r6.getIndex(r0);
        if (r1 != 1) goto L7;
        this.c = r6.getFloat(r1, this.c);
    L15:
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 0) goto L10;
        int r2 = r6.getInt(r1, this.a);
        this.a = r2;
        this.a = wb0.d[r2];
        goto L15
    L10:
        if (r1 != 4) goto L13;
        this.b = r6.getInt(r1, this.b);
        goto L15
    L13:
        if (r1 != 3) goto L15;
        this.d = r6.getFloat(r1, this.d);
        goto L15
    L16:
        r6.recycle();
    }
}

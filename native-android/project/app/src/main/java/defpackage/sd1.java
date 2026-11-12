package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 extends r23 {
    public String x;

    @Override // defpackage.r23
    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L8;
    L15:
        return false;
    L8:
        if ((r4 instanceof sd1) == false) goto L15;
        if (super.equals(r4) == false) goto L15;
        if (h12.c(this.x, ((sd1) r4).x) == false) goto L15;
        return true;
    }

    @Override // defpackage.r23
    public final void f(Context r2, AttributeSet r3) {
        super.f(r2, r3);
        TypedArray r4 = r2.getResources().obtainAttributes(r3, at3.b);
        r4.getClass();
        String r5 = r4.getString(0);
        if (r5 == null) goto L5;
        this.x = r5;
    L5:
        r4.recycle();
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int r0 = super.hashCode() * 31;
        String r1 = this.x;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return r0 + r2;
    L5:
        r2 = 0;
        goto L7
    }

    @Override // defpackage.r23
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append(" class=");
        String r2 = this.x;
        if (r2 != null) goto L5;
        r0.append("null");
    L7:
        return r0.toString();
    L5:
        r0.append(r2);
        goto L7
    }
}

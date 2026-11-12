package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 {
    public final String a;
    public final tb1 b;
    public final tb1 c;
    public final int d;
    public final int e;

    public ej0(String r3, tb1 r4, tb1 r5, int r6, int r7) {
        if (r6 == 0) goto L7;
        if (r7 == 0) goto L7;
        boolean r1 = false;
    L8:
        rr2.l(r1);
        rr2.l(true ^ TextUtils.isEmpty(r3));
        this.a = r3;
        r4.getClass();
        this.b = r4;
        r5.getClass();
        this.c = r5;
        this.d = r6;
        this.e = r7;
        return;
    L7:
        r1 = true;
        goto L8
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L21:
        return false;
    L8:
        if (ej0.class != r5.getClass()) goto L21;
        ej0 r6 = (ej0) r5;
        if (this.d != r6.d) goto L21;
        if (this.e != r6.e) goto L21;
        if (this.a.equals(r6.a) == false) goto L21;
        if (this.b.equals(r6.b) == false) goto L21;
        if (this.c.equals(r6.c) == false) goto L21;
        return true;
    }

    public final int hashCode() {
        int r0 = (((527 + this.d) * 31) + this.e) * 31;
        int r1 = f34.e(this.a, r0, 31);
        int r2 = (this.b.hashCode() + r1) * 31;
        return this.c.hashCode() + r2;
    }
}

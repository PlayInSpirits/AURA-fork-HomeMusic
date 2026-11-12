package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zv2 {
    public final SparseArray a;
    public k05 b;

    public zv2(int r2) {
        this.a = new SparseArray(r2);
    }

    public final void a(k05 r4, int r5, int r6) {
        int r0 = r4.a(r5);
        SparseArray r3 = this.a;
        if (r3 != null) goto L5;
        zv2 r1 = null;
    L7:
        if (r1 != null) goto L9;
        r1 = new zv2(1);
        r3.put(r4.a(r5), r1);
    L9:
        if (r6 <= r5) goto L12;
        r1.a(r4, r5 + 1, r6);
        return;
    L12:
        r1.b = r4;
        return;
    L5:
        r1 = (zv2) r3.get(r0);
        goto L7
    }
}

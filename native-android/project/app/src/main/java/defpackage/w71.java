package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 {
    public final SparseBooleanArray a;

    public w71(SparseBooleanArray r1) {
        this.a = r1;
    }

    public final boolean a(int... r6) {
        int r0 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (this.a.get(r6[r2]) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final int b(int r2) {
        SparseBooleanArray r1 = this.a;
        rr2.q(r2, r1.size());
        return r1.keyAt(r2);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof w71) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((w71) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

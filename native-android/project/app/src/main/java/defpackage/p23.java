package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p23 implements Comparable {
    public final r23 n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;

    public p23(r23 r1, Bundle r2, boolean r3, int r4, boolean r5, int r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
    }

    public final int a(p23 r7) {
        r7.getClass();
        boolean r0 = r7.r;
        boolean r1 = r7.p;
        Bundle r2 = r7.o;
        boolean r4 = this.p;
        if (r4 == false) goto L7;
        if (r1 == true) goto L7;
        return 1;
    L7:
        if (r4 == true) goto L10;
        if (r1 == false) goto L10;
        return -1;
    L10:
        int r3 = this.q - r7.q;
        if (r3 <= 0) goto L13;
        return 1;
    L13:
        if (r3 >= 0) goto L15;
        return -1;
    L15:
        Bundle r5 = this.o;
        if (r5 == null) goto L19;
        if (r2 != null) goto L19;
        return 1;
    L19:
        if (r5 != null) goto L22;
        if (r2 == null) goto L22;
        return -1;
    L22:
        if (r5 == null) goto L28;
        int r6 = r5.size();
        r2.getClass();
        int r8 = r6 - r2.size();
        if (r8 <= 0) goto L26;
        return 1;
    L26:
        if (r8 >= 0) goto L28;
        return -1;
    L28:
        boolean r9 = this.r;
        if (r9 == false) goto L32;
        if (r0 == true) goto L32;
        return 1;
    L32:
        if (r9 == true) goto L36;
        if (r0 == false) goto L36;
        return -1;
    L36:
        return this.s - r7.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((p23) r1);
    }
}

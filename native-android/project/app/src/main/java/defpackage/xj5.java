package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xj5 extends ak5 {
    public final long n;

    public xj5(long r1) {
        this.n = r1;
    }

    @Override // defpackage.ak5
    public final int a() {
        if (this.n < 0) goto L5;
        byte r4 = 0;
    L7:
        return ak5.d(r4);
    L5:
        r4 = 32;
        goto L7
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r3) {
        ak5 r4 = (ak5) r3;
        if (a() != r4.a()) goto L5;
        long r0 = Math.abs(this.n);
        long r2 = Math.abs(((xj5) r4).n);
        if (r0 >= r2) goto L10;
        return -1;
    L10:
        if (r0 <= r2) goto L13;
        return 1;
    L13:
        return 0;
    L5:
        return a() - r4.a();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (xj5.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (this.n != ((xj5) r5).n) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.n)});
    }

    public final String toString() {
        return Long.toString(this.n);
    }
}

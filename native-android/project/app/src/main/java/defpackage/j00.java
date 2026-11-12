package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 extends vn4 implements Comparable {
    public long y;

    @Override // java.lang.Comparable
    public final int compareTo(Object r6) {
        j00 r7 = (j00) r6;
        if (d(4) != r7.d(4)) goto L5;
        long r0 = this.t - r7.t;
        if (r0 != 0) goto L14;
        r0 = this.y - r7.y;
        if (r0 != 0) goto L14;
        return 0;
    L14:
        if (r0 <= 0) goto L20;
        return 1;
    L20:
        return -1;
    L5:
        if (d(4) == true) goto L19;
        return -1;
    L19:
        return 1;
    }
}

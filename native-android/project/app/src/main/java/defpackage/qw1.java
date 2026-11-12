package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qw1 {
    public static int b(int r1, int r2) {
        if (r2 < 0) goto L11;
        if (r2 > r1) goto L5;
        return r1;
    L5:
        int r3 = (r1 + (r1 >> 1)) + 1;
        if (r3 >= r2) goto L8;
        r3 = Integer.highestOneBit(r2 - 1) << 1;
    L8:
        if (r3 >= 0) goto L13;
        return Integer.MAX_VALUE;
    L13:
        return r3;
    L11:
        kf2.n("cannot store more than MAX_VALUE elements");
        return 0;
    }

    public abstract qw1 a(Object r1);
}

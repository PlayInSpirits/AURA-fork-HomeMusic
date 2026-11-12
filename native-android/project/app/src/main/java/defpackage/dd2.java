package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd2 {
    public final int a;
    public final long b;

    public dd2(int r3, long r4) {
        if (r4 < 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.a = r3;
        this.b = r4;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static dd2 a(l51 r3, be3 r4) {
        r3.n(r4.a, 0, 8);
        r4.N(0);
        int r5 = r4.m();
        long r0 = r4.r();
        return new dd2(r5, r0, false);
    }

    public /* synthetic */ dd2(int r1, long r2, boolean r4) {
        this.a = r1;
        this.b = r2;
    }
}

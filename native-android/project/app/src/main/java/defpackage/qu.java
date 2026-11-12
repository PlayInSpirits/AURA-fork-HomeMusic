package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qu {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final be3 f;
    public final be3 g;
    public int h;
    public int i;

    public qu(be3 r1, be3 r2, boolean r3) {
        this.g = r1;
        this.f = r2;
        this.e = r3;
        r2.N(12);
        this.a = r2.E();
        r1.N(12);
        this.i = r1.E();
        boolean r4 = true;
        if (r1.m() == 1) goto L6;
        r4 = false;
    L6:
        wr1.i("first_chunk must be 1", r4);
        this.b = -1;
    }

    public final boolean a() {
        int r0 = this.b + 1;
        this.b = r0;
        if (r0 != this.a) goto L6;
        return false;
    L6:
        boolean r1 = this.e;
        be3 r2 = this.f;
        if (r1 == false) goto L9;
        long r3 = r2.G();
    L10:
        this.d = r3;
        if (this.b != this.h) goto L17;
        be3 r4 = this.g;
        this.c = r4.E();
        r4.O(4);
        int r5 = this.i - 1;
        this.i = r5;
        if (r5 <= 0) goto L15;
        int r6 = r4.E() - 1;
    L16:
        this.h = r6;
        goto L17
    L15:
        r6 = -1;
    L17:
        return true;
    L9:
        r3 = r2.C();
        goto L10
    }
}

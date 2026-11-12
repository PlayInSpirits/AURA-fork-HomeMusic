package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i02 extends b02 {
    public final int n;
    public final int o;
    public boolean p;
    public int q;

    public i02(int r3, int r4, int r5) {
        this.n = r5;
        this.o = r4;
        boolean r0 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r0 = true;
    L8:
        this.p = r0;
        if (r0 == true) goto L12;
        r3 = r4;
    L12:
        this.q = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p;
    }

    @Override // defpackage.b02
    public final int nextInt() {
        int r0 = this.q;
        if (r0 == this.o) goto L5;
        this.q = this.n + r0;
        return r0;
    L5:
        if (this.p == false) goto L8;
        this.p = false;
        return r0;
    L8:
        tb4.k();
        return 0;
    }
}

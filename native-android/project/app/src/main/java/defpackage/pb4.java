package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb4 {
    public int a;
    public final int[] b;

    public pb4() {
        this.b = new int[10];
    }

    public final int a() {
        if ((this.a & 128) != 0) goto L5;
        return 65535;
    L5:
        return this.b[7];
    }

    public final void b(int r4, int r5) {
        if (r4 < 0) goto L8;
        int[] r0 = this.b;
        if (r4 >= r0.length) goto L9;
        this.a = (1 << r4) | this.a;
        r0[r4] = r5;
        return;
    L9:
        return;
    }
}

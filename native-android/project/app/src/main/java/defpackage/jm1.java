package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 {
    public final wm1 a;
    public final long b;
    public final int c;
    public final boolean d;

    public jm1(wm1 r1, long r2, int r4) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        if ((r1 instanceof tm1) == true) goto L5;
    L7:
        boolean r3 = false;
    L8:
        this.d = r3;
        return;
    L5:
        if (((tm1) r1).z == false) goto L7;
        r3 = true;
        goto L8
    }
}

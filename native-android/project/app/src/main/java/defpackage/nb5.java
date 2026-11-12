package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb5 {
    public static int a(int r4) {
        int r0 = 0;
        int r2 = 1;
    L4:
        if (r2 > 512) goto L33;
        if ((r4 & r2) == 0) goto L32;
        if (r2 != 1) goto L9;
        int r3 = hb5.a();
    L24:
        r0 = r0 | r3;
        goto L32
    L9:
        if (r2 != 2) goto L11;
        r3 = hb5.l();
        goto L24
    L11:
        if (r2 != 4) goto L13;
        r3 = hb5.n();
        goto L24
    L13:
        if (r2 != 8) goto L15;
        r3 = xq2.b();
        goto L24
    L15:
        if (r2 != 16) goto L17;
        r3 = hb5.p();
        goto L24
    L17:
        if (r2 != 32) goto L19;
        r3 = hb5.r();
        goto L24
    L19:
        if (r2 != 64) goto L21;
        r3 = hb5.t();
        goto L24
    L21:
        if (r2 != 128) goto L32;
        r3 = hb5.v();
    L32:
        r2 = r2 << 1;
        goto L4
    L33:
        return r0;
    }
}

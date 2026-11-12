package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements wv4 {
    public final byte[] a;

    public tq0() {
        this.a = new byte[4096];
    }

    @Override // defpackage.wv4
    public final void a(long r1, int r3, int r4, int r5, vv4 r6) {
    }

    @Override // defpackage.wv4
    public final void b(be3 r1, int r2, int r3) {
        r1.O(r2);
    }

    @Override // defpackage.wv4
    public final int c(wh0 r2, int r3, boolean r4) {
        byte[] r1 = this.a;
        int r5 = r2.read(r1, 0, Math.min(r1.length, r3));
        if (r5 != (-1)) goto L8;
        if (r4 == false) goto L7;
        return -1;
    L7:
        throw new EOFException();
    L8:
        return r5;
    }

    @Override // defpackage.wv4
    public final void g(tb1 r1) {
    }
}

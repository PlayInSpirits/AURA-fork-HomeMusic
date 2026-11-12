package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements wv4 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.wv4
    public final void a(long j, int i, int i2, int i3, vv4 vv4Var) {
    }

    @Override // defpackage.wv4
    public final void b(be3 be3Var, int i, int i2) {
        be3Var.O(i);
    }

    @Override // defpackage.wv4
    public final int c(wh0 wh0Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = wh0Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.wv4
    public final void g(tb1 tb1Var) {
    }
}

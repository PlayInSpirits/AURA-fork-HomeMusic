package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj5 extends rj5 {
    public final int q;
    public final int r;

    public qj5(byte[] r2, int r3, int r4) {
        super(r2);
        rj5.h(r3, r3 + r4, r2.length);
        this.q = r3;
        this.r = r4;
    }

    @Override // defpackage.rj5
    public final byte a(int r4) {
        int r1 = this.r;
        if (((r1 - (r4 + 1)) | r4) < 0) goto L5;
        int r0 = this.q + r4;
        return this.o[r0];
    L5:
        if (r4 >= 0) goto L9;
        throw new ArrayIndexOutOfBoundsException(f34.f(r4, "Index < 0: "));
    L9:
        throw new ArrayIndexOutOfBoundsException(xa3.e(r4, r1, "Index > length: ", ", "));
    }

    @Override // defpackage.rj5
    public final byte b(int r2) {
        return this.o[this.q + r2];
    }

    @Override // defpackage.rj5
    public final int d() {
        return this.q;
    }

    @Override // defpackage.rj5
    public final int e() {
        return this.r;
    }

    @Override // defpackage.rj5
    public final void f(int r3, byte[] r4) {
        int r0 = this.q;
        System.arraycopy(this.o, r0, r4, 0, r3);
    }
}

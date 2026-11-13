package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qj5 extends rj5 {
    public final int q;
    public final int r;

    public qj5(byte[] bArr, int i, int i2) {
        super(bArr);
        rj5.h(i, i + i2, bArr.length);
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.rj5
    public final byte a(int i) {
        int i2 = this.r;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.o[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(f34.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(xa3.e(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.rj5
    public final byte b(int i) {
        return this.o[this.q + i];
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
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.o, this.q, bArr, 0, i);
    }
}

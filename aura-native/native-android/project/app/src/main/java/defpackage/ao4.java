package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ao4 implements wv4 {
    public final wv4 a;
    public final xn4 b;
    public zn4 g;
    public tb1 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = f35.b;
    public final be3 c = new be3();

    public ao4(wv4 wv4Var, xn4 xn4Var) {
        this.a = wv4Var;
        this.b = xn4Var;
    }

    @Override // defpackage.wv4
    public final void a(long j, int i, int i2, int i3, vv4 vv4Var) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, vv4Var);
            return;
        }
        rr2.k("DRM on subtitles is not supported", vv4Var == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.c(this.f, i4, i2, yn4.c, new lj0(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                l93.r0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.wv4
    public final void b(be3 be3Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(be3Var, i, i2);
            return;
        }
        h(i);
        be3Var.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.wv4
    public final int c(wh0 wh0Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(wh0Var, i, z);
        }
        h(i);
        int i2 = wh0Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.wv4
    public final void g(tb1 tb1Var) {
        tb1Var.n.getClass();
        String str = tb1Var.n;
        rr2.l(lw2.h(str) == 3);
        boolean zEquals = tb1Var.equals(this.h);
        xn4 xn4Var = this.b;
        if (!zEquals) {
            this.h = tb1Var;
            this.g = xn4Var.n(tb1Var) ? xn4Var.C(tb1Var) : null;
        }
        zn4 zn4Var = this.g;
        wv4 wv4Var = this.a;
        if (zn4Var == null) {
            wv4Var.g(tb1Var);
            return;
        }
        sb1 sb1VarA = tb1Var.a();
        sb1VarA.m = lw2.m("application/x-media3-cues");
        sb1VarA.j = str;
        sb1VarA.r = Long.MAX_VALUE;
        sb1VarA.K = xn4Var.R(tb1Var);
        f34.l(sb1VarA, wv4Var);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}

package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t84 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public t84 f;
    public t84 g;

    public t84(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final t84 a() {
        t84 t84Var = this.f;
        if (t84Var == this) {
            t84Var = null;
        }
        t84 t84Var2 = this.g;
        t84Var2.getClass();
        t84Var2.f = this.f;
        t84 t84Var3 = this.f;
        t84Var3.getClass();
        t84Var3.g = this.g;
        this.f = null;
        this.g = null;
        return t84Var;
    }

    public final void b(t84 t84Var) {
        t84Var.getClass();
        t84Var.g = this;
        t84Var.f = this.f;
        t84 t84Var2 = this.f;
        t84Var2.getClass();
        t84Var2.g = t84Var;
        this.f = t84Var;
    }

    public final t84 c() {
        this.d = true;
        return new t84(this.a, this.b, this.c, true);
    }

    public final void d(t84 t84Var, int i) {
        t84Var.getClass();
        byte[] bArr = t84Var.a;
        if (!t84Var.e) {
            kf2.o("only owner can write");
            return;
        }
        int i2 = t84Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (t84Var.d) {
                nz2.c();
                return;
            }
            int i4 = t84Var.b;
            if (i3 - i4 > 8192) {
                nz2.c();
                return;
            } else {
                ti.X(0, i4, i2, bArr, bArr);
                t84Var.c -= t84Var.b;
                t84Var.b = 0;
            }
        }
        int i5 = t84Var.c;
        int i6 = this.b;
        ti.X(i5, i6, i6 + i, this.a, bArr);
        t84Var.c += i;
        this.b += i;
    }

    public t84() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}

package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ne1 {
    public final wv4 a;
    public xv4 d;
    public qm0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final tb1 j;
    public boolean m;
    public final rv4 b = new rv4();
    public final be3 c = new be3();
    public final be3 k = new be3(1);
    public final be3 l = new be3();

    public ne1(wv4 wv4Var, xv4 xv4Var, qm0 qm0Var, tb1 tb1Var) {
        this.a = wv4Var;
        this.d = xv4Var;
        this.e = qm0Var;
        this.j = tb1Var;
        this.d = xv4Var;
        this.e = qm0Var;
        wv4Var.g(tb1Var);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? 1073741824 | i : i;
    }

    public final qv4 b() {
        if (!this.m) {
            return null;
        }
        rv4 rv4Var = this.b;
        qm0 qm0Var = rv4Var.a;
        String str = f35.a;
        int i = qm0Var.a;
        qv4 qv4Var = rv4Var.m;
        if (qv4Var == null) {
            qv4Var = this.d.a.l[i];
        }
        if (qv4Var == null || !qv4Var.a) {
            return null;
        }
        return qv4Var;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        be3 be3Var;
        qv4 b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        rv4 rv4Var = this.b;
        if (i3 != 0) {
            be3Var = rv4Var.n;
        } else {
            byte[] bArr = b.e;
            String str = f35.a;
            int length = bArr.length;
            be3 be3Var2 = this.l;
            be3Var2.L(length, bArr);
            i3 = bArr.length;
            be3Var = be3Var2;
        }
        boolean z = rv4Var.k && rv4Var.l[this.f];
        boolean z2 = z || i2 != 0;
        be3 be3Var3 = this.k;
        be3Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        be3Var3.N(0);
        wv4 wv4Var = this.a;
        wv4Var.b(be3Var3, 1, 1);
        wv4Var.b(be3Var, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        be3 be3Var4 = this.c;
        if (!z) {
            be3Var4.K(8);
            byte[] bArr2 = be3Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            wv4Var.b(be3Var4, 8, 1);
            return i3 + 9;
        }
        be3 be3Var5 = rv4Var.n;
        int H = be3Var5.H();
        be3Var5.O(-2);
        int i4 = (H * 6) + 2;
        if (i2 != 0) {
            be3Var4.K(i4);
            byte[] bArr3 = be3Var4.a;
            be3Var5.k(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            be3Var4 = be3Var5;
        }
        wv4Var.b(be3Var4, i4, 1);
        return i3 + 1 + i4;
    }

    public final void e() {
        rv4 rv4Var = this.b;
        rv4Var.d = 0;
        rv4Var.p = 0L;
        rv4Var.q = false;
        rv4Var.k = false;
        rv4Var.o = false;
        rv4Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}

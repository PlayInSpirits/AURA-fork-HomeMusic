package defpackage;

import androidx.work.OverwritingInputMerger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dd5 {
    public static final String y = cx.i("WorkSpec");
    public final String a;
    public int b;
    public final String c;
    public final String d;
    public final oh0 e;
    public final oh0 f;
    public final long g;
    public long h;
    public long i;
    public mc0 j;
    public final int k;
    public final int l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    public /* synthetic */ dd5(String str, int i, String str2, String str3, oh0 oh0Var, oh0 oh0Var2, long j, long j2, long j3, mc0 mc0Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, long j8, int i6, int i7, String str4, int i8) {
        this(str, (i8 & 2) != 0 ? 1 : i, str2, (i8 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i8 & 16) != 0 ? oh0.b : oh0Var, (i8 & 32) != 0 ? oh0.b : oh0Var2, (i8 & 64) != 0 ? 0L : j, (i8 & 128) != 0 ? 0L : j2, (i8 & 256) != 0 ? 0L : j3, (i8 & 512) != 0 ? mc0.j : mc0Var, (i8 & 1024) != 0 ? 0 : i2, (i8 & 2048) != 0 ? 1 : i3, (i8 & 4096) != 0 ? 30000L : j4, (i8 & 8192) != 0 ? -1L : j5, (i8 & 16384) == 0 ? j6 : 0L, (32768 & i8) != 0 ? -1L : j7, (65536 & i8) != 0 ? false : z, (131072 & i8) != 0 ? 1 : i4, (262144 & i8) != 0 ? 0 : i5, 0, (1048576 & i8) != 0 ? Long.MAX_VALUE : j8, (2097152 & i8) != 0 ? 0 : i6, (4194304 & i8) != 0 ? -256 : i7, (i8 & 8388608) != 0 ? null : str4);
    }

    public static dd5 b(dd5 dd5Var, String str, int i, String str2, oh0 oh0Var, int i2, long j, int i3, int i4, long j2, int i5, int i6) {
        String str3 = (i6 & 1) != 0 ? dd5Var.a : str;
        int i7 = (i6 & 2) != 0 ? dd5Var.b : i;
        String str4 = (i6 & 4) != 0 ? dd5Var.c : str2;
        String str5 = dd5Var.d;
        oh0 oh0Var2 = (i6 & 16) != 0 ? dd5Var.e : oh0Var;
        oh0 oh0Var3 = dd5Var.f;
        long j3 = dd5Var.g;
        long j4 = dd5Var.h;
        long j5 = dd5Var.i;
        mc0 mc0Var = dd5Var.j;
        int i8 = (i6 & 1024) != 0 ? dd5Var.k : i2;
        int i9 = dd5Var.l;
        long j6 = dd5Var.m;
        long j7 = (i6 & 8192) != 0 ? dd5Var.n : j;
        long j8 = dd5Var.o;
        long j9 = dd5Var.p;
        boolean z = dd5Var.q;
        int i10 = dd5Var.r;
        int i11 = (i6 & 262144) != 0 ? dd5Var.s : i3;
        int i12 = (i6 & 524288) != 0 ? dd5Var.t : i4;
        long j10 = (i6 & 1048576) != 0 ? dd5Var.u : j2;
        int i13 = (i6 & 2097152) != 0 ? dd5Var.v : i5;
        int i14 = dd5Var.w;
        String str6 = dd5Var.x;
        dd5Var.getClass();
        str3.getClass();
        if (i7 == 0) {
            throw null;
        }
        str4.getClass();
        str5.getClass();
        oh0Var2.getClass();
        oh0Var3.getClass();
        mc0Var.getClass();
        if (i9 == 0) {
            throw null;
        }
        if (i10 != 0) {
            return new dd5(str3, i7, str4, str5, oh0Var2, oh0Var3, j3, j4, j5, mc0Var, i8, i9, j6, j7, j8, j9, z, i10, i11, i12, j10, i13, i14, str6);
        }
        throw null;
    }

    public final long a() {
        int i = this.b;
        int i2 = this.k;
        boolean z = i == 1 && i2 > 0;
        long j = this.n;
        boolean d = d();
        long j2 = this.i;
        long j3 = this.h;
        int i3 = this.l;
        if (i3 == 0) {
            throw null;
        }
        long j4 = this.u;
        int i4 = this.s;
        if (j4 != Long.MAX_VALUE && d) {
            if (i4 != 0) {
                long j5 = j + 900000;
                if (j4 < j5) {
                    return j5;
                }
            }
            return j4;
        }
        if (z) {
            long j6 = this.m;
            long scalb = i3 == 2 ? j6 * i2 : (long) Math.scalb(j6, i2 - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j + scalb;
        }
        long j7 = this.g;
        if (d) {
            long j8 = i4 == 0 ? j + j7 : j + j3;
            return (j2 == j3 || i4 != 0) ? j8 : (j3 - j2) + j8;
        }
        if (j == -1) {
            return Long.MAX_VALUE;
        }
        return j + j7;
    }

    public final boolean c() {
        return !h12.c(mc0.j, this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5)) {
            return false;
        }
        dd5 dd5Var = (dd5) obj;
        return h12.c(this.a, dd5Var.a) && this.b == dd5Var.b && h12.c(this.c, dd5Var.c) && h12.c(this.d, dd5Var.d) && h12.c(this.e, dd5Var.e) && h12.c(this.f, dd5Var.f) && this.g == dd5Var.g && this.h == dd5Var.h && this.i == dd5Var.i && h12.c(this.j, dd5Var.j) && this.k == dd5Var.k && this.l == dd5Var.l && this.m == dd5Var.m && this.n == dd5Var.n && this.o == dd5Var.o && this.p == dd5Var.p && this.q == dd5Var.q && this.r == dd5Var.r && this.s == dd5Var.s && this.t == dd5Var.t && this.u == dd5Var.u && this.v == dd5Var.v && this.w == dd5Var.w && h12.c(this.x, dd5Var.x);
    }

    public final int hashCode() {
        int d = f34.d(this.w, f34.d(this.v, xa3.b(f34.d(this.t, f34.d(this.s, (xa3.w(this.r) + xa3.c(xa3.b(xa3.b(xa3.b(xa3.b((xa3.w(this.l) + f34.d(this.k, (this.j.hashCode() + xa3.b(xa3.b(xa3.b((this.f.hashCode() + ((this.e.hashCode() + f34.e(this.d, f34.e(this.c, (xa3.w(this.b) + (this.a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    public dd5(String str, int i, String str2, String str3, oh0 oh0Var, oh0 oh0Var2, long j, long j2, long j3, mc0 mc0Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, long j8, int i7, int i8, String str4) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        str3.getClass();
        oh0Var.getClass();
        oh0Var2.getClass();
        mc0Var.getClass();
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = oh0Var;
            this.f = oh0Var2;
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = mc0Var;
            this.k = i2;
            this.l = i3;
            this.m = j4;
            this.n = j5;
            this.o = j6;
            this.p = j7;
            this.q = z;
            this.r = i4;
            this.s = i5;
            this.t = i6;
            this.u = j8;
            this.v = i7;
            this.w = i8;
            this.x = str4;
            return;
        }
        throw null;
    }
}

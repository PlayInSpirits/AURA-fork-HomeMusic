package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bu4 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final gn2 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public gn2 b = r;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public an2 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        bn2 bn2Var;
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        Uri uri = Uri.EMPTY;
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        ym2 ym2Var = null;
        if (uri != null) {
            if (((UUID) xm2Var.d) != null) {
                ym2Var = new ym2(xm2Var);
            }
            bn2Var = new bn2(uri, null, ym2Var, null, list, null, gy3Var, -9223372036854775807L);
        } else {
            bn2Var = null;
        }
        r = new gn2("androidx.media3.common.Timeline", new wm2(um2Var), bn2Var, new an2(zm2Var), do2.K, cn2Var);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, gn2 gn2Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, an2 an2Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.b = gn2Var != null ? gn2Var : r;
        if (gn2Var != null) {
            bn2 bn2Var = gn2Var.b;
        }
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = an2Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bu4.class.equals(obj.getClass())) {
            bu4 bu4Var = (bu4) obj;
            if (Objects.equals(this.a, bu4Var.a) && Objects.equals(this.b, bu4Var.b) && Objects.equals(this.c, bu4Var.c) && Objects.equals(this.i, bu4Var.i) && this.d == bu4Var.d && this.e == bu4Var.e && this.f == bu4Var.f && this.g == bu4Var.g && this.h == bu4Var.h && this.j == bu4Var.j && this.k == bu4Var.k && this.l == bu4Var.l && this.m == bu4Var.m && this.n == bu4Var.n && this.o == bu4Var.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        an2 an2Var = this.i;
        int iHashCode3 = (iHashCode2 + (an2Var != null ? an2Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}

package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class cu4 {
    public static final yt4 a = new yt4();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = f35.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, zt4 zt4Var, bu4 bu4Var, int i2, boolean z) {
        int i3 = f(i, zt4Var, false).c;
        if (m(i3, bu4Var, 0L).n != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m(e, bu4Var, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        tb4.a();
        return 0;
    }

    public boolean equals(Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof cu4) {
                cu4 cu4Var = (cu4) obj;
                if (cu4Var.o() == o() && cu4Var.h() == h()) {
                    bu4 bu4Var = new bu4();
                    zt4 zt4Var = new zt4();
                    bu4 bu4Var2 = new bu4();
                    zt4 zt4Var2 = new zt4();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == cu4Var.a(true) && (c2 = c(true)) == cu4Var.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == cu4Var.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, zt4Var, true).equals(cu4Var.f(i2, zt4Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, bu4Var, 0L).equals(cu4Var.m(i, bu4Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract zt4 f(int i, zt4 zt4Var, boolean z);

    public zt4 g(Object obj, zt4 zt4Var) {
        return f(b(obj), zt4Var, true);
    }

    public abstract int h();

    public int hashCode() {
        bu4 bu4Var = new bu4();
        zt4 zt4Var = new zt4();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, bu4Var, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, zt4Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(bu4 bu4Var, zt4 zt4Var, int i, long j) {
        Pair j2 = j(bu4Var, zt4Var, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(bu4 bu4Var, zt4 zt4Var, int i, long j, long j2) {
        rr2.q(i, o());
        m(i, bu4Var, j2);
        if (j == -9223372036854775807L) {
            j = bu4Var.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = bu4Var.m;
        f(i2, zt4Var, false);
        while (i2 < bu4Var.n && zt4Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, zt4Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, zt4Var, true);
        long j3 = j - zt4Var.e;
        long j4 = zt4Var.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = zt4Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        tb4.a();
        return 0;
    }

    public abstract Object l(int i);

    public abstract bu4 m(int i, bu4 bu4Var, long j);

    public final void n(int i, bu4 bu4Var) {
        m(i, bu4Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}

package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe5 extends b71 {
    public static final ge3 f;
    public final ge3 c;
    public final b71 d;
    public final LinkedHashMap e;

    static {
        String str = ge3.o;
        f = tv1.z("/");
    }

    public oe5(ge3 ge3Var, b71 b71Var, LinkedHashMap linkedHashMap) {
        this.c = ge3Var;
        this.d = b71Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.b71
    public final of4 a(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.b71
    public final void b(ge3 ge3Var, ge3 ge3Var2) throws IOException {
        ge3Var.getClass();
        ge3Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.b71
    public final void c(ge3 ge3Var) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.b71
    public final void d(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.b71
    public final List f(ge3 ge3Var) throws IOException {
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        ne5 ne5Var = (ne5) this.e.get(f.b(ge3Var2, ge3Var, true));
        if (ne5Var != null) {
            return q40.Q0(ne5Var.q);
        }
        tb4.d(ge3Var, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.b71
    public final xo0 h(ge3 ge3Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        ge3Var.getClass();
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        ne5 ne5VarX = (ne5) this.e.get(f.b(ge3Var2, ge3Var, true));
        if (ne5VarX == null) {
            return null;
        }
        long j = ne5VarX.h;
        if (j != -1) {
            r32 r32VarI = this.d.i(this.c);
            try {
                xu3 xu3Var = new xu3(r32VarI.b(j));
                try {
                    ne5VarX = gb.X(xu3Var, ne5VarX);
                    ne5VarX.getClass();
                    try {
                        xu3Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        xu3Var.close();
                    } catch (Throwable th5) {
                        j51.d(th4, th5);
                    }
                    th2 = th4;
                    ne5VarX = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    r32VarI.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (r32VarI != null) {
                    try {
                        r32VarI.close();
                    } catch (Throwable th8) {
                        j51.d(th7, th8);
                    }
                }
                th = th7;
                ne5VarX = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = ne5VarX.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(ne5VarX.f);
        Long l2 = ne5VarX.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = ne5VarX.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = ne5VarX.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = ne5VarX.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = ne5VarX.j;
                if (i != -1) {
                    int i2 = ne5VarX.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = ne5VarX.l;
        if (l4 == null) {
            Integer num3 = ne5VarX.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new xo0(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new xo0(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.b71
    public final r32 i(ge3 ge3Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.b71
    public final of4 j(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 ge3Var) throws Throwable {
        Throwable th;
        xu3 xu3Var;
        ge3Var.getClass();
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        ne5 ne5Var = (ne5) this.e.get(f.b(ge3Var2, ge3Var, true));
        if (ne5Var == null) {
            mj0.k(ge3Var, "no such file: ");
            return null;
        }
        long j = ne5Var.f;
        r32 r32VarI = this.d.i(this.c);
        try {
            xu3Var = new xu3(r32VarI.b(ne5Var.h));
            try {
                r32VarI.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (r32VarI != null) {
                try {
                    r32VarI.close();
                } catch (Throwable th4) {
                    j51.d(th3, th4);
                }
            }
            th = th3;
            xu3Var = null;
        }
        if (th != null) {
            throw th;
        }
        xu3Var.getClass();
        gb.X(xu3Var, null);
        if (ne5Var.g == 0) {
            return new o71(xu3Var, j, true);
        }
        return new o71(new wy1(new xu3(new o71(xu3Var, ne5Var.e, true)), new Inflater(true)), j, false);
    }
}

package defpackage;

import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 extends l32 {
    public static final m32 G = new m32();
    public static final Object H = new Object();
    public Object[] C;
    public int D;
    public String[] E;
    public int[] F;

    @Override // defpackage.l32
    public final String H() {
        return n0(true);
    }

    @Override // defpackage.l32
    public final boolean J() {
        int iE0 = e0();
        return (iE0 == 4 || iE0 == 2 || iE0 == 10) ? false : true;
    }

    @Override // defpackage.l32
    public final boolean R() {
        m0(8);
        boolean zD = ((k32) r0()).d();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zD;
    }

    @Override // defpackage.l32
    public final double T() throws MalformedJsonException {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            tb4.j("Expected ", b11.x(7), " but was ", b11.x(iE0), o0());
            return 0.0d;
        }
        k32 k32Var = (k32) q0();
        double dDoubleValue = k32Var.n instanceof Number ? k32Var.e().doubleValue() : Double.parseDouble(k32Var.b());
        if (!this.o && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // defpackage.l32
    public final int W() {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            tb4.j("Expected ", b11.x(7), " but was ", b11.x(iE0), o0());
            return 0;
        }
        k32 k32Var = (k32) q0();
        int iIntValue = k32Var.n instanceof Number ? k32Var.e().intValue() : Integer.parseInt(k32Var.b());
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // defpackage.l32
    public final long X() {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            tb4.j("Expected ", b11.x(7), " but was ", b11.x(iE0), o0());
            return 0L;
        }
        k32 k32Var = (k32) q0();
        long jLongValue = k32Var.n instanceof Number ? k32Var.e().longValue() : Long.parseLong(k32Var.b());
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // defpackage.l32
    public final String Y() {
        return p0(false);
    }

    @Override // defpackage.l32
    public final void a0() {
        m0(9);
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.l32
    public final void b() {
        m0(1);
        s0(((f32) q0()).n.iterator());
        this.F[this.D - 1] = 0;
    }

    @Override // defpackage.l32
    public final String c0() {
        int iE0 = e0();
        if (iE0 != 6 && iE0 != 7) {
            tb4.j("Expected ", b11.x(6), " but was ", b11.x(iE0), o0());
            return null;
        }
        String strB = ((k32) r0()).b();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strB;
    }

    @Override // defpackage.l32, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.C = new Object[]{H};
        this.D = 1;
    }

    @Override // defpackage.l32
    public final int e0() {
        if (this.D == 0) {
            return 10;
        }
        Object objQ0 = q0();
        if (objQ0 instanceof Iterator) {
            boolean z = this.C[this.D - 2] instanceof j32;
            Iterator it = (Iterator) objQ0;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            s0(it.next());
            return e0();
        }
        if (objQ0 instanceof j32) {
            return 3;
        }
        if (objQ0 instanceof f32) {
            return 1;
        }
        if (objQ0 instanceof k32) {
            Serializable serializable = ((k32) objQ0).n;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objQ0 instanceof i32) {
            return 9;
        }
        if (objQ0 == H) {
            kf2.o("JsonReader is closed");
            return 0;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objQ0.getClass().getName() + " is not supported");
    }

    @Override // defpackage.l32
    public final void f() {
        m0(3);
        s0(((lb2) ((j32) q0()).n.entrySet()).iterator());
    }

    @Override // defpackage.l32
    public final void k0() {
        int iW = xa3.w(e0());
        if (iW == 1) {
            q();
            return;
        }
        if (iW != 9) {
            if (iW == 3) {
                s();
                return;
            }
            if (iW == 4) {
                p0(true);
                return;
            }
            r0();
            int i = this.D;
            if (i > 0) {
                int[] iArr = this.F;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    public final void m0(int i) {
        if (e0() == i) {
            return;
        }
        tb4.j("Expected ", b11.x(i), " but was ", b11.x(e0()), o0());
    }

    public final String n0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.D;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.C;
            Object obj = objArr[i];
            if (obj instanceof f32) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.F[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof j32) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.E[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String o0() {
        return " at path ".concat(n0(false));
    }

    public final String p0(boolean z) {
        m0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) q0()).next();
        String str = (String) entry.getKey();
        this.E[this.D - 1] = z ? "<skipped>" : str;
        s0(entry.getValue());
        return str;
    }

    @Override // defpackage.l32
    public final void q() {
        m0(2);
        r0();
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final Object q0() {
        return this.C[this.D - 1];
    }

    public final Object r0() {
        Object[] objArr = this.C;
        int i = this.D - 1;
        this.D = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // defpackage.l32
    public final void s() {
        m0(4);
        this.E[this.D - 1] = null;
        r0();
        r0();
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.F;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void s0(Object obj) {
        int i = this.D;
        Object[] objArr = this.C;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.C = Arrays.copyOf(objArr, i2);
            this.F = Arrays.copyOf(this.F, i2);
            this.E = (String[]) Arrays.copyOf(this.E, i2);
        }
        Object[] objArr2 = this.C;
        int i3 = this.D;
        this.D = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.l32
    public final String toString() {
        return n32.class.getSimpleName().concat(o0());
    }

    @Override // defpackage.l32
    public final String v() {
        return n0(false);
    }
}

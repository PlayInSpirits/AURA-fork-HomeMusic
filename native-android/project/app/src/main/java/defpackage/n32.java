package defpackage;

import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 extends l32 {
    public static final m32 G = null;
    public static final Object H = null;
    public Object[] C;
    public int D;
    public String[] E;
    public int[] F;

    static {
        G = new m32();
        H = new Object();
    }

    @Override // defpackage.l32
    public final String H() {
        return n0(true);
    }

    @Override // defpackage.l32
    public final boolean J() {
        int r1 = e0();
        if (r1 != 4) goto L5;
        return false;
    L5:
        if (r1 != 2) goto L7;
        return false;
    L7:
        if (r1 == 10) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.l32
    public final boolean R() {
        m0(8);
        boolean r0 = ((k32) r0()).d();
        int r1 = this.D;
        if (r1 <= 0) goto L5;
        int[] r3 = this.F;
        int r2 = r1 - 1;
        r3[r2] = r3[r2] + 1;
    L5:
        return r0;
    }

    @Override // defpackage.l32
    public final double T() {
        int r0 = e0();
        if (r0 != 7) goto L5;
    L9:
        k32 r1 = (k32) q0();
        if ((r1.n instanceof Number) == false) goto L12;
        double r2 = r1.e().doubleValue();
    L14:
        if (this.o == false) goto L16;
    L22:
        r0();
        int r3 = this.D;
        if (r3 <= 0) goto L25;
        int[] r4 = this.F;
        int r5 = r3 - 1;
        r4[r5] = r4[r5] + 1;
    L25:
        return r2;
    L16:
        if (Double.isNaN(r2) == true) goto L21;
        if (Double.isInfinite(r2) == false) goto L22;
    L21:
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + r2);
    L12:
        r2 = Double.parseDouble(r1.b());
        goto L14
    L5:
        if (r0 == 6) goto L9;
        tb4.j("Expected ", b11.x(7), " but was ", b11.x(r0), o0());
        return 0.0d;
    }

    @Override // defpackage.l32
    public final int W() {
        int r0 = e0();
        if (r0 != 7) goto L5;
    L9:
        k32 r1 = (k32) q0();
        if ((r1.n instanceof Number) == false) goto L12;
        int r2 = r1.e().intValue();
    L13:
        r0();
        int r3 = this.D;
        if (r3 <= 0) goto L16;
        int[] r4 = this.F;
        int r5 = r3 - 1;
        r4[r5] = r4[r5] + 1;
    L16:
        return r2;
    L12:
        r2 = Integer.parseInt(r1.b());
        goto L13
    L5:
        if (r0 == 6) goto L9;
        tb4.j("Expected ", b11.x(7), " but was ", b11.x(r0), o0());
        return 0;
    }

    @Override // defpackage.l32
    public final long X() {
        int r0 = e0();
        if (r0 != 7) goto L5;
    L9:
        k32 r1 = (k32) q0();
        if ((r1.n instanceof Number) == false) goto L12;
        long r2 = r1.e().longValue();
    L13:
        r0();
        int r3 = this.D;
        if (r3 <= 0) goto L16;
        int[] r4 = this.F;
        int r5 = r3 - 1;
        r4[r5] = r4[r5] + 1;
    L16:
        return r2;
    L12:
        r2 = Long.parseLong(r1.b());
        goto L13
    L5:
        if (r0 == 6) goto L9;
        tb4.j("Expected ", b11.x(7), " but was ", b11.x(r0), o0());
        return 0;
    }

    @Override // defpackage.l32
    public final String Y() {
        return p0(false);
    }

    @Override // defpackage.l32
    public final void a0() {
        m0(9);
        r0();
        int r0 = this.D;
        if (r0 <= 0) goto L6;
        int[] r2 = this.F;
        int r1 = r0 - 1;
        r2[r1] = r2[r1] + 1;
        return;
    }

    @Override // defpackage.l32
    public final void b() {
        m0(1);
        s0(((f32) q0()).n.iterator());
        this.F[this.D - 1] = 0;
    }

    @Override // defpackage.l32
    public final String c0() {
        int r0 = e0();
        if (r0 != 6) goto L5;
    L9:
        String r1 = ((k32) r0()).b();
        int r2 = this.D;
        if (r2 <= 0) goto L12;
        int[] r4 = this.F;
        int r3 = r2 - 1;
        r4[r3] = r4[r3] + 1;
    L12:
        return r1;
    L5:
        if (r0 == 7) goto L9;
        tb4.j("Expected ", b11.x(6), " but was ", b11.x(r0), o0());
        return null;
    }

    @Override // defpackage.l32, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.C = new Object[]{H};
        this.D = 1;
    }

    @Override // defpackage.l32
    public final int e0() {
        if (this.D != 0) goto L6;
        return 10;
    L6:
        Object r0 = q0();
        if ((r0 instanceof Iterator) == false) goto L20;
        boolean r1 = this.C[this.D - 2] instanceof j32;
        Iterator r2 = (Iterator) r0;
        if (r2.hasNext() == false) goto L15;
        if (r1 == false) goto L13;
        return 5;
    L13:
        s0(r2.next());
        return e0();
    L15:
        if (r1 == false) goto L18;
        return 4;
    L18:
        return 2;
    L20:
        if ((r0 instanceof j32) == false) goto L24;
        return 3;
    L24:
        if ((r0 instanceof f32) == false) goto L28;
        return 1;
    L28:
        if ((r0 instanceof k32) == false) goto L44;
        Serializable r4 = ((k32) r0).n;
        if ((r4 instanceof String) == false) goto L34;
        return 6;
    L34:
        if ((r4 instanceof Boolean) == false) goto L38;
        return 8;
    L38:
        if ((r4 instanceof Number) == false) goto L42;
        return 7;
    L42:
        throw new AssertionError();
    L44:
        if ((r0 instanceof i32) == false) goto L48;
        return 9;
    L48:
        if (r0 != H) goto L52;
        kf2.o("JsonReader is closed");
        return 0;
    L52:
        throw new MalformedJsonException("Custom JsonElement subclass " + r0.getClass().getName() + " is not supported");
    }

    @Override // defpackage.l32
    public final void f() {
        m0(3);
        s0(((lb2) ((j32) q0()).n.entrySet()).iterator());
    }

    @Override // defpackage.l32
    public final void k0() {
        int r0 = xa3.w(e0());
        if (r0 != 1) goto L5;
        q();
        return;
    L5:
        if (r0 != 9) goto L7;
        return;
    L7:
        if (r0 != 3) goto L9;
        s();
        return;
    L9:
        if (r0 == 4) goto L14;
        r0();
        int r1 = this.D;
        if (r1 <= 0) goto L21;
        int[] r3 = this.F;
        int r2 = r1 - 1;
        r3[r2] = r3[r2] + 1;
        return;
    L21:
        return;
    L14:
        p0(true);
    }

    public final void m0(int r4) {
        if (e0() != r4) goto L5;
        return;
    L5:
        tb4.j("Expected ", b11.x(r4), " but was ", b11.x(e0()), o0());
    }

    public final String n0(boolean r7) {
        StringBuilder r0 = new StringBuilder("$");
        int r1 = 0;
    L3:
        int r2 = this.D;
        if (r1 >= r2) goto L31;
        Object[] r3 = this.C;
        Object r4 = r3[r1];
        if ((r4 instanceof f32) == false) goto L21;
        r1 = r1 + 1;
        if (r1 >= r2) goto L29;
        if ((r3[r1] instanceof Iterator) == false) goto L29;
        int r5 = this.F[r1];
        if (r7 == false) goto L19;
        if (r5 <= 0) goto L19;
        if (r1 != (r2 - 1)) goto L17;
    L18:
        r5 = r5 - 1;
        goto L19
    L17:
        if (r1 == (r2 - 2)) goto L18;
    L19:
        r0.append('[');
        r0.append(r5);
        r0.append(']');
    L29:
        r1 = r1 + 1;
        goto L3
    L21:
        if ((r4 instanceof j32) == false) goto L29;
        r1 = r1 + 1;
        if (r1 >= r2) goto L29;
        if ((r3[r1] instanceof Iterator) == false) goto L29;
        r0.append('.');
        String r6 = this.E[r1];
        if (r6 == null) goto L29;
        r0.append(r6);
        goto L29
    L31:
        return r0.toString();
    }

    public final String o0() {
        return " at path ".concat(n0(false));
    }

    public final String p0(boolean r5) {
        m0(5);
        Map.Entry r0 = (Map.Entry) ((Iterator) q0()).next();
        String r1 = (String) r0.getKey();
        String[] r2 = this.E;
        int r3 = this.D - 1;
        if (r5 == false) goto L5;
        String r6 = "<skipped>";
    L6:
        r2[r3] = r6;
        s0(r0.getValue());
        return r1;
    L5:
        r6 = r1;
        goto L6
    }

    @Override // defpackage.l32
    public final void q() {
        m0(2);
        r0();
        r0();
        int r0 = this.D;
        if (r0 <= 0) goto L6;
        int[] r2 = this.F;
        int r1 = r0 - 1;
        r2[r1] = r2[r1] + 1;
        return;
    }

    public final Object q0() {
        return this.C[this.D - 1];
    }

    public final Object r0() {
        Object[] r0 = this.C;
        int r1 = this.D - 1;
        this.D = r1;
        Object r3 = r0[r1];
        r0[r1] = null;
        return r3;
    }

    @Override // defpackage.l32
    public final void s() {
        m0(4);
        this.E[this.D - 1] = null;
        r0();
        r0();
        int r0 = this.D;
        if (r0 <= 0) goto L6;
        int[] r3 = this.F;
        int r1 = r0 - 1;
        r3[r1] = r3[r1] + 1;
        return;
    }

    public final void s0(Object r4) {
        int r0 = this.D;
        Object[] r1 = this.C;
        if (r0 != r1.length) goto L5;
        int r2 = r0 * 2;
        this.C = Arrays.copyOf(r1, r2);
        this.F = Arrays.copyOf(this.F, r2);
        this.E = (String[]) Arrays.copyOf(this.E, r2);
    L5:
        Object[] r3 = this.C;
        int r5 = this.D;
        this.D = r5 + 1;
        r3[r5] = r4;
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

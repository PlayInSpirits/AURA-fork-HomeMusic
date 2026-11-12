package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p32 extends q32 {
    public static final o32 B = null;
    public static final k32 C = null;
    public h32 A;
    public final ArrayList y;
    public String z;

    static {
        B = new o32();
        C = new k32("closed");
    }

    public p32() {
        super(B);
        this.y = new ArrayList();
        this.A = i32.n;
    }

    @Override // defpackage.q32
    public final q32 F() {
        a0(i32.n);
        return this;
    }

    @Override // defpackage.q32
    public final void K(double r3) {
        if (this.r == false) goto L5;
    L11:
        a0(new k32(Double.valueOf(r3)));
        return;
    L5:
        if (Double.isNaN(r3) == true) goto L10;
        if (Double.isInfinite(r3) == false) goto L11;
    L10:
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + r3);
    }

    @Override // defpackage.q32
    public final void M(long r2) {
        a0(new k32(Long.valueOf(r2)));
    }

    @Override // defpackage.q32
    public final void R(Boolean r2) {
        if (r2 != null) goto L5;
        a0(i32.n);
        return;
    L5:
        a0(new k32(r2));
    }

    @Override // defpackage.q32
    public final void T(Number r4) {
        if (r4 != null) goto L6;
        a0(i32.n);
        return;
    L6:
        if (this.r == true) goto L14;
        double r0 = r4.doubleValue();
        if (Double.isNaN(r0) == false) goto L10;
    L12:
        mj0.l(r4, "JSON forbids NaN and infinities: ");
        return;
    L10:
        if (Double.isInfinite(r0) == true) goto L12;
    L14:
        a0(new k32(r4));
    }

    @Override // defpackage.q32
    public final void W(String r2) {
        if (r2 != null) goto L5;
        a0(i32.n);
        return;
    L5:
        a0(new k32(r2));
    }

    @Override // defpackage.q32
    public final void X(boolean r2) {
        a0(new k32(Boolean.valueOf(r2)));
    }

    public final h32 Z() {
        ArrayList r1 = this.y;
        return (h32) r1.get(r1.size() - 1);
    }

    public final void a0(h32 r3) {
        if (this.z == null) goto L12;
        if ((r3 instanceof i32) == true) goto L7;
    L8:
        j32 r0 = (j32) Z();
        String r1 = this.z;
        r0.n.put(r1, r3);
    L9:
        this.z = null;
        return;
    L7:
        if (this.u == false) goto L9;
    L12:
        if (this.y.isEmpty() == false) goto L15;
        this.A = r3;
        return;
    L15:
        h32 r2 = Z();
        if ((r2 instanceof f32) == false) goto L19;
        ((f32) r2).n.add(r3);
        return;
    L19:
        tb4.a();
    }

    @Override // defpackage.q32, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList r1 = this.y;
        if (r1.isEmpty() == false) goto L6;
        r1.add(C);
        return;
    L6:
        mj0.i("Incomplete document");
    }

    @Override // defpackage.q32
    public final void f() {
        f32 r0 = new f32();
        a0(r0);
        this.y.add(r0);
    }

    @Override // defpackage.q32, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.q32
    public final void j() {
        j32 r0 = new j32();
        a0(r0);
        this.y.add(r0);
    }

    @Override // defpackage.q32
    public final void q() {
        ArrayList r0 = this.y;
        if (r0.isEmpty() == false) goto L5;
    L12:
        tb4.a();
        return;
    L5:
        if (this.z != null) goto L12;
        if ((Z() instanceof f32) == false) goto L10;
        r0.remove(r0.size() - 1);
        return;
    L10:
        tb4.a();
    }

    @Override // defpackage.q32
    public final void s() {
        ArrayList r0 = this.y;
        if (r0.isEmpty() == false) goto L5;
    L12:
        tb4.a();
        return;
    L5:
        if (this.z != null) goto L12;
        if ((Z() instanceof j32) == false) goto L10;
        r0.remove(r0.size() - 1);
        return;
    L10:
        tb4.a();
    }

    @Override // defpackage.q32
    public final void u(String r2) {
        Objects.requireNonNull(r2, "name == null");
        if (this.y.isEmpty() == false) goto L5;
    L12:
        tb4.a();
        return;
    L5:
        if (this.z != null) goto L12;
        if ((Z() instanceof j32) == false) goto L10;
        this.z = r2;
        return;
    L10:
        tb4.a();
    }
}

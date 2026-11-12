package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p32 extends q32 {
    public static final o32 B = new o32();
    public static final k32 C = new k32("closed");
    public h32 A;
    public final ArrayList y;
    public String z;

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
    public final void K(double d) {
        if (this.r || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a0(new k32(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // defpackage.q32
    public final void M(long j) {
        a0(new k32(Long.valueOf(j)));
    }

    @Override // defpackage.q32
    public final void R(Boolean bool) {
        if (bool == null) {
            a0(i32.n);
        } else {
            a0(new k32(bool));
        }
    }

    @Override // defpackage.q32
    public final void T(Number number) {
        if (number == null) {
            a0(i32.n);
            return;
        }
        if (!this.r) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                mj0.l(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        a0(new k32(number));
    }

    @Override // defpackage.q32
    public final void W(String str) {
        if (str == null) {
            a0(i32.n);
        } else {
            a0(new k32(str));
        }
    }

    @Override // defpackage.q32
    public final void X(boolean z) {
        a0(new k32(Boolean.valueOf(z)));
    }

    public final h32 Z() {
        ArrayList arrayList = this.y;
        return (h32) arrayList.get(arrayList.size() - 1);
    }

    public final void a0(h32 h32Var) {
        if (this.z != null) {
            if (!(h32Var instanceof i32) || this.u) {
                j32 j32Var = (j32) Z();
                j32Var.n.put(this.z, h32Var);
            }
            this.z = null;
            return;
        }
        if (this.y.isEmpty()) {
            this.A = h32Var;
            return;
        }
        h32 h32VarZ = Z();
        if (h32VarZ instanceof f32) {
            ((f32) h32VarZ).n.add(h32Var);
        } else {
            tb4.a();
        }
    }

    @Override // defpackage.q32, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            arrayList.add(C);
        } else {
            mj0.i("Incomplete document");
        }
    }

    @Override // defpackage.q32
    public final void f() {
        f32 f32Var = new f32();
        a0(f32Var);
        this.y.add(f32Var);
    }

    @Override // defpackage.q32, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.q32
    public final void j() {
        j32 j32Var = new j32();
        a0(j32Var);
        this.y.add(j32Var);
    }

    @Override // defpackage.q32
    public final void q() {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty() || this.z != null) {
            tb4.a();
        } else if (Z() instanceof f32) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            tb4.a();
        }
    }

    @Override // defpackage.q32
    public final void s() {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty() || this.z != null) {
            tb4.a();
        } else if (Z() instanceof j32) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            tb4.a();
        }
    }

    @Override // defpackage.q32
    public final void u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.y.isEmpty() || this.z != null) {
            tb4.a();
        } else if (Z() instanceof j32) {
            this.z = str;
        } else {
            tb4.a();
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f32;
import defpackage.h32;
import defpackage.i32;
import defpackage.j32;
import defpackage.k32;
import defpackage.mj0;
import defpackage.o32;
import defpackage.q32;
import defpackage.tb4;
import java.util.ArrayList;
import java.util.Objects;

public final class p32
extends q32 {
    public static final o32 B = new o32();
    public static final k32 C = new k32("closed");
    public h32 A;
    public final ArrayList y = new ArrayList();
    public String z;

    public p32() {
        super(B);
        this.A = i32.n;
    }

    @Override
    public final q32 F() {
        this.a0(i32.n);
        return this;
    }

    @Override
    public final void K(double d16) {
        if (!this.r && (Double.isNaN(d16) || Double.isInfinite(d16))) {
            StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
            stringBuilder.append(d16);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.a0(new k32(d16));
    }

    @Override
    public final void M(long l16) {
        this.a0(new k32(l16));
    }

    @Override
    public final void R(Boolean bl5) {
        if (bl5 == null) {
            this.a0(i32.n);
            return;
        }
        this.a0(new k32(bl5));
    }

    @Override
    public final void T(Number number) {
        double d16;
        if (number == null) {
            this.a0(i32.n);
            return;
        }
        if (!this.r && (Double.isNaN(d16 = number.doubleValue()) || Double.isInfinite(d16))) {
            mj0.l(number, "JSON forbids NaN and infinities: ");
            return;
        }
        this.a0(new k32(number));
    }

    @Override
    public final void W(String string) {
        if (string == null) {
            this.a0(i32.n);
            return;
        }
        this.a0(new k32(string));
    }

    @Override
    public final void X(boolean bl5) {
        this.a0(new k32(bl5));
    }

    public final h32 Z() {
        ArrayList arrayList = this.y;
        return (h32)arrayList.get(arrayList.size() - 1);
    }

    public final void a0(h32 h322) {
        if (this.z != null) {
            if (!(h322 instanceof i32) || this.u) {
                j32 j322 = (j32)this.Z();
                String string = this.z;
                j322.n.put(string, h322);
            }
            this.z = null;
            return;
        }
        if (this.y.isEmpty()) {
            this.A = h322;
            return;
        }
        h32 h323 = this.Z();
        if (h323 instanceof f32) {
            ((f32)h323).n.add(h322);
            return;
        }
        tb4.a();
    }

    @Override
    public final void close() {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            arrayList.add(C);
            return;
        }
        mj0.i("Incomplete document");
    }

    @Override
    public final void f() {
        f32 f322 = new f32();
        this.a0(f322);
        this.y.add(f322);
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void j() {
        j32 j322 = new j32();
        this.a0(j322);
        this.y.add(j322);
    }

    @Override
    public final void q() {
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty() && this.z == null) {
            if (this.Z() instanceof f32) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            tb4.a();
            return;
        }
        tb4.a();
    }

    @Override
    public final void s() {
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty() && this.z == null) {
            if (this.Z() instanceof j32) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            tb4.a();
            return;
        }
        tb4.a();
    }

    @Override
    public final void u(String string) {
        Objects.requireNonNull(string, "name == null");
        if (!this.y.isEmpty() && this.z == null) {
            if (this.Z() instanceof j32) {
                this.z = string;
                return;
            }
            tb4.a();
            return;
        }
        tb4.a();
    }
}


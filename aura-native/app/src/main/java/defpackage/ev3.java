package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ev3 {
    public final bv3 a;
    public final ArrayList b;
    public final int c;
    public final y10 d;
    public final oz3 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public ev3(bv3 bv3Var, ArrayList arrayList, int i, y10 y10Var, oz3 oz3Var, int i2, int i3, int i4) {
        oz3Var.getClass();
        this.a = bv3Var;
        this.b = arrayList;
        this.c = i;
        this.d = y10Var;
        this.e = oz3Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static ev3 a(ev3 ev3Var, int i, y10 y10Var, oz3 oz3Var, int i2) {
        if ((i2 & 1) != 0) {
            i = ev3Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            y10Var = ev3Var.d;
        }
        y10 y10Var2 = y10Var;
        if ((i2 & 4) != 0) {
            oz3Var = ev3Var.e;
        }
        oz3 oz3Var2 = oz3Var;
        int i4 = ev3Var.f;
        int i5 = ev3Var.g;
        int i6 = ev3Var.h;
        oz3Var2.getClass();
        return new ev3(ev3Var.a, ev3Var.b, i3, y10Var2, oz3Var2, i4, i5, i6);
    }

    public final k14 b(oz3 oz3Var) {
        oz3Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            kf2.o("Check failed.");
            return null;
        }
        this.i++;
        y10 y10Var = this.d;
        if (y10Var != null) {
            if (!((s21) y10Var.e).d().f(oz3Var.a)) {
                nz2.z(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                nz2.z(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        ev3 a = a(this, i2, null, oz3Var, 58);
        r02 r02Var = (r02) arrayList.get(i);
        k14 a2 = r02Var.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + r02Var + " returned null");
        }
        if (y10Var == null || i2 >= arrayList.size() || a.i == 1) {
            return a2;
        }
        nz2.z(r02Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}

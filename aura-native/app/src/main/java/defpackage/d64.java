package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d64 {
    public final ol1 a;
    public final int b;
    public final boolean c;
    public final double d;
    public final tu4 e;
    public final tu4 f;
    public final tu4 g;
    public final tu4 h;
    public final tu4 i;
    public final tu4 j;

    public d64(ol1 ol1Var, boolean z, double d) {
        ArrayList arrayList;
        tu4 a = tu4.a(ol1Var.a, ol1Var.b);
        double d2 = ol1Var.a;
        double d3 = ol1Var.b;
        tu4 a2 = tu4.a(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
        ss0 ss0Var = new ss0(ol1Var);
        int round = (int) Math.round(ol1Var.a);
        ol1 ol1Var2 = (ol1) ss0Var.y().get(round);
        double A = ss0Var.A(ol1Var2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ol1Var2);
        int i = 0;
        double d4 = 0.0d;
        while (i < 360) {
            int i2 = (round + i) % 360;
            if (i2 < 0) {
                i2 += 360;
            }
            double A2 = ss0Var.A((ol1) ss0Var.y().get(i2));
            d4 += Math.abs(A2 - A);
            i++;
            A = A2;
        }
        double d5 = d4 / 6.0d;
        double A3 = ss0Var.A(ol1Var2);
        int i3 = 1;
        double d6 = 0.0d;
        while (true) {
            if (arrayList2.size() >= 6) {
                arrayList = arrayList2;
                break;
            }
            int i4 = (round + i3) % 360;
            ol1 ol1Var3 = (ol1) ss0Var.y().get(i4 < 0 ? i4 + 360 : i4);
            double A4 = ss0Var.A(ol1Var3);
            d6 = Math.abs(A4 - A3) + d6;
            boolean z2 = d6 >= ((double) arrayList2.size()) * d5;
            int i5 = 1;
            for (int i6 = 6; z2 && arrayList2.size() < i6; i6 = 6) {
                arrayList2.add(ol1Var3);
                ArrayList arrayList3 = arrayList2;
                z2 = d6 >= ((double) (arrayList2.size() + i5)) * d5;
                i5++;
                arrayList2 = arrayList3;
            }
            arrayList = arrayList2;
            i3++;
            if (i3 > 360) {
                while (arrayList.size() < 6) {
                    arrayList.add(ol1Var3);
                }
            } else {
                arrayList2 = arrayList;
                A3 = A4;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(ol1Var);
        int floor = (int) Math.floor(1.0d);
        for (int i7 = 1; i7 < floor + 1; i7++) {
            int i8 = 0 - i7;
            while (i8 < 0) {
                i8 += arrayList.size();
            }
            if (i8 >= arrayList.size()) {
                i8 %= arrayList.size();
            }
            arrayList4.add(0, (ol1) arrayList.get(i8));
        }
        int i9 = 3 - floor;
        for (int i10 = 1; i10 < i9; i10++) {
            int i11 = i10;
            while (i11 < 0) {
                i11 += arrayList.size();
            }
            if (i11 >= arrayList.size()) {
                i11 %= arrayList.size();
            }
            arrayList4.add((ol1) arrayList.get(i11));
        }
        ol1 q = vr1.q((ol1) arrayList4.get(2));
        tu4 tu4Var = new tu4(q.a, q.b);
        tu4 a3 = tu4.a(ol1Var.a, ol1Var.b / 8.0d);
        tu4 a4 = tu4.a(ol1Var.a, (ol1Var.b / 8.0d) + 4.0d);
        this.a = ol1Var;
        this.b = 7;
        this.c = z;
        this.d = d;
        this.e = a;
        this.f = a2;
        this.g = tu4Var;
        this.h = a3;
        this.i = a4;
        this.j = tu4.a(25.0d, 84.0d);
    }
}

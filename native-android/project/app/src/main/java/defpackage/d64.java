package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        tu4 tu4VarA = tu4.a(ol1Var.a, ol1Var.b);
        double d2 = ol1Var.a;
        double d3 = ol1Var.b;
        tu4 tu4VarA2 = tu4.a(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
        ss0 ss0Var = new ss0(ol1Var);
        int iRound = (int) Math.round(ol1Var.a);
        ol1 ol1Var2 = (ol1) ss0Var.y().get(iRound);
        double dA = ss0Var.A(ol1Var2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ol1Var2);
        int i = 0;
        double dAbs = 0.0d;
        while (i < 360) {
            int i2 = (iRound + i) % 360;
            if (i2 < 0) {
                i2 += 360;
            }
            double dA2 = ss0Var.A((ol1) ss0Var.y().get(i2));
            dAbs += Math.abs(dA2 - dA);
            i++;
            dA = dA2;
        }
        double d4 = dAbs / 6.0d;
        double dA3 = ss0Var.A(ol1Var2);
        int i3 = 1;
        double dAbs2 = 0.0d;
        while (true) {
            if (arrayList2.size() >= 6) {
                arrayList = arrayList2;
                break;
            }
            int i4 = (iRound + i3) % 360;
            ol1 ol1Var3 = (ol1) ss0Var.y().get(i4 < 0 ? i4 + 360 : i4);
            double dA4 = ss0Var.A(ol1Var3);
            dAbs2 = Math.abs(dA4 - dA3) + dAbs2;
            boolean z2 = dAbs2 >= ((double) arrayList2.size()) * d4;
            int i5 = 1;
            for (int i6 = 6; z2 && arrayList2.size() < i6; i6 = 6) {
                arrayList2.add(ol1Var3);
                ArrayList arrayList3 = arrayList2;
                z2 = dAbs2 >= ((double) (arrayList2.size() + i5)) * d4;
                i5++;
                arrayList2 = arrayList3;
            }
            arrayList = arrayList2;
            i3++;
            if (i3 > 360) {
                while (arrayList.size() < 6) {
                    arrayList.add(ol1Var3);
                }
                break;
            } else {
                arrayList2 = arrayList;
                dA3 = dA4;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(ol1Var);
        int iFloor = (int) Math.floor(1.0d);
        for (int i7 = 1; i7 < iFloor + 1; i7++) {
            int size = 0 - i7;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList4.add(0, (ol1) arrayList.get(size));
        }
        int i8 = 3 - iFloor;
        for (int i9 = 1; i9 < i8; i9++) {
            int size2 = i9;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList4.add((ol1) arrayList.get(size2));
        }
        ol1 ol1VarQ = vr1.q((ol1) arrayList4.get(2));
        tu4 tu4Var = new tu4(ol1VarQ.a, ol1VarQ.b);
        tu4 tu4VarA3 = tu4.a(ol1Var.a, ol1Var.b / 8.0d);
        tu4 tu4VarA4 = tu4.a(ol1Var.a, (ol1Var.b / 8.0d) + 4.0d);
        this.a = ol1Var;
        this.b = 7;
        this.c = z;
        this.d = d;
        this.e = tu4VarA;
        this.f = tu4VarA2;
        this.g = tu4Var;
        this.h = tu4VarA3;
        this.i = tu4VarA4;
        this.j = tu4.a(25.0d, 84.0d);
    }
}

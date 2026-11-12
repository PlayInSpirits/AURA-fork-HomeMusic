package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final fs e;
    public final gs f;
    public final r62 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int[] k;
    public int l;
    public int m;

    public xi2(int i, int i2, List list, long j, Object obj, hb3 hb3Var, fs fsVar, gs gsVar, r62 r62Var, boolean z) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = fsVar;
        this.f = gsVar;
        this.g = r62Var;
        this.h = z;
        this.i = hb3Var == hb3.n;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jg3 jg3Var = (jg3) list.get(i3);
            iMax = Math.max(iMax, !this.i ? jg3Var.o : jg3Var.n);
        }
        this.j = iMax;
        this.k = new int[this.b.size() * 2];
        this.m = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.l += i;
        int[] iArr = this.k;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.i;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.i;
        this.m = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            jg3 jg3Var = (jg3) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.k;
            if (z) {
                fs fsVar = this.e;
                if (fsVar == null) {
                    fz1.b("null horizontalAlignment");
                    er1.a();
                    return;
                } else {
                    iArr[i6] = fsVar.a(jg3Var.n, i2, this.g);
                    iArr[i6 + 1] = i;
                    i4 = jg3Var.o;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                gs gsVar = this.f;
                if (gsVar == null) {
                    fz1.b("null verticalAlignment");
                    er1.a();
                    return;
                } else {
                    iArr[i7] = Math.round((1.0f + gsVar.a) * ((i3 - jg3Var.o) / 2.0f));
                    i4 = jg3Var.n;
                }
            }
            i += i4;
        }
    }
}

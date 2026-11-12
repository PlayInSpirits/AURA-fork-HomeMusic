package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tm3 extends cu4 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final pd4 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final cu4[] k;
    public final Object[] l;
    public final HashMap m;

    public tm3(cu4[] r8, Object[] r9, pd4 r10) {
        this.f = r10;
        this.e = r10.b.length;
        int r11 = r8.length;
        this.k = r8;
        this.i = new int[r11];
        this.j = new int[r11];
        this.l = r9;
        this.m = new HashMap();
        int r12 = r8.length;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r0 >= r12) goto L5;
        cu4 r4 = r8[r0];
        this.k[r3] = r4;
        this.j[r3] = r1;
        this.i[r3] = r2;
        r1 = r1 + r4.o();
        r2 = r2 + this.k[r3].h();
        this.m.put(r9[r3], Integer.valueOf(r3));
        r0 = r0 + 1;
        r3 = r3 + 1;
        goto L3
    L5:
        this.g = r1;
        this.h = r2;
    }

    @Override // defpackage.cu4
    public final int a(boolean r5) {
        if (this.e == 0) goto L15;
        int r0 = 0;
        if (r5 == false) goto L11;
        int[] r2 = this.f.b;
        if (r2.length <= 0) goto L10;
        r0 = r2[0];
        goto L11
    L10:
        r0 = -1;
    L11:
        cu4[] r3 = this.k;
        if (r3[r0].p() == false) goto L17;
        r0 = q(r0, r5);
        if (r0 != (-1)) goto L11;
    L17:
        return r3[r0].a(r5) + this.j[r0];
    L15:
        return -1;
    }

    @Override // defpackage.cu4
    public final int b(Object r4) {
        if ((r4 instanceof Pair) == false) goto L13;
        Pair r5 = (Pair) r4;
        Object r0 = r5.first;
        Object r6 = r5.second;
        Integer r1 = (Integer) this.m.get(r0);
        if (r1 != null) goto L8;
        int r2 = -1;
    L9:
        if (r2 == (-1)) goto L13;
        int r7 = this.k[r2].b(r6);
        if (r7 == (-1)) goto L13;
        return this.i[r2] + r7;
    L8:
        r2 = r1.intValue();
    L13:
        return -1;
    }

    @Override // defpackage.cu4
    public final int c(boolean r5) {
        int r1 = this.e;
        if (r1 == 0) goto L15;
        if (r5 == false) goto L10;
        int[] r2 = this.f.b;
        if (r2.length <= 0) goto L9;
        int r3 = r2[r2.length - 1];
    L11:
        cu4[] r4 = this.k;
        if (r4[r3].p() == false) goto L17;
        r3 = r(r3, r5);
        if (r3 != (-1)) goto L11;
    L17:
        return r4[r3].c(r5) + this.j[r3];
    L9:
        r3 = -1;
        goto L11
    L10:
        r3 = r1 - 1;
    L15:
        return -1;
    }

    @Override // defpackage.cu4
    public final int e(int r8, int r9, boolean r10) {
        int[] r1 = this.j;
        int r2 = 0;
        int r0 = f35.e(r1, r8 + 1, false, false);
        int r3 = r1[r0];
        cu4[] r4 = this.k;
        cu4 r5 = r4[r0];
        int r11 = r8 - r3;
        if (r9 == 2) goto L6;
        r2 = r9;
    L6:
        int r12 = r5.e(r11, r2, r10);
        if (r12 != (-1)) goto L9;
        int r13 = q(r0, r10);
    L11:
        if (r13 == (-1)) goto L15;
        if (r4[r13].p() == false) goto L15;
        r13 = q(r13, r10);
    L15:
        if (r13 == (-1)) goto L18;
        int r7 = r1[r13];
        return r4[r13].a(r10) + r7;
    L18:
        if (r9 == 2) goto L20;
        return -1;
    L20:
        return a(r10);
    L9:
        return r3 + r12;
    }

    @Override // defpackage.cu4
    public final zt4 f(int r5, zt4 r6, boolean r7) {
        int[] r2 = this.i;
        int r0 = f35.e(r2, r5 + 1, false, false);
        int r1 = this.j[r0];
        this.k[r0].f(r5 - r2[r0], r6, r7);
        r6.c += r1;
        if (r7 == false) goto L5;
        Object r4 = this.l[r0];
        Object r8 = r6.b;
        r8.getClass();
        r6.b = Pair.create(r4, r8);
    L5:
        return r6;
    }

    @Override // defpackage.cu4
    public final zt4 g(Object r4, zt4 r5) {
        Pair r0 = (Pair) r4;
        Object r1 = r0.first;
        Object r2 = r0.second;
        Integer r3 = (Integer) this.m.get(r1);
        if (r3 != null) goto L5;
        int r6 = -1;
    L6:
        int r7 = this.j[r6];
        this.k[r6].g(r2, r5);
        r5.c += r7;
        r5.b = r4;
        return r5;
    L5:
        r6 = r3.intValue();
        goto L6
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.h;
    }

    @Override // defpackage.cu4
    public final int k(int r8, int r9, boolean r10) {
        int[] r1 = this.j;
        int r2 = 0;
        int r0 = f35.e(r1, r8 + 1, false, false);
        int r3 = r1[r0];
        cu4[] r4 = this.k;
        cu4 r5 = r4[r0];
        int r11 = r8 - r3;
        if (r9 == 2) goto L6;
        r2 = r9;
    L6:
        int r12 = r5.k(r11, r2, r10);
        if (r12 != (-1)) goto L9;
        int r13 = r(r0, r10);
    L11:
        if (r13 == (-1)) goto L15;
        if (r4[r13].p() == false) goto L15;
        r13 = r(r13, r10);
    L15:
        if (r13 == (-1)) goto L18;
        int r7 = r1[r13];
        return r4[r13].c(r10) + r7;
    L18:
        if (r9 == 2) goto L20;
        return -1;
    L20:
        return c(r10);
    L9:
        return r3 + r12;
    }

    @Override // defpackage.cu4
    public final Object l(int r4) {
        int[] r2 = this.i;
        int r0 = f35.e(r2, r4 + 1, false, false);
        int r1 = r2[r0];
        Object r5 = this.k[r0].l(r4 - r1);
        return Pair.create(this.l[r0], r5);
    }

    @Override // defpackage.cu4
    public final bu4 m(int r5, bu4 r6, long r7) {
        int[] r2 = this.j;
        int r0 = f35.e(r2, r5 + 1, false, false);
        int r1 = r2[r0];
        int r3 = this.i[r0];
        this.k[r0].m(r5 - r1, r6, r7);
        Object r4 = this.l[r0];
        Object r8 = bu4.p;
        Object r9 = r6.a;
        if (r8 == r9) goto L5;
        r4 = Pair.create(r4, r9);
    L5:
        r6.a = r4;
        r6.m += r3;
        r6.n += r3;
        return r6;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.g;
    }

    public final int q(int r2, boolean r3) {
        if (r3 == false) goto L10;
        pd4 r1 = this.f;
        int r4 = r1.c[r2] + 1;
        int[] r5 = r1.b;
        if (r4 < r5.length) goto L7;
        return -1;
    L7:
        return r5[r4];
    L10:
        if (r2 < (this.e - 1)) goto L12;
        return -1;
    L12:
        return r2 + 1;
    }

    public final int r(int r2, boolean r3) {
        if (r3 == false) goto L9;
        pd4 r1 = this.f;
        int r4 = r1.c[r2] - 1;
        if (r4 >= 0) goto L7;
        return -1;
    L7:
        return r1.b[r4];
    L9:
        if (r2 > 0) goto L11;
        return -1;
    L11:
        return r2 - 1;
    }

    public tm3(ArrayList r8, pd4 r9) {
        cu4[] r0 = new cu4[r8.size()];
        int r1 = r8.size();
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        Object r5 = r8.get(r4);
        r4 = r4 + 1;
        r0[r3] = ((tt2) r5).b();
        r3 = r3 + 1;
        goto L3
    L5:
        Object[] r6 = new Object[r8.size()];
        int r7 = r8.size();
        int r10 = 0;
    L6:
        if (r10 >= r7) goto L8;
        Object r11 = r8.get(r10);
        r10 = r10 + 1;
        r6[r2] = ((tt2) r11).a();
        r2 = r2 + 1;
        goto L6
    L8:
        this(r0, r6, r9);
    }
}

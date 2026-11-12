package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 {
    public final rg1 a;
    public w00 b;
    public boolean c;
    public final o02 d;
    public boolean e;
    public int f;
    public int g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;
    public int l;

    public k80(rg1 r1, w00 r2) {
        this.a = r1;
        this.b = r2;
        this.d = new o02();
        this.e = true;
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final void a() {
        c();
        ArrayList r0 = this.h;
        if (r0.isEmpty() == true) goto L6;
        r0.remove(r0.size() - 1);
        return;
    L6:
        this.g++;
    }

    public final void b() {
        int r0 = this.g;
        if (r0 <= 0) goto L5;
        ya3 r2 = this.b.n;
        r2.x0(ua3.f);
        r2.f[r2.g - r2.d[r2.e - 1].b] = r0;
        this.g = 0;
    L5:
        ArrayList r1 = this.h;
        if (r1.isEmpty() == true) goto L17;
        w00 r6 = this.b;
        int r3 = r1.size();
        Object[] r4 = new Object[r3];
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L10;
        r4[r5] = r1.get(r5);
        r5 = r5 + 1;
        goto L8
    L10:
        r6.getClass();
        if (r3 == 0) goto L14;
        ya3 r7 = r6.n;
        r7.x0(v93.f);
        rr2.R(r7, 0, r4);
    L14:
        r1.clear();
        return;
    }

    public final void c() {
        int r0 = this.l;
        if (r0 <= 0) goto L10;
        int r1 = this.i;
        if (r1 < 0) goto L7;
        b();
        ya3 r3 = this.b.n;
        r3.x0(ka3.f);
        int r4 = r3.g - r3.d[r3.e - 1].b;
        int[] r5 = r3.f;
        r5[r4] = r1;
        r5[r4 + 1] = r0;
        this.i = -1;
    L8:
        this.l = 0;
        return;
    L7:
        int r2 = this.k;
        int r6 = this.j;
        b();
        ya3 r7 = this.b.n;
        r7.x0(ga3.f);
        int r8 = r7.g - r7.d[r7.e - 1].b;
        int[] r9 = r7.f;
        r9[r8 + 1] = r2;
        r9[r8] = r6;
        r9[r8 + 2] = r0;
        this.j = -1;
        this.k = -1;
        goto L8
    }

    public final void d(boolean r6) {
        hg4 r0 = this.a.G;
        if (r6 == false) goto L5;
        int r7 = r0.i;
    L6:
        int r1 = r7 - this.f;
        if (r1 >= 0) goto L10;
        l80.a("Tried to seek backward");
    L10:
        if (r1 <= 0) goto L13;
        ya3 r2 = this.b.n;
        r2.x0(o93.f);
        r2.f[r2.g - r2.d[r2.e - 1].b] = r1;
        this.f = r7;
        return;
    L13:
        return;
    L5:
        r7 = r0.g;
        goto L6
    }

    public final void e(int r3, int r4) {
        if (r4 <= 0) goto L14;
        if (r3 < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        l80.a("Invalid remove index " + r3);
    L9:
        if (this.i != r3) goto L12;
        this.l += r4;
        return;
    L12:
        c();
        this.i = r3;
        this.l = r4;
        return;
    L5:
        r0 = false;
        goto L6
    }
}

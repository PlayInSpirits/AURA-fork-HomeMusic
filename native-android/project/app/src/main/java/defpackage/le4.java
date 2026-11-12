package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class le4 extends cu4 {
    public final yw1 e;
    public final int[] f;
    public final int[] g;
    public final HashMap h;

    public le4(List r11) {
        int r0 = r11.size();
        this.e = yw1.k(r11);
        this.f = new int[r0];
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = 1;
        if (r2 >= r0) goto L10;
        he4 r5 = (he4) r11.get(r2);
        this.f[r2] = r3;
        if (r5.p.isEmpty() == true) goto L9;
        r4 = r5.p.size();
    L9:
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L3
    L10:
        this.g = new int[r3];
        this.h = new HashMap();
        int r6 = 0;
        int r7 = 0;
    L11:
        if (r6 >= r0) goto L20;
        he4 r8 = (he4) r11.get(r6);
        int r9 = 0;
    L14:
        if (r8.p.isEmpty() == false) goto L16;
        int r10 = 1;
    L17:
        if (r9 >= r10) goto L19;
        this.h.put(he4.a(r8, r9), Integer.valueOf(r7));
        this.g[r7] = r6;
        r7 = r7 + 1;
        r9 = r9 + 1;
        goto L14
    L19:
        r6 = r6 + 1;
        goto L11
    L16:
        r10 = r8.p.size();
        goto L17
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        Integer r0 = (Integer) this.h.get(r1);
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.intValue();
    }

    @Override // defpackage.cu4
    public final zt4 f(int r13, zt4 r14, boolean r15) {
        int r3 = this.g[r13];
        int r16 = r13 - this.f[r3];
        he4 r12 = (he4) this.e.get(r3);
        yw1 r17 = r12.p;
        if (r17.isEmpty() == false) goto L5;
        Object r1 = r12.a;
        long r4 = r12.n;
        r14.i(r1, r1, r3, r12.m + r4, -r4, z5.f, r12.o);
        return r14;
    L5:
        je4 r18 = (je4) r17.get(r16);
        Object r2 = r18.a;
        r14.i(r2, Pair.create(r12.a, r2), r3, r18.b, r12.q[r16], r18.c, r18.d);
        return r14;
    }

    @Override // defpackage.cu4
    public final zt4 g(Object r2, zt4 r3) {
        Integer r4 = (Integer) this.h.get(r2);
        r4.getClass();
        f(r4.intValue(), r3, true);
        return r3;
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.g.length;
    }

    @Override // defpackage.cu4
    public final Object l(int r3) {
        int r0 = this.g[r3];
        int r4 = r3 - this.f[r0];
        return he4.a((he4) this.e.get(r0), r4);
    }

    @Override // defpackage.cu4
    public final bu4 m(int r25, bu4 r26, long r27) {
        he4 r2 = (he4) this.e.get(r25);
        int r17 = this.f[r25];
        yw1 r0 = r2.p;
        if (r0.isEmpty() == false) goto L5;
        int r1 = 1;
    L6:
        r26.b(r2.a, r2.c, r2.e, r2.g, r2.h, r2.i, r2.j, r2.k, r2.f, r2.l, r2.m, r17, (r17 + r1) - 1, r2.n);
        r26.j = r2.o;
        return r26;
    L5:
        r1 = r0.size();
        goto L6
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.e.size();
    }
}

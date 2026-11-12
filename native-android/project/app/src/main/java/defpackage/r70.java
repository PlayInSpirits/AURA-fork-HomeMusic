package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r70 implements wf1, xf1, yf1, zf1, ag1, bg1, cg1, dg1, hf1, jf1, lf1, mf1, nf1, of1, pf1, qf1, rf1, tf1, uf1 {
    public final int n;
    public final boolean o;
    public sf1 p;
    public lv3 q;
    public ArrayList r;

    public r70(int r1, boolean r2, sf1 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.xf1
    public final /* bridge */ /* synthetic */ Object a(Object r1, Object r2, Object r3) {
        return c(r1, (rg1) r2, ((Number) r3).intValue());
    }

    public final Object b(int r9, rg1 r10) {
        r10.S(this.n);
        f(r10);
        if (r10.e(this) == false) goto L5;
        int r0 = fh0.f(2, 0);
    L6:
        int r11 = r9 | r0;
        sf1 r1 = this.p;
        jz4.j(2, r1);
        Object r12 = ((wf1) r1).invoke(r10, Integer.valueOf(r11));
        lv3 r13 = r10.p();
        if (r13 == null) goto L9;
        int r2 = 2;
        Class<r70> r3 = r70.class;
        String r4 = "invoke";
        String r5 = "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;";
        r13.d = new q70(r2, this, r3, r4, r5, 8, 0);
    L9:
        return r12;
    L5:
        r0 = fh0.f(1, 0);
        goto L6
    }

    public final Object c(Object r4, rg1 r5, int r6) {
        r5.S(this.n);
        f(r5);
        if (r5.e(this) == false) goto L5;
        int r0 = fh0.f(2, 1);
    L6:
        sf1 r1 = this.p;
        jz4.j(3, r1);
        Object r2 = ((xf1) r1).a(r4, r5, Integer.valueOf(r0 | r6));
        lv3 r7 = r5.p();
        if (r7 == null) goto L9;
        r7.d = new p70(this, r4, r6);
    L9:
        return r2;
    L5:
        r0 = fh0.f(1, 1);
        goto L6
    }

    @Override // defpackage.yf1
    public final /* bridge */ /* synthetic */ Object d(Object r1, Object r2, Object r3, Object r4) {
        return e(r1, r2, (rg1) r3, ((Number) r4).intValue());
    }

    public final Object e(Object r4, Object r5, rg1 r6, int r7) {
        r6.S(this.n);
        f(r6);
        if (r6.e(this) == false) goto L5;
        int r0 = fh0.f(2, 2);
    L6:
        sf1 r1 = this.p;
        jz4.j(4, r1);
        Object r2 = ((yf1) r1).d(r4, r5, r6, Integer.valueOf(r0 | r7));
        lv3 r8 = r6.p();
        if (r8 == null) goto L9;
        r8.d = new o70(this, r4, r5, r7);
    L9:
        return r2;
    L5:
        r0 = fh0.f(1, 2);
        goto L6
    }

    public final void f(rg1 r5) {
        if (this.o == false) goto L40;
        lv3 r6 = r5.u();
        if (r6 == null) goto L41;
        r6.b |= 1;
        lv3 r0 = this.q;
        if (r0 != null) goto L9;
    L33:
        this.q = r6;
        return;
    L9:
        if (r0.a() == false) goto L33;
        if (r0 == r6) goto L33;
        if (h12.c(r0.c, r6.c) == true) goto L33;
        ArrayList r1 = this.r;
        if (r1 != null) goto L18;
        ArrayList r2 = new ArrayList();
        this.r = r2;
        r2.add(r6);
        return;
    L18:
        int r4 = r1.size();
        int r3 = 0;
    L19:
        if (r3 >= r4) goto L31;
        lv3 r7 = (lv3) r1.get(r3);
        if (r7 == null) goto L29;
        if (r7.a() == false) goto L29;
        if (r7 == r6) goto L29;
        if (h12.c(r7.c, r6.c) == true) goto L29;
        r3 = r3 + 1;
    L29:
        r1.set(r3, r6);
        return;
    L31:
        r1.add(r6);
        return;
    L41:
        return;
    }

    @Override // defpackage.wf1
    public final /* bridge */ /* synthetic */ Object invoke(Object r1, Object r2) {
        int r3 = ((Number) r2).intValue();
        return b(r3, (rg1) r1);
    }
}

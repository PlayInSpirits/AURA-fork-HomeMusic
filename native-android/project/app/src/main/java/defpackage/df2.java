package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 extends ig3 {
    public final /* synthetic */ int o;
    public final Object p;

    public /* synthetic */ df2(int r1, Object r2) {
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.oo0
    public final float J() {
        int r0 = this.o;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((ra) r1).getDensity().J();
    L7:
        return ((cf2) r1).J();
    }

    @Override // defpackage.ig3
    public float b(rp1 r8) {
        switch(this.o) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        wf1 r0 = r8.a;
        if (r0 != null) goto L58;
        cf2 r7 = (cf2) this.p;
        if (r7.B == true) goto L61;
        jx3 r1 = new jx3();
        r1.n = r7;
    L13:
        c6 r2 = ((cf2) r1.n).D;
        if (r2 == null) goto L19;
        int r3 = ti.m0((rp1[]) r2.b, r8);
        if (r3 < 0) goto L19;
        float r4 = ((float[]) r2.c)[r3];
    L20:
        boolean r5 = Float.isNaN(r4);
        Object r6 = r1.n;
        if (r5 == false) goto L22;
        cf2 r9 = (cf2) r6;
        wf1 r10 = r9.u;
        if (r10 == null) goto L50;
        if1 r11 = r9.v;
        if (r11 == null) goto L50;
        if (((Boolean) r11.invoke(r8)).booleanValue() != true) goto L50;
        cf2 r12 = (cf2) r1.n;
        w03 r13 = r12.x;
        if (r13 != null) goto L32;
        long[] r14 = v54.a;
        r13 = new w03();
        r12.x = r13;
    L32:
        Object r15 = r13.g(r8);
        if (r15 != null) goto L35;
        r15 = new lg3(r12.h0(), r12, r8);
        r13.l(r8, r15);
    L35:
        lg3 r16 = (lg3) r15;
        r16.n = r12.h0();
        ub3 r17 = r7.g0().A;
        if (r17 == null) goto L40;
        wb3 r18 = ((ra) r17).getSnapshotObserver();
        if (r18 == null) goto L40;
        r18.a.e(r16, cf2.G, new jo(r10, r1, r8, 6));
    L40:
        ((cf2) r1.n).S(r7.g0(), r8);
        c6 r19 = ((cf2) r1.n).D;
        if (r19 == null) goto L46;
        int r20 = ti.m0((rp1[]) r19.b, r8);
        if (r20 < 0) goto L46;
        float r21 = ((float[]) r19.c)[r20];
    L48:
        if (Float.isNaN(r21) == true) goto L50;
        return r8.a(r21, ((cf2) r1.n).e0(), r7.e0());
    L46:
        r21 = Float.NaN;
    L50:
        cf2 r22 = ((cf2) r1.n).i0();
        if (r22 == null) goto L52;
        r1.n = r22;
        goto L13
    L52:
        ((cf2) r1.n).S(r7.g0(), r8);
        return Float.NaN;
    L22:
        ((cf2) r6).S(r7.g0(), r8);
        return r8.a(r4, ((cf2) r1.n).e0(), r7.e0());
    L19:
        r4 = Float.NaN;
        goto L20
    L61:
        return Float.NaN;
    L58:
        return ((Number) r0.invoke(this, Float.valueOf(Float.NaN))).floatValue();
    L5:
        return super.b(r8);
    }

    @Override // defpackage.ig3
    public final r62 c() {
        int r0 = this.o;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((ra) r1).getLayoutDirection();
    L7:
        return ((cf2) r1).getLayoutDirection();
    }

    @Override // defpackage.ig3
    public final int e() {
        int r0 = this.o;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((ra) r1).getRoot().R.p.n;
    L7:
        return ((cf2) r1).G();
    }

    @Override // defpackage.oo0
    public final float g() {
        int r0 = this.o;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((ra) r1).getDensity().g();
    L7:
        return ((cf2) r1).g();
    }
}

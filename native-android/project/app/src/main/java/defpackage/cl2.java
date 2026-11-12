package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl2 implements xl2, qc2, rc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;

    public /* synthetic */ cl2(bm2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.xl2
    public void d(pu1 r3, int r4) {
        int r0 = this.n;
        bm2 r2 = this.o;
        switch(r0) {
            case 0: goto L35;
            case 1: goto L4;
            case 2: goto L4;
            case 3: goto L33;
            case 4: goto L31;
            case 5: goto L29;
            case 6: goto L27;
            case 7: goto L25;
            case 8: goto L23;
            case 9: goto L21;
            case 10: goto L19;
            case 11: goto L17;
            case 12: goto L15;
            case 13: goto L10;
            case 14: goto L8;
            case 15: goto L6;
            default: goto L4;
        };
    L4:
        r3.A0(r2.c, r4);
        return;
    L6:
        r3.g0(r2.c, r4);
        return;
    L8:
        r3.v(r2.c, r4);
        return;
    L10:
        cb4 r1 = r2.n;
        r1.getClass();
        int r5 = r1.a.f();
        mm2 r6 = r2.c;
        if (r5 < 6) goto L13;
        r3.k(r6, r4);
        return;
    L13:
        r3.x(r6, r4, 0.0f);
        return;
    L15:
        r3.y(r2.c, r4);
        return;
    L17:
        r3.H(r2.c, r4);
        return;
    L19:
        r3.v0(r2.c, r4);
        return;
    L21:
        r3.W(r2.c, r4);
        return;
    L23:
        r3.B(r2.c, r4);
        return;
    L25:
        r3.a0(r2.c, r4);
        return;
    L27:
        r3.e0(r2.c, r4);
        return;
    L29:
        r3.C0(r2.c, r4);
        return;
    L31:
        r3.q(r2.c, r4);
        return;
    L33:
        r3.d(r2.c, r4);
        return;
    L35:
        r3.R(r2.c, r4);
    }

    @Override // defpackage.rc2
    public void f(Object r2, w71 r3) {
        ((oi3) r2).B(this.o.f1(), new ni3(r3));
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        int r0 = this.n;
        bm2 r1 = this.o;
        oi3 r3 = (oi3) r2;
        switch(r0) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r3.O(r1.z);
        return;
    L6:
        r3.O(r1.z);
    }
}

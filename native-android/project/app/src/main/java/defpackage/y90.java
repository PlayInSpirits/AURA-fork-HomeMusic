package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;
    public final /* synthetic */ fr2 p;

    public /* synthetic */ y90(tn2 r1, fr2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        fr2 r5 = this.p;
        tn2 r6 = this.o;
        switch(r0) {
            case 0: goto L23;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        r6.g.M0(r5, Integer.MIN_VALUE);
        return;
    L6:
        r6.g.M0(r5, Integer.MIN_VALUE);
        return;
    L8:
        r6.g.O0(r5, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
        return;
    L10:
        r6.g.O0(r5, Integer.MIN_VALUE, 3, kt2.Q0(new zr2(14)));
        return;
    L12:
        r6.g.O0(r5, Integer.MIN_VALUE, 11, kt2.Q0(new zr2(5)));
        return;
    L14:
        r6.g.O0(r5, Integer.MIN_VALUE, 12, kt2.Q0(new zr2(9)));
        return;
    L16:
        r6.g.O0(r5, Integer.MIN_VALUE, 7, kt2.Q0(new zr2(6)));
        return;
    L18:
        r6.g.O0(r5, Integer.MIN_VALUE, 9, kt2.Q0(new zr2(10)));
        return;
    L20:
        r6.g.O0(r5, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
        return;
    L23:
        if (r6.l() == true) goto L40;
        nl1 r1 = r6.F;
        er2 r2 = r5.d;
        r2.getClass();
        o15 r3 = jx1.k(r1.l(r2)).h();
    L27:
        if (r3.hasNext() == false) goto L30;
        String r4 = (String) r3.next();
        er2 r7 = r5.d;
        r7.getClass();
        r6.E.remove(r4, r5);
        r1.remove(r7, r4);
        goto L27
    L30:
        if (r6.y == true) goto L32;
    L37:
        r6.e.getClass();
        return;
    L32:
        if (tn2.m(r5) == false) goto L35;
        return;
    L35:
        if (r6.k(r5) == false) goto L37;
        r6.y = false;
        goto L37
    }
}

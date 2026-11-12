package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hs2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ al3 o;
    public final /* synthetic */ int p;

    public /* synthetic */ hs2(al3 r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r2 = this.p;
        al3 r4 = this.o;
        switch(r0) {
            case 0: goto L41;
            default: goto L5;
        };
    L5:
        if (r4.S0(26) == true) goto L10;
        if (r4.S0(34) == true) goto L10;
        return;
    L10:
        if (r2 == (-100)) goto L36;
        if (r2 == (-1)) goto L32;
        if (r2 == 1) goto L28;
        if (r2 == 100) goto L24;
        if (r2 == 101) goto L20;
        xa3.m(r2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
        return;
    L20:
        if (r4.S0(34) == false) goto L22;
        r4.E(1, !r4.b1());
        return;
    L22:
        r4.q0(!r4.b1());
        return;
    L24:
        if (r4.S0(34) == false) goto L26;
        r4.E(1, false);
        return;
    L26:
        r4.q0(false);
        return;
    L28:
        if (r4.S0(34) == false) goto L30;
        r4.J(1);
        return;
    L30:
        r4.C0();
        return;
    L32:
        if (r4.S0(34) == false) goto L34;
        r4.d0(1);
        return;
    L34:
        r4.G();
        return;
    L36:
        if (r4.S0(34) == false) goto L38;
        r4.E(1, true);
        return;
    L38:
        r4.q0(true);
        return;
    L41:
        if (r4.S0(25) == true) goto L46;
        if (r4.S0(33) == true) goto L46;
        return;
    L46:
        if (r4.S0(33) == false) goto L48;
        r4.H(r2, 1);
        return;
    L48:
        r4.G0(r2);
    }
}

package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bj2 o;
    public final /* synthetic */ ArrayList p;
    public final /* synthetic */ int q;
    public final /* synthetic */ long r;

    public /* synthetic */ wn2(bj2 r1, ArrayList r2, int r3, long r4, int r6) {
        this.n = r6;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        long r2 = this.r;
        int r4 = this.q;
        ArrayList r5 = this.p;
        bj2 r10 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (u52.c().a == true) goto L32;
        bo2.b.set(true);
        r10.T(r5, r4, r2);
        r10.b();
        r10.v(new zn2(r10, r4, r2));
        return;
    L32:
        return;
    L10:
        if (u52.c().a == false) goto L13;
        return;
    L13:
        if (r10.Q0() > 0) goto L34;
        r10.r();
        rk2 r1 = r10.d;
        r10.c1();
        int r7 = 0;
    L17:
        if (r7 >= r5.size()) goto L24;
        if (r5.get(r7) == null) goto L21;
        boolean r8 = true;
    L22:
        rr2.j(r7, "items must not contain null, index=%s", r8);
        r7 = r7 + 1;
        goto L17
    L21:
        r8 = false;
        goto L22
    L24:
        if (r1.Y() == true) goto L26;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
    L27:
        r10.n(r4, r2);
        r10.b();
        return;
    L26:
        r1.L0(r5);
        goto L27
    }
}

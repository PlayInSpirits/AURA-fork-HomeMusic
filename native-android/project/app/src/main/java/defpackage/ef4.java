package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 implements q44 {
    public int n;
    public boolean o;
    public final /* synthetic */ gf4 p;

    public ef4(gf4 r1) {
        this.p = r1;
    }

    public final void a() {
        if (this.o == true) goto L6;
        gf4 r0 = this.p;
        ue1 r1 = r0.r;
        r1.i(new bt2(r1, new un2(1, lw2.h(r0.w.n), r0.w, 0, null, f35.i0(0), -9223372036854775807L)));
        this.o = true;
        return;
    }

    @Override // defpackage.q44
    public final boolean c() {
        return this.p.y;
    }

    @Override // defpackage.q44
    public final void s() {
        gf4 r2 = this.p;
        if (r2.x == true) goto L15;
        i61 r3 = r2.v;
        IOException r0 = (IOException) r3.q;
        if (r0 != null) goto L14;
        id2 r4 = (id2) r3.p;
        if (r4 == null) goto L16;
        int r1 = r4.n;
        IOException r5 = r4.r;
        if (r5 != null) goto L11;
        return;
    L11:
        if (r4.s <= r1) goto L18;
        throw r5;
    L18:
        return;
    L16:
        return;
    L14:
        throw r0;
    }

    @Override // defpackage.q44
    public final int t(gp3 r10, cj0 r11, int r12) {
        a();
        gf4 r0 = this.p;
        boolean r1 = r0.y;
        if (r1 == true) goto L5;
    L7:
        int r3 = this.n;
        if (r3 != 2) goto L12;
        r11.a(4);
        return -4;
    L12:
        if ((r12 & 2) != 0) goto L25;
        if (r3 == 0) goto L25;
        if (r1 == true) goto L18;
        return -3;
    L18:
        r0.z.getClass();
        r11.a(1);
        r11.t = 0;
        if ((r12 & 4) != 0) goto L22;
        r11.t(r0.A);
        r11.r.put(r0.z, 0, r0.A);
    L22:
        if ((r12 & 1) != 0) goto L24;
        this.n = 2;
    L24:
        return -4;
    L25:
        r10.p = r0.w;
        this.n = 1;
        return -5;
    L5:
        if (r0.z != null) goto L7;
        this.n = 2;
        goto L7
    }

    @Override // defpackage.q44
    public final int u(long r3) {
        a();
        if (r3 > 0) goto L5;
        return 0;
    L5:
        if (this.n == 2) goto L10;
        this.n = 2;
        return 1;
    L10:
        return 0;
    }
}

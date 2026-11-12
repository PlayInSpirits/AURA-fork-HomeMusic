package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow4 implements q44 {
    public q44 n;
    public final /* synthetic */ pw4 o;

    public ow4(pw4 r1, q44 r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.q44
    public final boolean c() {
        q44 r0 = this.n;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.c();
    }

    @Override // defpackage.q44
    public final void s() {
        q44 r0 = this.n;
        if (r0 == null) goto L6;
        r0.s();
        return;
    }

    @Override // defpackage.q44
    public final int t(gp3 r5, cj0 r6, int r7) {
        r5.getClass();
        r6.getClass();
        q44 r0 = this.n;
        if (r0 != null) goto L6;
        return -3;
    L6:
        int r8 = r0.t(r5, r6, r7);
        if (r8 == (-4)) goto L9;
    L11:
        return r8;
    L9:
        if (r6.d(4) == true) goto L11;
        r6.t += this.o.s;
        goto L11
    }

    @Override // defpackage.q44
    public final int u(long r4) {
        q44 r0 = this.n;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.u(r4 - this.o.s);
    }
}

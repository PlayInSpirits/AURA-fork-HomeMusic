package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements yj2 {
    public final zq2 n;
    public final q41 o;
    public kq p;
    public yj2 q;
    public boolean r;
    public boolean s;

    public xl0(q41 r1, vp4 r2) {
        this.o = r1;
        this.n = new zq2(r2);
        this.r = true;
    }

    public final void a(kq r3) {
        yj2 r0 = r3.g();
        if (r0 == null) goto L11;
        yj2 r1 = this.q;
        if (r0 == r1) goto L12;
        if (r1 != null) goto L10;
        this.q = r0;
        this.p = r3;
        r0.d((qh3) this.n.r);
        return;
    L10:
        throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    L12:
        return;
    }

    @Override // defpackage.yj2
    public final void d(qh3 r2) {
        yj2 r0 = this.q;
        if (r0 == null) goto L5;
        r0.d(r2);
        r2 = this.q.i();
    L5:
        this.n.d(r2);
    }

    @Override // defpackage.yj2
    public final qh3 i() {
        yj2 r0 = this.q;
        if (r0 == null) goto L7;
        return r0.i();
    L7:
        return (qh3) this.n.r;
    }

    @Override // defpackage.yj2
    public final long j() {
        if (this.r == true) goto L5;
        yj2 r2 = this.q;
        r2.getClass();
        return r2.j();
    L5:
        return this.n.j();
    }

    @Override // defpackage.yj2
    public final boolean k() {
        if (this.r == false) goto L6;
        this.n.getClass();
        return false;
    L6:
        yj2 r1 = this.q;
        r1.getClass();
        return r1.k();
    }
}
